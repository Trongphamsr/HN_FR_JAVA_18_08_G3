package com.fsoft.project.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fsoft.project.common.Constant;
import com.fsoft.project.dao.MemberDao;
import com.fsoft.project.db.DbHelper;
import com.fsoft.project.security.SecuritySha;

public class MemberDaoImpl implements MemberDao{

	PreparedStatement ps = null;
	CallableStatement cs = null;
	ResultSet rs = null;
	Connection conn = null;
	
	@Override
	public int registerMember(String firstName, String lastName, String address, String phone, boolean role,
			String email, String password) throws SQLException, Exception {
		int i=0;
		
		conn=DbHelper.getConnection();
//		if(conn == null) System.out.print("a");
		ps=conn.prepareStatement(Constant.REGISTER_MEMBER);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, address);
		ps.setString(4, phone);
		ps.setBoolean(5, false);
		ps.setString(6, email);
		ps.setString(7, SecuritySha.SHA1(password));
		i=ps.executeUpdate();
		return i;
	}

}
