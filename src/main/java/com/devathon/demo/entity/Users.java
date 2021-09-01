package com.devathon.demo.entity;

import org.springframework.data.annotation.Id;

import com.devathon.demo.models.Address;
import com.devathon.demo.models.Name;


public class Users {
	
	@Id
	private String Id;
	
	private Name name;
	private String email;
	private String phone;
	private Address address;
	private String description;
	private String roleCode;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isValid() {
	   return email != null;
	}	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Name name, String email, String phone, Address address, String description, String roleCode) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.description = description;
		this.roleCode = roleCode;
	}
	@Override
	public String toString() {
		return "Users [Id=" + Id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", description=" + description + ", roleCode=" + roleCode + "]";
	}
	

}