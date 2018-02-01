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
import com.league.shop.domain.BrandDO;
import com.league.shop.service.BrandService;

/**
 * 品牌表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
 
@Controller
@RequestMapping("/shop/brand")
public class BrandController {
	@Autowired
	private BrandService brandService;
	
	@GetMapping()
	@RequiresPermissions("shop:brand:brand")
	String Brand(){
	    return "shop/admin/brand/brand";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:brand:brand")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<BrandDO> brandList = brandService.list(query);
		int total = brandService.count(query);
		PageUtils pageUtils = new PageUtils(brandList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:brand:add")
	String add(){
	    return "shop/admin/brand/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:brand:edit")
	String edit(@PathVariable("id") Long id,Model model){
		BrandDO brand = brandService.get(id);
		model.addAttribute("brand", brand);
	    return "shop/admin/brand/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:brand:add")
	public R save( BrandDO brand){
		if(brandService.save(brand)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:brand:edit")
	public R update( BrandDO brand){
		brandService.update(brand);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:brand:remove")
	public R remove( Long id){
		if(brandService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:brand:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		brandService.batchRemove(ids);
		return R.ok();
	}
	
}
