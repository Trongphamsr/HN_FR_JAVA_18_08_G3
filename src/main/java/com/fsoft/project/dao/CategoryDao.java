package com.fsoft.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.fsoft.project.entity.Category;


public interface CategoryDao {

	public int registerCategory(String name) throws SQLException, Exception;
	public List<Category> listCategory() throws SQLException, Exception;

//	public String updadeCategory(String name)
//			throws SQLException, Exception;

	public int deleteCategory(int id) throws SQLException, Exception;
	
}
