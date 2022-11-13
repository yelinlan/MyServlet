package com.yll.servlet.controller;

import com.yll.servlet.constant.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *@项目名称: MyServlet
 *@类名称: RedirectServlet
 *@类描述:
 *@创建人: yll
 *@创建时间: 2022/11/6 14:47
 **/
public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		 resp.sendRedirect(Constant.IMAGE_SERVLET);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
}