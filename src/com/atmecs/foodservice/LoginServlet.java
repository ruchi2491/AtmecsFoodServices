package com.atmecs.foodservice;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Utillity.DatabaseConnection;

/**
 * Servlet implementation class next
 */
@WebServlet("/Login123")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name=request.getParameter("username");
		//String password=request.getParameter("password");
		try{  
			System.out.println("hi");
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodservices","root","root"); 
	
		
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select name from user_details where name='"+name+"' ");  
			
			while(rs.next()) 
			{
				if(name.equals(rs.getString(1))) 
				{
					request.getRequestDispatcher("OrderDetails.jsp").forward(request, response);
				
				
				}
			}
				
				
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				
			con.close();  
			}
		catch(Exception e){ System.out.println(e);}  
	
	}
	
	/*String name=request.getParameter("username");
	String password=request.getParameter("password");
	Connection connection=DatabaseConnection.getConnection();
	  try {
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from user_details where name='"+name+"' ");
		if(resultSet!=null){
			while(resultSet.next())
			{
				if(name.equals(resultSet.getString(1))) 
				{
					request.getRequestDispatcher("OrderDetails.jsp").forward(request, response);
				
				
				}
			}
		} else {
			request.setAttribute("msg", "User is is not registered.");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}*/
	

}
