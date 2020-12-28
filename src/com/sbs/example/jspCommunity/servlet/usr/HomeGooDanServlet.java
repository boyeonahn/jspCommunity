package com.sbs.example.jspCommunity.servlet.usr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usr/home/gugudan")
public class HomeGooDanServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//잊지말고 매번 작성 할 것
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		 
		if ( req.getParameter("dan") == null ) {
			resp.getWriter().append("단을 입력해주세요.");
			return;
		}
		
		int dan = Integer.parseInt(req.getParameter("dan"));
		int limit = 9;
		
		if (req.getParameter("limit") != null ) {
			limit = Integer.parseInt(req.getParameter("limit"));
		}
				
		resp.getWriter().append("<h1>" + String.format("구구단을 외자~ 구구단을 외자!" + "</br>" + "몇 단? %d단!", dan) + "</h1>");
	
		for ( int i = 1; i <= limit; i++ ) {
			resp.getWriter().append("<div>" + String.format("%d * %d = %d", dan, i, dan * i) + "</div>");
		}
	}
	

}
