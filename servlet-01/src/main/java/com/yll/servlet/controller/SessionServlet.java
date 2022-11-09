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
 *@创建人: quanyixiang
 *@创建时间: 2022/11/6 21:02
 **/
public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		session.setAttribute(Constant.NAME, Constant.NAME_VAL);
		String id = session.getId();
		if (session.isNew()) {
			resp.getWriter().write("sessionId【创建成功】，ID:"+id);
		} else {
			resp.getWriter().write("sessionId【已存在】，ID:"+id);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}