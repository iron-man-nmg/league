package com.league.controller.shop.admin;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.league.admin.service.shop.LocaleService;
import com.league.common.utils.PageUtils;
import com.league.common.utils.Query;
import com.league.common.utils.R;
import com.league.dal.shop.domain.LocaleDO;

/**
 * 语言表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */

@Controller
@RequestMapping("/shop/locale")
public class LocaleController {

    @Autowired
    private LocaleService localeService;

    @GetMapping()
    @RequiresPermissions("shop:locale:locale")
    String Locale() {
        return "shop/admin/locale/locale";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("shop:locale:locale")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);
        List<LocaleDO> localeList = localeService.list(query);
        int total = localeService.count(query);
        PageUtils pageUtils = new PageUtils(localeList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("shop:locale:add")
    String add() {
        return "shop/admin/locale/add";
    }

    @GetMapping("/edit/{id}")
    @RequiresPermissions("shop:locale:edit")
    String edit(@PathVariable("id") Long id, Model model) {
        LocaleDO locale = localeService.get(id);
        model.addAttribute("locale", locale);
        return "shop/admin/locale/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("shop:locale:add")
    public R save(LocaleDO locale) {
        if (localeService.save(locale) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("shop:locale:edit")
    public R update(LocaleDO locale) {
        localeService.update(locale);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("shop:locale:remove")
    public R remove(Long id) {
        if (localeService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    @RequiresPermissions("shop:locale:batchRemove")
    public R remove(@RequestParam("ids[]") Long[] ids) {
        localeService.batchRemove(ids);
        return R.ok();
    }

}
