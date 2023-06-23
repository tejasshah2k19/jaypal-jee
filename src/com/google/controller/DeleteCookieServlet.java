package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cookieName = request.getParameter("cookieName");

		Cookie c[] = request.getCookies();

		for (Cookie x : c) {
			if (x.getName().equals(cookieName)) {
				x.setMaxAge(0);
				response.addCookie(x);
				break; 
			}
		}
		response.sendRedirect("ListCookieServlet");
	}

}
