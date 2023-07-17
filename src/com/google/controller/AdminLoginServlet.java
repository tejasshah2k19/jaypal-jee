package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// read config -> ServletConfig -> web.xml servlet config
		// ServletContext ->

		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();

		String cEmail = config.getInitParameter("email");
		String cPassword = config.getInitParameter("password");

		String gEmail = context.getInitParameter("email");
		String gPassword = context.getInitParameter("password");

		if ((email.equals(cEmail) && password.equals(cPassword))
				|| (gEmail.equals(email) && gPassword.equals(password))) {
			response.sendRedirect("Home.jsp");
		} else {
			response.sendRedirect("AdminLogin.jsp");
		}

	}

}
