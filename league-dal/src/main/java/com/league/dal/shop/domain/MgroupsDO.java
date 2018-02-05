package com.league.dal.shop.domain;

import java.io.Serializable;

/**
 * 管理员组
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class MgroupsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//组名
	private String name;
	//备注
	private String remarks;

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
	 * 设置：组名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：组名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
	}
}
