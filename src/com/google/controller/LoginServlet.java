package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//valid 
		//authentication 
		//email -> cookie 
	
		Cookie c = new Cookie("email", email); // create cookie 
		c.setMaxAge(60*60*24*7);
		response.addCookie(c); //set cookie in response -> browser 
		
		response.sendRedirect("Home.jsp");
	}
}
