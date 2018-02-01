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
import com.league.shop.domain.AttachmentDO;
import com.league.shop.service.AttachmentService;

/**
 * 附件表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
 
@Controller
@RequestMapping("/shop/attachment")
public class AttachmentController {
	@Autowired
	private AttachmentService attachmentService;
	
	@GetMapping()
	@RequiresPermissions("shop:attachment:attachment")
	String Attachment(){
	    return "shop/admin/attachment/attachment";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:attachment:attachment")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AttachmentDO> attachmentList = attachmentService.list(query);
		int total = attachmentService.count(query);
		PageUtils pageUtils = new PageUtils(attachmentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:attachment:add")
	String add(){
	    return "shop/admin/attachment/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:attachment:edit")
	String edit(@PathVariable("id") Long id,Model model){
		AttachmentDO attachment = attachmentService.get(id);
		model.addAttribute("attachment", attachment);
	    return "shop/admin/attachment/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:attachment:add")
	public R save( AttachmentDO attachment){
		if(attachmentService.save(attachment)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:attachment:edit")
	public R update( AttachmentDO attachment){
		attachmentService.update(attachment);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:attachment:remove")
	public R remove( Long id){
		if(attachmentService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:attachment:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		attachmentService.batchRemove(ids);
		return R.ok();
	}
	
}
