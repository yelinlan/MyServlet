package com.yll.servlet.controller;

import com.yll.servlet.constant.Constant;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 *@项目名称: MyServlet
 *@类名称: DownLoad
 *@类描述:
 *@创建人: quanyixiang
 *@创建时间: 2022/11/6 14:47
 **/
public class DownLoad extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setHeader(Constant.CONTENT_DISPOSITION,
				Constant.ATTACHMENT_FILENAME + URLEncoder.encode(Constant.PATH, Constant.UTF_8));
		System.out.println(Constant.ATTACH_PNG);
		try (FileInputStream in = new FileInputStream(Constant.ATTACH_PNG);
				ServletOutputStream out = resp.getOutputStream()) {
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
}