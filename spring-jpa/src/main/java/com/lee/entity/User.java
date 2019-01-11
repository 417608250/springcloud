package com.lee.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity   
@Table(name="tb_user")  
public class User implements Serializable{
	
	/**
	 *  
	 */
	private static final long serialVersionUID = -7920041715063192361L;
	@Id
	private int id;  
	@Column(name="user_name")
	private String userName;
	@Column(name="user_code")
	private String userCode;
	@Column(name="user_no")
	private String userNo;
	@Column(name="user_passwd")
	private String userPasswd;
	@Column(name="salt")
	private String salt;
	@Version
	private int version;
	
	
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	
	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}  
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	
}
