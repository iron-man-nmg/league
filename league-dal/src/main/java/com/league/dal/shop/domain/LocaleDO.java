package com.league.dal.shop.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 语言表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class LocaleDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//国际化字符集3166
	private Long id;
	//名称
	private String name;

	/**
	 * 设置：国际化字符集3166
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：国际化字符集3166
	 */
	public Long getId() {
		return id;
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
}
