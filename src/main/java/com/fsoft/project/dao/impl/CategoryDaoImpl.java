package com.fsoft.project.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fsoft.project.common.Constant;
import com.fsoft.project.dao.CategoryDao;
import com.fsoft.project.db.DbHelper;
import com.fsoft.project.entity.Category;

public class CategoryDaoImpl implements CategoryDao{

	PreparedStatement ps = null;
	CallableStatement cs = null;
	ResultSet rs = null;
	Connection conn = null;

	@Override
	public int registerCategory(String name) throws SQLException, Exception {
		int i=0;
		conn=DbHelper.getConnection();
		ps=conn.prepareStatement(Constant.REGISTER_CATEGORY);
		ps.setString(1, name);
		i=ps.executeUpdate();
		return i;
	}

	@Override
	public List<Category> listCategory() throws SQLException, Exception {
		conn=DbHelper.getConnection();

		List<Category> list = new ArrayList<Category>();
		ps=conn.prepareStatement(Constant.ALL_CATEGORY);
		rs = ps.executeQuery();
		int i = 0;
		if (rs != null) {
			while (rs.next()) {
				i++;
				Category ca = new Category();
				ca.setId(i);
				ca.setName(rs.getString("name"));
				list.add(ca);
			}
		}
		return list;
	}

	@Override
	public int deleteCategory(int id) throws SQLException, Exception {
		conn=DbHelper.getConnection();
		int i = 0;
		ps=conn.prepareStatement(Constant.DELETE_CATEGORY);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		return i;
	}




}
