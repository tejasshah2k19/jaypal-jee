package com.google.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.util.DbConnection;

public class DeleteUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer userId = Integer.parseInt(request.getParameter("userId"));

		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from users where userId = ?");
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();

			response.sendRedirect("ListUserServlet");//
			
		} catch (Exception e) {

		}
	}

}
