package com.atmecs.foodservice;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodservices","root","root"); 

			String empid=request.getParameter("Emp_ID");
			String empname=request.getParameter("Emp_Name");
			String deskno=request.getParameter("Desk_No");
			String code=request.getParameter("Code");
			
			
			OrderDetails order=new OrderDetails(empid,empname,deskno,code);
			HttpSession session=request.getSession();
			
			
			session.setAttribute("empid", empid);
			session.setAttribute("empname", empname);	
			session.setAttribute("deskno", deskno);
			session.setAttribute("code", code);
			
			
			
			
			
		PreparedStatement preparedStatement=con.prepareStatement("insert into order_details values(?,?,?,?)");
			preparedStatement.setString(1, empid);
			preparedStatement.setString(2, empname);
			preparedStatement.setString(3, deskno);
			preparedStatement.setString(4, code);
			
			
			if(preparedStatement.executeUpdate()!=0)
			{
				System.out.println("hello");
				
			
				
				
				request.getRequestDispatcher("Bill.jsp").forward(request, response);
				
				 
			}
			else
			{
				System.out.println("Some problem in Ordering");
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
