package com.google.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.util.DbConnection;

public class ListUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Connection con = DbConnection.getConnection(); 
			PreparedStatement pstmt = con.prepareStatement("select * from users");
			ResultSet rs = pstmt.executeQuery(); 
			
			request.setAttribute("rs", rs);
			
			request.getRequestDispatcher("ListUsers.jsp").forward(request, response);
			
		} catch (Exception e) {

		}

	}

}
