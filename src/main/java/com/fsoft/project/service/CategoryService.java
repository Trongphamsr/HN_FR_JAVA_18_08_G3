package com.fsoft.project.service;

import java.sql.SQLException;
import java.util.List;

import com.fsoft.project.entity.Category;

public interface CategoryService {

	public int registerCategory(String name) throws SQLException, Exception;
	public List<Category> listCategory() throws SQLException, Exception;

//	public String updadeCategory(String name)
//			throws SQLException, Exception;

	public int deleteCategory(int id) throws SQLException, Exception;
}
