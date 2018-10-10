package com.fsoft.project.action;

import java.util.List;

import com.fsoft.project.common.PageStrust;
import com.fsoft.project.dao.CategoryDao;
import com.fsoft.project.dao.impl.CategoryDaoImpl;
import com.fsoft.project.entity.Category;
import com.fsoft.project.service.CategoryService;
import com.fsoft.project.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AllCategoryAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private CategoryDao categoryDao;
	private CategoryService categoryService;
	private List<Category> categoryResult;
	private boolean noData;
	
	
	@Override
	public String execute() throws Exception {
		
		categoryDao = new CategoryDaoImpl();
		categoryService = new CategoryServiceImpl(categoryDao);
		
		categoryResult=categoryService.listCategory();
		if (categoryResult.size() == 0) {
			noData = false;
		} else {
			noData = true;
		}
		
		return PageStrust.ALL_CATEGORY;
	}
	
	
	public List<Category> getCategoryResult() {
		return categoryResult;
	}
	public void setCategoryResult(List<Category> categoryResult) {
		this.categoryResult = categoryResult;
	}
	public boolean isNoData() {
		return noData;
	}
	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	
	
	
}
