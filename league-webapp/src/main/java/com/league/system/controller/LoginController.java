package com.league.system.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.league.common.annotation.Log;
import com.league.common.controller.BaseController;
import com.league.common.domain.FileDO;
import com.league.common.domain.Tree;
import com.league.common.service.FileService;
import com.league.common.utils.HttpUtil;
import com.league.common.utils.MD5Utils;
import com.league.common.utils.R;
import com.league.common.utils.ShiroUtils;
import com.league.system.domain.MenuDO;
import com.league.system.service.MenuService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MenuService          menuService;
    @Autowired
    FileService          fileService;

    @GetMapping({ "/", "" })
    String portalIndex(Model model) {
        return "/portal/index";
    }

    @Log("请求访问主页")
    @GetMapping({ "/index" })
    String index(Model model) {
        List<Tree<MenuDO>> menus = menuService.listMenuTree(getUserId());
        model.addAttribute("menus", menus);
        model.addAttribute("name", getUser().getName());
        FileDO fileDO = fileService.get(getUser().getPicId());
        if (fileDO != null && fileDO.getUrl() != null) {
            if (fileService.isExist(fileDO.getUrl())) {
                model.addAttribute("picUrl", fileDO.getUrl());
            } else {
                model.addAttribute("picUrl", "/img/photo_s.jpg");
            }
        } else {
            model.addAttribute("picUrl", "/img/photo_s.jpg");
        }
        model.addAttribute("username", getUser().getUsername());
        return "index_v1";
    }

    @GetMapping("/login")
    String login(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }

    @Log("登录")
    @PostMapping("/login")
    @ResponseBody
    R ajaxLogin(String username, String password) {
        password = MD5Utils.encrypt(username, password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return R.ok();
        } catch (AuthenticationException e) {
            return R.error("用户或密码错误");
        }
    }

    @GetMapping("/logout")
    String logout() {
        ShiroUtils.logout();
        return "redirect:/login";
    }

    @GetMapping("/main")
    String main() {
        return "main";
    }

    @GetMapping("/403")
    String error403() {
        return "403";
    }

}
