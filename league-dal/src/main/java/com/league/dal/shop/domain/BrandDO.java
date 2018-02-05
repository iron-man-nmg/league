package com.league.dal.shop.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 品牌表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class BrandDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//品牌名称
	private String name;
	//别名
	private String alias;
	//LOGO
	private Long logo;
	//网址
	private String url;
	//排序
	private Integer csort;
	//品牌介绍
	private String intro;

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
	 * 设置：品牌名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：品牌名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：别名
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * 获取：别名
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * 设置：LOGO
	 */
	public void setLogo(Long logo) {
		this.logo = logo;
	}
	/**
	 * 获取：LOGO
	 */
	public Long getLogo() {
		return logo;
	}
	/**
	 * 设置：网址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：网址
	 */
	public String getUrl() {
		return url;
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
	 * 设置：品牌介绍
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}
	/**
	 * 获取：品牌介绍
	 */
	public String getIntro() {
		return intro;
	}
}
