package com.league.dal.shop.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品分类表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class CategoryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//父ID
	private Long pid;
	//路径
	private String nodepath;
	//类型
	private String nodetype;
	//语言
	private Long locale;
	//图像
	private Long attachment;
	//名称
	private String name;
	//描述
	private String details;
	//排序
	private Integer csort;
	//商品类型
	private Long gstype;
	//META_KEYWORDS
	private String mkeywords;
	//META_DESCRIPTION
	private String mdescription;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：父ID
	 */
	public void setPid(Long pid) {
		this.pid = pid;
	}
	/**
	 * 获取：父ID
	 */
	public Long getPid() {
		return pid;
	}
	/**
	 * 设置：路径
	 */
	public void setNodepath(String nodepath) {
		this.nodepath = nodepath;
	}
	/**
	 * 获取：路径
	 */
	public String getNodepath() {
		return nodepath;
	}
	/**
	 * 设置：类型
	 */
	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}
	/**
	 * 获取：类型
	 */
	public String getNodetype() {
		return nodetype;
	}
	/**
	 * 设置：语言
	 */
	public void setLocale(Long locale) {
		this.locale = locale;
	}
	/**
	 * 获取：语言
	 */
	public Long getLocale() {
		return locale;
	}
	/**
	 * 设置：图像
	 */
	public void setAttachment(Long attachment) {
		this.attachment = attachment;
	}
	/**
	 * 获取：图像
	 */
	public Long getAttachment() {
		return attachment;
	}
	/**
	 * 设置：名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：描述
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * 获取：描述
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * 设置：排序
	 */
	public void setCsort(Integer csort) {
		this.csort = csort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getCsort() {
		return csort;
	}
	/**
	 * 设置：商品类型
	 */
	public void setGstype(Long gstype) {
		this.gstype = gstype;
	}
	/**
	 * 获取：商品类型
	 */
	public Long getGstype() {
		return gstype;
	}
	/**
	 * 设置：META_KEYWORDS
	 */
	public void setMkeywords(String mkeywords) {
		this.mkeywords = mkeywords;
	}
	/**
	 * 获取：META_KEYWORDS
	 */
	public String getMkeywords() {
		return mkeywords;
	}
	/**
	 * 设置：META_DESCRIPTION
	 */
	public void setMdescription(String mdescription) {
		this.mdescription = mdescription;
	}
	/**
	 * 获取：META_DESCRIPTION
	 */
	public String getMdescription() {
		return mdescription;
	}
}
