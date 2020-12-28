package com.sbs.example.jspCommunity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/99dan/2")
public class GooDan2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("2 * 1 = 1\r2 * 2 = 4\r2 * 3 = 6\r2 * 4 = 8\r2 * 5 = 10\r2 * 6 = 12\r2 * 7 = 14\r2 * 8 = 16\r2 * 9 = 18"); 
	}

}
