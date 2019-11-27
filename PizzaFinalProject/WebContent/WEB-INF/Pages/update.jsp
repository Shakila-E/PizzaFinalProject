<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="performUpdate" modelAttribute="updateform">
<table>
<tr>
  <td><form:label path="totalPrice">Total price</form:label></td>
  <td><form:input path="totalPrice"></form:input></td>
 </tr>
 <tr>
    <td><form:label path="orderId">Order id</form:label></td>
    <td><form:input path="orderId"/></td>
 </tr>
 <tr>
    <td colspan="2">
       <input type="submit" value="Add details"/>
       </td>
       </tr>
</table>
</form:form>
</body>
</html>