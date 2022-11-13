package com.yll.servlet.utils;

import com.yll.servlet.constant.Constant;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *@项目名称: MyServlet
 *@类名称: DbUtils
 *@类描述:
 *@创建人: yll
 *@创建时间: 2022/11/9 20:29
 **/
public class DbUtils {
	public static Connection conn;
	public static String driver;
	public static String url;
	public static String username;
	public static String password;

	static {
		try {
			InputStream in = DbUtils.class.getClassLoader().getResourceAsStream(Constant.PROPERTIES);
			Properties properties = new Properties();
			properties.load(in);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}
}