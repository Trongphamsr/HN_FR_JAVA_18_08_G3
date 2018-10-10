package com.fsoft.project.action;

import com.fsoft.project.common.PageStrust;
import com.fsoft.project.dao.MemberDao;
import com.fsoft.project.dao.impl.MemberDaoImpl;
import com.fsoft.project.service.MemberService;
import com.fsoft.project.service.impl.MemberServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private boolean role;
	private String email;
	private String password, msg;
	private int result;
	
	private MemberDao memberDao;
	@SuppressWarnings("unused")
	private MemberService memberService; 
	
	@Override
	public String execute() throws Exception {
		
		memberDao = new MemberDaoImpl();
		memberService= new MemberServiceImpl(memberDao);
		result=memberService.registerMember(firstName, lastName, address, phone, role, email, password);
		
		if (result > 0) {
			msg = "Registration Successfull";
		} else {
			msg = "Some error";
		}
		
		return PageStrust.REGISTER;
	}
	
	
	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
