package com.javaex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GuestController")
public class GuestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GuestbookController.go");
		
		String action = request.getParameter("action");
		System.out.println(action);
		
		if("dform".equals(action)) {
			System.out.println("dform:삭제폼");
			
			//포워드 jsp에게 html그리게하기
			RequestDispatcher rd = request.getRequestDispatcher("/deleteForm.jsp");
			rd.forward(request, response);
			
		} else if("addlist".equals(action)) {
			System.out.println("addList:등록+리스트");
			
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String text = request.getParameter("text");
			
			
			//포워드 jsp에게 html그리게하기
			RequestDispatcher rd = request.getRequestDispatcher("/addList.jsp");
			rd.forward(request, response);			
		}
		
	}//


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
