package com.fsoft.project.action;

import com.fsoft.project.common.PageStrust;
import com.fsoft.project.dao.CategoryDao;
import com.fsoft.project.dao.impl.CategoryDaoImpl;
import com.fsoft.project.service.CategoryService;
import com.fsoft.project.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCategoryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2361681847621293281L;
	private int id;
	private String msg;
	
	
	private CategoryDao categoryDao; 
	private CategoryService categoryService;
	
	@Override
	public String execute() throws Exception {
		categoryDao = new CategoryDaoImpl();
		categoryService = new CategoryServiceImpl(categoryDao);
		int deleted = categoryService.deleteCategory(id);
		if (deleted > 0) {
			msg = "Record deleted successfully";
		} else {
			msg = "Some error";
		}
		return PageStrust.DELETE_CATEGORY;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
