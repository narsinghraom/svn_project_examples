<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>top_adminView</title>
<h1 align="right">Welcome User</h1> 
<script type="text/javascript">
function addEmployee() 
{
	document.getElementById("ae").href;
	
}
</script>
<style>
table,th,td{
border: 1px solid black;
border-collapse: collapse;
}
th.td,h1{
padding:15px;
font-family: Footlight MT Light;
}

</style>

</head>
<body>
<input align="right" type="submit" name="logout" value=Logout>
<table>
<tr>
<td><a id="ae" href="Employee.html" target="frame_employee">AddEmployee</a><label for="AddEmployee"></label></td>

<td><a id="ve" href="ViewEmployee.jsp" target="frame_employee">ViewEmployee</a><label for="ViewEmployee"></label></td>
<td><a id="db" href="DataBackUp.jsp" target="frame_employee">DataBackup</a><label for="DataBackup"></label></td>

</tr>

</table>

</body>
</html>