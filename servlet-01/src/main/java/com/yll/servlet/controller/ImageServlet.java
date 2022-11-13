package com.yll.servlet.controller;

import com.yll.servlet.constant.Constant;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 *@项目名称: MyServlet
 *@类名称: ImageServlet
 *@类描述:
 *@创建人: yll
 *@创建时间: 2022/11/6 14:47
 **/
public class ImageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setResp(resp);
		ImageIO.write(drawCaptcha(), Constant.JPG, resp.getOutputStream());
	}

	private void setResp(HttpServletResponse resp) {
		resp.setHeader(Constant.REFRESH, Constant.REFRESH_VAL);
		resp.setContentType(Constant.IMAGE_JPEG);
		resp.setHeader(Constant.CACHE_CONTROL, Constant.CACHE_CONTROL_VAL);
		resp.setHeader(Constant.PRAGMA, Constant.CACHE_CONTROL_VAL);


	}

	private BufferedImage drawCaptcha() {
		BufferedImage image = new BufferedImage(Constant.WIDTH, Constant.HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(Constant.ZERO, Constant.ZERO, Constant.RECT_WIDTH, Constant.RECT_HEIGHT);
		g.setColor(Color.BLUE);
		g.setFont(new Font(null, Font.BOLD, Constant.FONT_SIZE));
		g.drawString(captcha(Constant.CAPTCHA_SIZE), Constant.CPTCHA_X, Constant.CPTCHA_Y);
		return image;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	//生成验证码(count为验证码的长度)
	public static String captcha(int count) {
		//10个数字 26个小写字母 26个大写字母 共62个字符
		StringBuilder code = new StringBuilder();
		int num;
		Random rand = new Random();
		for (int i = Constant.ZERO; i < count; i++) { //随机获得62个字符的下标
			num = rand.nextInt(Constant.CAPTCHA_METAWORD.length());//
			code.append(Constant.CAPTCHA_METAWORD.charAt(num));
		}
		return code.toString();
	}
}

