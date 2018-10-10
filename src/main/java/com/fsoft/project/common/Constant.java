package com.fsoft.project.common;

public class Constant {
	public static final String REGISTER_MEMBER="INSERT INTO MEMBER VALUES (?,?,?,?,?,?,?)";
	public static final String REGISTER_CATEGORY="INSERT INTO CATEGORY VALUES (?)";
	public static final String ALL_CATEGORY="SELECT* FROM  CATEGORY";
	public static final String DELETE_CATEGORY="DELETE FROM CATEGORY WHERE id=?";
}
