package com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {

		try {

			String driveName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jaypal";
			String userName = "root";
			String password = "root";

			// type 4 driver -> auto load

			Class.forName(driveName); // load driver

			Connection con = DriverManager.getConnection(url, userName, password); // establish connection
			System.out.println("DbConnected....");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
