<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobile Show</title>
</head>
<body>
<table>

<td>MOBILE SHOW</td>

<tr>

<td>Mobile id</td>
<td>Mobile name</td>
<td>Mobile Price</td>
<td>Mobile Category</td>
<td>Action</td>
</tr>
<a:forEach var="mob" items="${data}">
<tr>
<td> ${mob.mobId}</td>
<td> ${mob.mobName}</td>
<td> ${mob.mobPrice}</td>
<td> ${mob.mobCategory}</td>
<td><a href="purchase?mobname=${mob.mobName}">PURCHASE</a></td>
</tr>


</a:forEach>
</table>
</body>
</html>