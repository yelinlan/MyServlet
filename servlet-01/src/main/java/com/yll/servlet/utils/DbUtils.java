package com.yll.servlet.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *@项目名称: MyServlet
 *@类名称: DbUtils
 *@类描述:
 *@创建人: quanyixiang
 *@创建时间: 2022/11/9 20:29
 **/
public class DbUtils {
	public static Connection conn;
	public static String driverName = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
	public static String root = "root";
	public static String password = "yelinlan";
	static {
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, root, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return conn;
	}
}