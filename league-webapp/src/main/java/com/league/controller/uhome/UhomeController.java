package com.league.controller.uhome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.league.admin.service.common.FileService;
import com.league.admin.service.userrole.MenuService;
import com.league.common.annotation.Log;
import com.league.common.controller.BaseController;
import com.league.dal.common.domain.FileDO;
import com.league.dal.common.domain.Tree;
import com.league.dal.userrole.domain.MenuDO;

import java.util.List;

@Controller
@RequestMapping("/uhome")
public class UhomeController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MenuService          menuService;
    @Autowired
    FileService          fileService;

    @Log("请求访问主页")
    @GetMapping({ "/", "" })
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
        return "index_uhome";
    }
}
