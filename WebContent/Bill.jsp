<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.atmecs.foodservice.OrderDetails" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div style="position: absolute;top:200px;left:800px">


<table style="font-family: cursive;font-size: 50">
<h1 style="color: blue">Your Bill Details are here...</h1>
<tr><td><h1>Empid</h1></td><td> <h1><%out.println(session.getAttribute("empid")); %></h1></td></tr>
<tr><td><h1>Empname</h1></td><td> <h1><%out.println(session.getAttribute("empname")); %></h1></td></tr>
<tr><td><h1>Deskno</h1></td><td><h1> <%out.println(session.getAttribute("deskno")); %></h1></td></tr>
<tr><td><h1>order</h1></td><td> <h1><%out.println(session.getAttribute("code")); %></h1></td></tr>
<tr><td><h1>PRICE</h1></td><td><h1><%String code=(String)session.getAttribute("code");
int price;
if(code.equals("011") || code.equals("014") || code.equals("015") || code.equals("021"))
{
	price=60;
}else if(code.equals("012"))
{
	price=40;
}else if(code.equals("018"))
{
	price=100;
}else if(code.equals("019"))
{
	price=10;
}else
{
	price=80;
}
%>
<%=price %>
<%=code %>
</h1></td></tr>
</table>


</div>




</body>
</html>