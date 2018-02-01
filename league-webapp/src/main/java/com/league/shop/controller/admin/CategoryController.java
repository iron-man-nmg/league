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
import com.league.shop.domain.CategoryDO;
import com.league.shop.service.CategoryService;

/**
 * 商品分类表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
 
@Controller
@RequestMapping("/shop/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping()
	@RequiresPermissions("shop:category:category")
	String Category(){
	    return "shop/admin/category/category";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:category:category")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CategoryDO> categoryList = categoryService.list(query);
		int total = categoryService.count(query);
		PageUtils pageUtils = new PageUtils(categoryList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:category:add")
	String add(){
	    return "shop/admin/category/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:category:edit")
	String edit(@PathVariable("id") Long id,Model model){
		CategoryDO category = categoryService.get(id);
		model.addAttribute("category", category);
	    return "shop/admin/category/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:category:add")
	public R save( CategoryDO category){
		if(categoryService.save(category)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:category:edit")
	public R update( CategoryDO category){
		categoryService.update(category);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:category:remove")
	public R remove( Long id){
		if(categoryService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:category:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		categoryService.batchRemove(ids);
		return R.ok();
	}
	
}
