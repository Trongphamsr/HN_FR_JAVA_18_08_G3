package com.fsoft.project.dao;

import java.sql.SQLException;

public interface MemberDao {

	public int registerMember(String firstName,String lastName,String address,String phone,boolean role,String email, String password) throws SQLException, Exception;
	
}
