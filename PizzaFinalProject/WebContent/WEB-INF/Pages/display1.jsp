<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="remove" modelAttribute="pizza1">
<table>
<tr>
  <td><form:label path="customerId" >Customer id</form:label></td>
  <td><form:input path="customerId" readonly="true"></form:input></td>
 </tr>
 <tr>
    <td><form:label path="address">address</form:label></td>
    <td><form:input path="address" readonly="true"/></td>
 </tr>
  <tr>
    <td><form:label path="phone">phone</form:label></td>
    <td><form:input path="phone" readonly="true"/></td>
 </tr>
 <tr>
    <td colspan="2">
       <input type="submit" value="Remove details"/>
       </td>
       </tr>
</table>
</form:form>
</body>
</html>