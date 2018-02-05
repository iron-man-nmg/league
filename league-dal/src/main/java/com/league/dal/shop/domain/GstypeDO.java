package com.league.dal.shop.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品类型
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class GstypeDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//类型名称
	private String name;
	//类型别名
	private String alias;

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
	 * 设置：类型名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：类型名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：类型别名
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * 获取：类型别名
	 */
	public String getAlias() {
		return alias;
	}
}
