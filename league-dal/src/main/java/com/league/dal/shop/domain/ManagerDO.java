package com.league.dal.shop.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 管理员表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public class ManagerDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//账号
	private String account;
	//密码
	private String password;
	//状态
	private String status;
	//EMAIL
	private String email;
	//管理员名称
	private String name;
	//头像
	private Long image;
	//管理员类型
	private String ctype;
	//组
	private Long mgroups;
	//昵称
	private String nickname;
	//身份证号码
	private String idcard;
	//最后登录时间
	private Date lastlogin;
	//登录次数
	private Integer logincount;
	//注册时间
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
	 * 设置：账号
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 获取：账号
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
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
	 * 设置：EMAIL
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：EMAIL
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：管理员名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：管理员名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：头像
	 */
	public void setImage(Long image) {
		this.image = image;
	}
	/**
	 * 获取：头像
	 */
	public Long getImage() {
		return image;
	}
	/**
	 * 设置：管理员类型
	 */
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	/**
	 * 获取：管理员类型
	 */
	public String getCtype() {
		return ctype;
	}
	/**
	 * 设置：组
	 */
	public void setMgroups(Long mgroups) {
		this.mgroups = mgroups;
	}
	/**
	 * 获取：组
	 */
	public Long getMgroups() {
		return mgroups;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：身份证号码
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	/**
	 * 获取：身份证号码
	 */
	public String getIdcard() {
		return idcard;
	}
	/**
	 * 设置：最后登录时间
	 */
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	/**
	 * 获取：最后登录时间
	 */
	public Date getLastlogin() {
		return lastlogin;
	}
	/**
	 * 设置：登录次数
	 */
	public void setLogincount(Integer logincount) {
		this.logincount = logincount;
	}
	/**
	 * 获取：登录次数
	 */
	public Integer getLogincount() {
		return logincount;
	}
	/**
	 * 设置：注册时间
	 */
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	/**
	 * 获取：注册时间
	 */
	public Date getCtime() {
		return ctime;
	}
}
