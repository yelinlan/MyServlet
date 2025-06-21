package com.yll.servlet.controller;

import com.yll.servlet.constant.Constant;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *@项目名称: MyServlet
 *@类名称: DispatcherServlet
 *@类描述:
 *@创建人: yll
 *@创建时间: 2022/11/6 21:02
 **/
public class DispatcherServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		context.getRequestDispatcher(Constant.COOKIE_SERVLET).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}