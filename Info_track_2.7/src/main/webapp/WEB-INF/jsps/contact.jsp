<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONTACT</title>
</head>
<body bgcolor="pink">
<h2>registration</h2>
 <form action=" contact" method="post">
     <input type="hidden" name="id" value="${lead.id}">
 
   FNAME:<input type="text" name="firstName" value="${lead.firstName}">
   <br></br>
   LNAME:<input type="text" name="lastName" value="${lead.lastName}">
   <br></br>
   EMAIL:<input type="email" name="emailId" value="${ lead.emailId}">
   <br></br>
MOBILENO:<input type="number" name="mobileNo" value="${lead.mobileNo}">
<br></br>

 <input type="submit" value="converet">
 
 
 
 
 
 
 
 </form>

</body>
</html>