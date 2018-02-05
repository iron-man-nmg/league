package com.league.dal.shop.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 文档表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class DocumentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//发布者
	private Long manager;
	//语言ISO3166
	private Long local;
	//标题
	private String title;
	//题图
	private Long attachment;
	//摘要
	private String brief;
	//详细内容
	private String content;
	//信息分类
	private Long doccate;
	//标记
	private String marker;
	//访问量
	private Integer vistor;
	//排序
	private Integer csort;
	//创建时间
	private Date cdate;

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
	 * 设置：发布者
	 */
	public void setManager(Long manager) {
		this.manager = manager;
	}
	/**
	 * 获取：发布者
	 */
	public Long getManager() {
		return manager;
	}
	/**
	 * 设置：语言ISO3166
	 */
	public void setLocal(Long local) {
		this.local = local;
	}
	/**
	 * 获取：语言ISO3166
	 */
	public Long getLocal() {
		return local;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：题图
	 */
	public void setAttachment(Long attachment) {
		this.attachment = attachment;
	}
	/**
	 * 获取：题图
	 */
	public Long getAttachment() {
		return attachment;
	}
	/**
	 * 设置：摘要
	 */
	public void setBrief(String brief) {
		this.brief = brief;
	}
	/**
	 * 获取：摘要
	 */
	public String getBrief() {
		return brief;
	}
	/**
	 * 设置：详细内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：详细内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：信息分类
	 */
	public void setDoccate(Long doccate) {
		this.doccate = doccate;
	}
	/**
	 * 获取：信息分类
	 */
	public Long getDoccate() {
		return doccate;
	}
	/**
	 * 设置：标记
	 */
	public void setMarker(String marker) {
		this.marker = marker;
	}
	/**
	 * 获取：标记
	 */
	public String getMarker() {
		return marker;
	}
	/**
	 * 设置：访问量
	 */
	public void setVistor(Integer vistor) {
		this.vistor = vistor;
	}
	/**
	 * 获取：访问量
	 */
	public Integer getVistor() {
		return vistor;
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
	 * 设置：创建时间
	 */
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCdate() {
		return cdate;
	}
}
