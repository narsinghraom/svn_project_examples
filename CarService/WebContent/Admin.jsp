<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<script type="text/javascript">
function checkForm(form)
{
  if(form.AdminId.value == "") {
    alert("Error: Username cannot be blank!");
    form.AdminId.focus();
    return false;
  }
  re = /^\w+$/;
  if(!re.test(form.AdminId.value)) {
    alert("Error: Username must contain only letters, numbers and underscores!");
    form.AdminId.focus();
    return false;
  }
  if(form.AdminPassword.value != "" && form.AdminPassword.value == form.AdminPassword.value) {
      if(form.AdminPassword.value.length < 6) {
        alert("Error: Password must contain at least six characters!");
        form.AdminPassword.focus();
        return false;
      }
	
}
</script>



</head>
<body>
<form action="AdminRegServlet" method="post">
<table align="center">
<tr>
<td>Admin Id</td>
<td><input type="text" name="AdminId"  ></td>
</tr>
<tr>
<td>Admin Password</td>
<td><input type="password" name="AdminPassword" ></td>
</tr>
 <tr>
 <td></td>
 <td><input  type="submit" name="login " value="LOGIN" onsubmit="return checkForm(this);"></td>

</table>
</form>
</body>
</html>