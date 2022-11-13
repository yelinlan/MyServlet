package com.yll.servlet.controller;

import com.yll.servlet.constant.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 *@项目名称: MyServlet
 *@类名称: LoginServlet
 *@类描述:
 *@创建人: yll
 *@创建时间: 2022/11/6 14:47
 **/
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter(Constant.USERNAME);
		String password = req.getParameter(Constant.PASSWORD);

		if (Objects.equals(username, Constant.ADMIN)&&Objects.equals(password, Constant.ADMIN_VAL)){
			req.getSession().setAttribute(Constant.TOKEN,req.getSession().getId());
			req.getRequestDispatcher(Constant.MAIN_JSP).forward(req,resp);
		}else {
			req.getRequestDispatcher(Constant.NO_AUTH_JSP).forward(req,resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
}