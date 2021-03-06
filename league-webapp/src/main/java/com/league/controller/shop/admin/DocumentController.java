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

import com.league.admin.service.shop.DocumentService;
import com.league.common.utils.PageUtils;
import com.league.common.utils.Query;
import com.league.common.utils.R;
import com.league.dal.shop.domain.DocumentDO;

/**
 * 文档表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
 
@Controller
@RequestMapping("/shop/document")
public class DocumentController {
	@Autowired
	private DocumentService documentService;
	
	@GetMapping()
	@RequiresPermissions("shop:document:document")
	String Document(){
	    return "shop/admin/document/document";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:document:document")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DocumentDO> documentList = documentService.list(query);
		int total = documentService.count(query);
		PageUtils pageUtils = new PageUtils(documentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:document:add")
	String add(){
	    return "shop/admin/document/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:document:edit")
	String edit(@PathVariable("id") Long id,Model model){
		DocumentDO document = documentService.get(id);
		model.addAttribute("document", document);
	    return "shop/admin/document/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:document:add")
	public R save( DocumentDO document){
		if(documentService.save(document)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:document:edit")
	public R update( DocumentDO document){
		documentService.update(document);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:document:remove")
	public R remove( Long id){
		if(documentService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:document:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		documentService.batchRemove(ids);
		return R.ok();
	}
	
}
