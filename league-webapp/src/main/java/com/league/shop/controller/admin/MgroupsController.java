package com.league.shop.controller.admin;

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

import com.league.common.utils.PageUtils;
import com.league.common.utils.Query;
import com.league.common.utils.R;
import com.league.shop.domain.MgroupsDO;
import com.league.shop.service.MgroupsService;

/**
 * 管理员组
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
 
@Controller
@RequestMapping("/shop/mgroups")
public class MgroupsController {
	@Autowired
	private MgroupsService mgroupsService;
	
	@GetMapping()
	@RequiresPermissions("shop:mgroups:mgroups")
	String Mgroups(){
	    return "shop/admin/mgroups/mgroups";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:mgroups:mgroups")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MgroupsDO> mgroupsList = mgroupsService.list(query);
		int total = mgroupsService.count(query);
		PageUtils pageUtils = new PageUtils(mgroupsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:mgroups:add")
	String add(){
	    return "shop/admin/mgroups/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:mgroups:edit")
	String edit(@PathVariable("id") Long id,Model model){
		MgroupsDO mgroups = mgroupsService.get(id);
		model.addAttribute("mgroups", mgroups);
	    return "shop/admin/mgroups/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:mgroups:add")
	public R save( MgroupsDO mgroups){
		if(mgroupsService.save(mgroups)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:mgroups:edit")
	public R update( MgroupsDO mgroups){
		mgroupsService.update(mgroups);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:mgroups:remove")
	public R remove( Long id){
		if(mgroupsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:mgroups:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		mgroupsService.batchRemove(ids);
		return R.ok();
	}
	
}
