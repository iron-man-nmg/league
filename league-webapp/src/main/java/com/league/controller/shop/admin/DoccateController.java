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

import com.league.admin.service.shop.DoccateService;
import com.league.common.utils.PageUtils;
import com.league.common.utils.Query;
import com.league.common.utils.R;
import com.league.dal.shop.domain.DoccateDO;

/**
 * 信息分类表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */

@Controller
@RequestMapping("/shop/doccate")
public class DoccateController {

    @Autowired
    private DoccateService doccateService;

    @GetMapping()
    @RequiresPermissions("shop:doccate:doccate")
    String Doccate() {
        return "shop/admin/doccate/doccate";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("shop:doccate:doccate")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);
        List<DoccateDO> doccateList = doccateService.list(query);
        int total = doccateService.count(query);
        PageUtils pageUtils = new PageUtils(doccateList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("shop:doccate:add")
    String add() {
        return "shop/admin/doccate/add";
    }

    @GetMapping("/edit/{id}")
    @RequiresPermissions("shop:doccate:edit")
    String edit(@PathVariable("id") Long id, Model model) {
        DoccateDO doccate = doccateService.get(id);
        model.addAttribute("doccate", doccate);
        return "shop/admin/doccate/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("shop:doccate:add")
    public R save(DoccateDO doccate) {
        if (doccateService.save(doccate) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("shop:doccate:edit")
    public R update(DoccateDO doccate) {
        doccateService.update(doccate);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("shop:doccate:remove")
    public R remove(Long id) {
        if (doccateService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    @RequiresPermissions("shop:doccate:batchRemove")
    public R remove(@RequestParam("ids[]") Long[] ids) {
        doccateService.batchRemove(ids);
        return R.ok();
    }

}
