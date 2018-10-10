package com.fsoft.project.service.impl;

import java.sql.SQLException;

import com.fsoft.project.dao.MemberDao;
import com.fsoft.project.service.MemberService;


public class MemberServiceImpl implements MemberService{

	private MemberDao memberDao ;
	
	
	public MemberServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}


	@Override
	public int registerMember(String firstName, String lastName, String address, String phone, boolean role,
			String email, String password) throws SQLException, Exception {
		return memberDao.registerMember(firstName, lastName, address, phone, role, email, password);
	}

}
