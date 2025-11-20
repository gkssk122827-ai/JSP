package com.saeyan.comtoller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = request.getParameter("command");
		
		System.out.println("BoardServlet에서 요청을 받음을 확인: "+ command);
		
		ServletContext context = getServletContext();
		System.out.println("context : " + context);
		
		String path = context.getRealPath("upload");
		System.out.println("path : " +path);
		
		String encType = "utf-8";
		
		int sizeLimit = 20*1024*1024;
		MultipartRequest multi = 
				new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
		
		if(command == null)
			multi.getParameter("command");
		
		ActionFactory af = ActionFactory.getInstance();
		
		Action action = af.getAction(command);
		
		if(action != null) {
			action.execute(request, response);
		}
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
