<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/order.css">
        <link href='http://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/main.css">
<title>Insert title here</title>
</head>
<script>
		function alert1() {
			window.alert("Your order registered successfully....");			
		}


</script>

<body background="images\02R.jpg">
 <form action="OrderServlet" method="post">
<div>
<h1 style="font-family:cursive; ">Place Your order here....</h1>
</div>
<table>
<tr>
	
<td> 

	
	<div class="container"style="color: red">
	
	
   			<div class="row">
   					<div class="col-sm-6">
   						<legend><span class="number" >1</span>Your basic info</legend>
          					<label for="EmpID">Employee ID:</label>
          <input type="text" id="EmpID" name="Emp_ID" placeholder="Enter Emp ID here">
          
           <label for="EmpName">Employee Name:</label>
          <input type="text" id="EmpName" name="Emp_Name" placeholder="Enter Emp Name here">
          
          <label for="mail">Email:</label>
          <input type="email" id="mail" name="Emp_email" placeholder="Enter Emp Email here">
          
              <label for="mail">Code:</label>
          <input type="text" id="code" name="Code" placeholder="Enter Code here">
          
          <label for="DeskNo">DeskNo:</label>
          <input type="text" id="DeskNo" name="Desk_No" placeholder="Enter Desk No here">
  <button type="submit" onclick="alert1()">Order</button>
    </div>
   </div>
   </div>
   </td>

<td style="position:absolute;right:200px;top:150px">
<div>
	
    <img src="images\menu.jpg" alt="Northern Lights" width="350" height="500">  
 
</div> 
</td>
</tr>
</table>
</form>
</body>


























</body>
</html>