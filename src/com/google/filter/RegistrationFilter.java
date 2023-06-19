package com.google.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.google.util.Validators;

public class RegistrationFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String firstName = request.getParameter("firstName");// always return string from request
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;
		String error = "";

		if (Validators.isEmpty(firstName)) {
			isError = true;
			error += "Please Enter FirstName<br>";
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} else if (Validators.isAlpha(firstName) == false) {

			request.setAttribute("firstNameError", "Please Enter Valid FirstName");
			request.setAttribute("firstNameValue", firstName);

		} else {
			request.setAttribute("firstNameValue", firstName);
		}

		if (Validators.isEmpty(email)) {
			isError = true;
			error += "Please Enter Email<br>";
			request.setAttribute("emailError", "Please Enter Email");
		} else if (Validators.isEmail(email) == false) {
			request.setAttribute("emailError", "Please Enter Valid Email");
			request.setAttribute("emailValue", email);

		} else {
			request.setAttribute("emailValue", email);
		}

		if (Validators.isEmpty(password)) {
			isError = true;
			error += "Please Enter Password<br>";
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError == true) {
			request.setAttribute("error", error); // key:value String:Object
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		} else {
			// go ahead -> call the servlet or next filter
			chain.doFilter(request, response);// servlet or filter
		}
	}

	public void destroy() {

	}
}
