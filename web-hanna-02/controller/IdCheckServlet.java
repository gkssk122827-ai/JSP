package com.saeyan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WevServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.MemberDAO;

@webServlet("/idCheck.do")
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IdCheckservlet() {}

	protected void doGet (HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

	//userid 받아서, DB에서 같은 userid있는지 체크해서 있으면 중복,
	//없으면 사용 가능
	String userid = request.getParameter("userid");

	MemberDAO mdao =MemberDAO.getInstance();
		.forward(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletExeption, IOException {
	}
}









