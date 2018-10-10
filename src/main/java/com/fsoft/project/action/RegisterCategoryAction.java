package com.fsoft.project.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.fsoft.project.common.PageStrust;
import com.fsoft.project.dao.CategoryDao;
import com.fsoft.project.dao.impl.CategoryDaoImpl;
import com.fsoft.project.service.CategoryService;
import com.fsoft.project.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterCategoryAction extends ActionSupport{

	private String name;
	private String msg;
	private int result;
	
	private CategoryDao categoryDao; 
	private CategoryService categoryService;
	
	@Override
	public String execute() throws Exception {
//		HttpServletRequest request = ServletActionContext.getRequest();
//		String name= request.getParameter("name");
		
		categoryDao = new CategoryDaoImpl();
		categoryService = new CategoryServiceImpl(categoryDao);
		result=categoryService.registerCategory(name);
		
		if (result > 0) {
			msg = "Registration Successfull";
		} else {
			msg = "Some error";
		}
		return PageStrust.REGISTER_CATEGORY;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
}
