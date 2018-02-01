package com.league.shop.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 商品表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class GoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//语言
	private Long locale;
	//商品分类
	private Long category;
	//商品类型
	private Long gstype;
	//商品名称
	private String name;
	//商品编号
	private String sn;
	//商品条形码
	private String barcode;
	//关键词
	private String keywords;
	//品牌
	private Long brand;
	//简介
	private String intro;
	//详细介绍
	private String details;
	//单价
	private BigDecimal price;
	//市场价
	private BigDecimal mprice;
	//成本价
	private BigDecimal cprice;
	//重量
	private BigDecimal weight;
	//免费送货
	private String freeshipping;
	//赠送积分
	private Integer points;
	//库存
	private Integer inventory;
	//参加促销
	private String promote;
	//创建时间
	private Date ctime;
	//修改时间
	private Date utime;
	//状态
	private String status;
	//排序
	private Integer csort;
	//录入者
	private Long manager;
	//META_KEYWORDS
	private String mkeywords;
	//META_DESCRIPTION
	private String mdescription;
	//访问量
	private Integer vistor;

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
	 * 设置：商品分类
	 */
	public void setCategory(Long category) {
		this.category = category;
	}
	/**
	 * 获取：商品分类
	 */
	public Long getCategory() {
		return category;
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
	 * 设置：商品名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：商品编号
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}
	/**
	 * 获取：商品编号
	 */
	public String getSn() {
		return sn;
	}
	/**
	 * 设置：商品条形码
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	/**
	 * 获取：商品条形码
	 */
	public String getBarcode() {
		return barcode;
	}
	/**
	 * 设置：关键词
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * 获取：关键词
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * 设置：品牌
	 */
	public void setBrand(Long brand) {
		this.brand = brand;
	}
	/**
	 * 获取：品牌
	 */
	public Long getBrand() {
		return brand;
	}
	/**
	 * 设置：简介
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}
	/**
	 * 获取：简介
	 */
	public String getIntro() {
		return intro;
	}
	/**
	 * 设置：详细介绍
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * 获取：详细介绍
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * 设置：单价
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：单价
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：市场价
	 */
	public void setMprice(BigDecimal mprice) {
		this.mprice = mprice;
	}
	/**
	 * 获取：市场价
	 */
	public BigDecimal getMprice() {
		return mprice;
	}
	/**
	 * 设置：成本价
	 */
	public void setCprice(BigDecimal cprice) {
		this.cprice = cprice;
	}
	/**
	 * 获取：成本价
	 */
	public BigDecimal getCprice() {
		return cprice;
	}
	/**
	 * 设置：重量
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	/**
	 * 获取：重量
	 */
	public BigDecimal getWeight() {
		return weight;
	}
	/**
	 * 设置：免费送货
	 */
	public void setFreeshipping(String freeshipping) {
		this.freeshipping = freeshipping;
	}
	/**
	 * 获取：免费送货
	 */
	public String getFreeshipping() {
		return freeshipping;
	}
	/**
	 * 设置：赠送积分
	 */
	public void setPoints(Integer points) {
		this.points = points;
	}
	/**
	 * 获取：赠送积分
	 */
	public Integer getPoints() {
		return points;
	}
	/**
	 * 设置：库存
	 */
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	/**
	 * 获取：库存
	 */
	public Integer getInventory() {
		return inventory;
	}
	/**
	 * 设置：参加促销
	 */
	public void setPromote(String promote) {
		this.promote = promote;
	}
	/**
	 * 获取：参加促销
	 */
	public String getPromote() {
		return promote;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCtime() {
		return ctime;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUtime(Date utime) {
		this.utime = utime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUtime() {
		return utime;
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
	 * 设置：录入者
	 */
	public void setManager(Long manager) {
		this.manager = manager;
	}
	/**
	 * 获取：录入者
	 */
	public Long getManager() {
		return manager;
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
}
