package com.yll.servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

/**
 *@项目名称: MyServlet
 *@类名称: SessionServlet
 *@类描述:
 *@创建人: quanyixiang
 *@创建时间: 2022/11/6 21:02
 **/
public class SessionGetServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		resp.getWriter().write("session内容为:" + Optional.ofNullable(session.getAttribute("name")));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}