package com.cg.hbms.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Users")
public class Users implements Serializable{
private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="password")
	private String password;	
	
	@Column(name="role")
	private String role;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@OneToMany
	@JoinColumn(name="user_id")
	private List<BookingDetails> bookingDetails;
	
	public Users(String userId, String password, String role,String userName) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.userName= userName;
	}

	public Users(String userId, String password, String role, String userName,
			String mobileNo, String phone, String address, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public Users(String userId,String password) {
		super();
		this.password = password;
		this.userId = userId;
	}

	//Getters and Setters
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public Users() {
		super();
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", password=" + password + ", role="
				+ role + ", userName=" + userName + ", mobileNo=" + mobileNo
				+ ", phone=" + phone + ", address=" + address + ", email="
				+ email + "]";
	}
	
}
