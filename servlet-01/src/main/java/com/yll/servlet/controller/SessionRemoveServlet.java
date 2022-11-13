package com.yll.servlet.controller;

import com.yll.servlet.constant.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *@项目名称: MyServlet
 *@类名称: SessionServlet
 *@类描述:
 *@创建人: yll
 *@创建时间: 2022/11/6 21:02
 **/
public class SessionRemoveServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.removeAttribute(Constant.NAME);
		session.removeAttribute(Constant.TOKEN);
		session.invalidate();
		req.getRequestDispatcher(Constant.INDEX_JSP).forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}