package com.jtorres.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class testdbservlet
 */
@WebServlet("/testdbservlet")
public class testdbservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// setup connection variagbles
		
		String user = "jtorres";
		String pass = "pw12345";
		
		String jdbcurl = "jdbc:mysql://localhost:3306/springexercise?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		// get connection to db
		
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to DB: " + jdbcurl);
			
			Class.forName(driver);
			
			Connection myconn = DriverManager.getConnection(jdbcurl, user, pass);
			
			out.println("Successfully connected!");
			
			myconn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		
		
	}

}
