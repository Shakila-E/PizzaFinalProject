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
<table>
<tr>
  <td><form:label path="customerId">id</form:label></td>
  <td><form:input path="customerId"></form:input></td>
 </tr>
 <tr>
    <td><form:label path="cname">name</form:label></td>
    <td><form:input path="cname"/></td>
 </tr>
 <tr>
    <td><form:label path="address">address</form:label></td>
    <td><form:input path="address"/></td>
 </tr>
 <tr>
    <td><form:label path="phone">phone</form:label></td>
    <td><form:input path="phone"/></td>
 </tr>
 </table>
</body>
</html>