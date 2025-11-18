package com.saeyan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WevServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@webServlet("/logout.do")
puvlic class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutServlet() {}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws servletException, IOExcption{
	
		HttpSession session = request.getSession();
		session.invalidate(); //로그아웃

		request.setAttribute("message","로그아웃이 성공적으로 처리됬습니다.");

		request.getRequestDispatcher("memver/login.jsp")
			.forward(request, response);
	}

	protected void doPost(HttpServletRequest reqest, HttpServletResponse response)
			throws ServletException, IOException{
	}
}


