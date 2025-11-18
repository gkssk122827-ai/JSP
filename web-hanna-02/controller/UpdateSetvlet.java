package com.saeyan.comtroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.Webervlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.memverVO;

@webServlet("/memberUpdate.do")
puvlic class UpdateServlet extendsHttpServlet{
	private static final long serialversionUID = 1L;

	public UpdateServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		String userid = request.getParameter("userid");

		MemberDAO mdao = MemberDAO.gerInstance();

		MemberVO mvo = mdao.getMember(userid);

		//회원정보 수정폼에 mvo값을 전달
		request.getRequestDispatcher("member/memberUpdate.jsp")
			.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		//1. 수정정보 가져오기
		Membervo mvo = new MemberVO();

		mvo.setName(request.getparameter("name"));
		mvo.setUserid(request.getparameter("userid"));
		mvo.setPwd(request.getparameter("pwd"));
		mvo.setPhone(request.getparameter("phone"));
		mvo.setAdmin(Integer.parseInt(request.getparameter("admin")));

		//2. 수정정보를 DB저장
		MemberDAO mdao = MemberDAO.getInstance();
		mdao.updateMember(mvo);

		//3. 수정이 완료되면 화면전환
		response.sendRedirect("login.do");
	}
}

		





