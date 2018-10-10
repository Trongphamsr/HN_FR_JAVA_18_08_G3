package com.fsoft.project.service;

import java.sql.SQLException;

public interface MemberService {

	public int registerMember(String firstName,String lastName,String address,String phone,boolean role,String email, String password) throws SQLException, Exception;
}
