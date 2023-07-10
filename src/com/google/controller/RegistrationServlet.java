package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.util.DbConnection;
import com.google.util.Validators;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// db operation

		String firstName = request.getParameter("firstName");// always return string from request
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try (Connection con = DbConnection.getConnection();) {

			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?) ");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			int record = pstmt.executeUpdate();// insert update delete
			System.out.println(record + " inserted...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// rd -> request.setAttribute();
		// rd.forward(req,res)
		System.out.println("RegistrationServlet");
		response.sendRedirect("Login.jsp");// new request
	}
}
