package com.sbs.example.jspCommunity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/99dan/1")
public class GooDan1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lang = request.getParameter("lang");
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append(lang + "1 * 1 = 1\r1 * 2 = 2\r1 * 3 = 3\r1 * 4 = 4\r1 * 5 = 5\r1 * 6 = 6\r1 * 7 = 7\r1 * 8 = 8\r1 * 9 = 9");
	}
}
