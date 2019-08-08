<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="css\main.css" type="text/css" rel="stylesheet">

<style>
.index{
	padding-left:37%;
	padding-right:37%;

}
.index2{
	
		padding-top:5%;
}
</style>
</head>
<body>
<center>
<div class="index2"><img src="images/logo.png" height="150px" width="200px"></div>
	<div >
		<h1 >GRIZZLY STORE</h1>
		<div class="index"><hr></div>
	</div>
	<br>
	<div class="index">
<springform:form modelAttribute="admin" method="post" action="doLogin.htm">
<table>
<tr>

<td><springform:input path="userName" class="borderRound" placeholder="UserName"/>
</td>
</tr>
<tr>

<td><springform:input path="password" class="borderRound" placeholder="Password"/>
</td>
</tr>
<tr>
<td><input id="button1" type="submit" value="Login"></td>
</tr>
</table>
<springform:errors path="userName" style="color:red"></springform:errors>

</springform:form>
</div>
</center>
</body>
</html>