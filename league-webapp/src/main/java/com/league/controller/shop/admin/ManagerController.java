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

import com.league.admin.service.shop.ManagerService;
import com.league.common.utils.PageUtils;
import com.league.common.utils.Query;
import com.league.common.utils.R;
import com.league.dal.shop.domain.ManagerDO;

/**
 * 管理员表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
 
@Controller
@RequestMapping("/shop/manager")
public class ManagerController {
	@Autowired
	private ManagerService managerService;
	
	@GetMapping()
	@RequiresPermissions("shop:manager:manager")
	String Manager(){
	    return "shop/admin/manager/manager";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:manager:manager")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ManagerDO> managerList = managerService.list(query);
		int total = managerService.count(query);
		PageUtils pageUtils = new PageUtils(managerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:manager:add")
	String add(){
	    return "shop/admin/manager/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:manager:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ManagerDO manager = managerService.get(id);
		model.addAttribute("manager", manager);
	    return "shop/admin/manager/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:manager:add")
	public R save( ManagerDO manager){
		if(managerService.save(manager)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:manager:edit")
	public R update( ManagerDO manager){
		managerService.update(manager);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:manager:remove")
	public R remove( Long id){
		if(managerService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:manager:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		managerService.batchRemove(ids);
		return R.ok();
	}
	
}
