package com.yll.servlet.config;

import com.yll.servlet.constant.Constant;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *@项目名称: MyServlet
 *@类名称: OnlineCountListener
 *@类描述:
 *@创建人: quanyixiang
 *@创建时间: 2022/11/8 23:42
 **/
public class OnlineCountListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("OnlineCountListener初始化...");
		ServletContext context = se.getSession().getServletContext();
		Integer count = (Integer) context.getAttribute(Constant.ONLINE_COUNT);
		context.setAttribute(Constant.ONLINE_COUNT, count == null ? 1 : ++count);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("OnlineCountListener销毁");
		ServletContext context = se.getSession().getServletContext();
		Integer count = (Integer) context.getAttribute(Constant.ONLINE_COUNT);
		context.setAttribute(Constant.ONLINE_COUNT, count == null ? 0 : --count);
	}
}