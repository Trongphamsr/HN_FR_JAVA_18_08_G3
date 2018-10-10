package com.fsoft.project.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.fsoft.project.dao.CategoryDao;
import com.fsoft.project.entity.Category;
import com.fsoft.project.service.CategoryService;

public class CategoryServiceImpl implements  CategoryService{

	private CategoryDao categoryDao;
	
	public CategoryServiceImpl(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public int registerCategory(String name) throws SQLException, Exception {
		return categoryDao.registerCategory(name);
	}

	@Override
	public List<Category> listCategory() throws SQLException, Exception {
		return categoryDao.listCategory();
	}

	@Override
	public int deleteCategory(int id) throws SQLException, Exception {
		return categoryDao.deleteCategory(id);
	}

}
