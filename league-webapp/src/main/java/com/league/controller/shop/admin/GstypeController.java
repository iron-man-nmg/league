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

import com.league.admin.service.shop.GstypeService;
import com.league.common.utils.PageUtils;
import com.league.common.utils.Query;
import com.league.common.utils.R;
import com.league.dal.shop.domain.GstypeDO;

/**
 * 商品类型
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */

@Controller
@RequestMapping("/shop/gstype")
public class GstypeController {

    @Autowired
    private GstypeService gstypeService;

    @GetMapping()
    @RequiresPermissions("shop:gstype:gstype")
    String Gstype() {
        return "shop/admin/gstype/gstype";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("shop:gstype:gstype")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);
        List<GstypeDO> gstypeList = gstypeService.list(query);
        int total = gstypeService.count(query);
        PageUtils pageUtils = new PageUtils(gstypeList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("shop:gstype:add")
    String add() {
        return "shop/admin/gstype/add";
    }

    @GetMapping("/edit/{id}")
    @RequiresPermissions("shop:gstype:edit")
    String edit(@PathVariable("id") Long id, Model model) {
        GstypeDO gstype = gstypeService.get(id);
        model.addAttribute("gstype", gstype);
        return "shop/admin/gstype/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("shop:gstype:add")
    public R save(GstypeDO gstype) {
        if (gstypeService.save(gstype) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("shop:gstype:edit")
    public R update(GstypeDO gstype) {
        gstypeService.update(gstype);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("shop:gstype:remove")
    public R remove(Long id) {
        if (gstypeService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    @RequiresPermissions("shop:gstype:batchRemove")
    public R remove(@RequestParam("ids[]") Long[] ids) {
        gstypeService.batchRemove(ids);
        return R.ok();
    }

}
