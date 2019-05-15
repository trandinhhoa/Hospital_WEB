package com.hospital.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "User" database table.
 * 
 */
@Entity
@Table(name="\"User\"")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"UserName\"")
	private String userName;

	@Column(name="\"Active\"")
	private boolean active;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"FK_Group\"")
	private int FK_Group;

	@Column(name="\"FK_KhoaPhong\"")
	private int FK_KhoaPhong;

	@Column(name="\"HoVaTen\"")
	private String hoVaTen;

	@Column(name="\"LastLogin\"")
	private Timestamp lastLogin;

	@Column(name="\"NearLastLogin\"")
	private Timestamp nearLastLogin;

	@Column(name="\"PassWord\"")
	private String passWord;

	public User() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFK_Group() {
		return this.FK_Group;
	}

	public void setFK_Group(int FK_Group) {
		this.FK_Group = FK_Group;
	}

	public int getFK_KhoaPhong() {
		return this.FK_KhoaPhong;
	}

	public void setFK_KhoaPhong(int FK_KhoaPhong) {
		this.FK_KhoaPhong = FK_KhoaPhong;
	}

	public String getHoVaTen() {
		return this.hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Timestamp getNearLastLogin() {
		return this.nearLastLogin;
	}

	public void setNearLastLogin(Timestamp nearLastLogin) {
		this.nearLastLogin = nearLastLogin;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}