package com.league.dal.shop.domain;


import java.io.Serializable;
import java.util.Date;


/**
 * 附件表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class AttachmentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//文件名称
	private String name;
	//附件类型
	private String ftype;
	//状态
	private String status;
	//排序
	private Integer sort;
	//文件路径
	private String path;
	//原文件名
	private String oname;
	//描述
	private String details;
	//上传者
	private Long manager;
	//所属商品
	private Long goods;
	//所属文章
	private Long document;
	//点击此附件后转向URL
	private String url;
	//上传时间
	private Date ctime;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：文件名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：文件名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：附件类型
	 */
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	/**
	 * 获取：附件类型
	 */
	public String getFtype() {
		return ftype;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 设置：文件路径
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：文件路径
	 */
	public String getPath() {
		return path;
	}
	/**
	 * 设置：原文件名
	 */
	public void setOname(String oname) {
		this.oname = oname;
	}
	/**
	 * 获取：原文件名
	 */
	public String getOname() {
		return oname;
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
	 * 设置：上传者
	 */
	public void setManager(Long manager) {
		this.manager = manager;
	}
	/**
	 * 获取：上传者
	 */
	public Long getManager() {
		return manager;
	}
	/**
	 * 设置：所属商品
	 */
	public void setGoods(Long goods) {
		this.goods = goods;
	}
	/**
	 * 获取：所属商品
	 */
	public Long getGoods() {
		return goods;
	}
	/**
	 * 设置：所属文章
	 */
	public void setDocument(Long document) {
		this.document = document;
	}
	/**
	 * 获取：所属文章
	 */
	public Long getDocument() {
		return document;
	}
	/**
	 * 设置：点击此附件后转向URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：点击此附件后转向URL
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：上传时间
	 */
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	/**
	 * 获取：上传时间
	 */
	public Date getCtime() {
		return ctime;
	}
}
