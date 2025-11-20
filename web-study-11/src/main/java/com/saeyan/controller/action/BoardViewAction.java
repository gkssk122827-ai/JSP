package com.saeyan.controller.action;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. num가져오기
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = dao.selectOneByNum(num);
		
		request.setAttribute("board", vo);
		
		String url = "board/boardView.jsp";
		
//		RequestorType dis = request.getRequestDispatcher(url);
		
		request.getRequestDispatcher(url)
			.forward(request, response);
	}

}
