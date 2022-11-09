package com.yll.servlet.controller;

import com.yll.servlet.constant.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Optional;
import java.util.Properties;

/**
 *@项目名称: MyServlet
 *@类名称: HelloServlet
 *@类描述:
 *@创建人: quanyixiang
 *@创建时间: 2022/11/6 14:47
 **/
public class CookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern(Constant.DATE_FORMAT));
		Cookie cookie = new Cookie(Constant.LAST_LOGIN_TIME, URLEncoder.encode(date, Constant.UTF_8));
		cookie.setMaxAge(24*60*60);//过期时间
		resp.addCookie(cookie);
		PrintWriter writer = resp.getWriter();

		writer.println("app servlet ...<br>");
		//cookie相关
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			Optional<String> lastLoginTime = Arrays.stream(cookies).filter(p -> p.getName().equals(
					Constant.LAST_LOGIN_TIME))
					.map(Cookie::getValue).findAny();
			if (lastLoginTime.isPresent()) {
				writer.printf("上次访问hello页面的时间为：");
				writer.write(URLDecoder.decode(lastLoginTime.get(), Constant.UTF_8));
			} else {
				writer.printf("这是你第一次访问hello页面！");
			}
		}
		//读取配置文件
		InputStream resource = this.getServletContext().getResourceAsStream(Constant.DB_PROPERTIES);
		Properties prop = new Properties();
		prop.load(resource);
		writer.printf(Constant.NAME_PWD, prop.getProperty(Constant.NAME), prop.getProperty(Constant.PWD));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
}