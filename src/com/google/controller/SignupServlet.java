package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("InSignupServlet....");

		// request-map-> key : value
		// if name/parameter name is wrong then you will get null
		String firstName = request.getParameter("firstName");// always return string from request
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;
		String error = "";

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error += "Please Enter FirstName<br>";
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			error += "Please Enter Password<br>";
		}
		// send user's data as response

		// old
		// servlet -> html -> client

		response.setContentType("text/html");// MIME

		// server --- client ->stream { data }

		PrintWriter out = response.getWriter(); // open stream

		out.print("<html><body>"); // => browser

		if (isError == true) {
//			out.print(error);
			request.setAttribute("error", error); // key:value  String:Object
			RequestDispatcher rd = request.getRequestDispatcher("Signup.html");
			rd.forward(request, response);
		} else {
			out.print("FirstName : " + firstName + "<BR><BR>");
			out.print("Email : " + email + "<br><BR>");
			out.print("Password : " + password);
		}
		out.print("</body></html>");

	}
}
