<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:errors path="cusBean.*"></form:errors>
<form:form action="toPlaceOrder" modelAttribute="customer">
<table>

 <tr>
  <td><form:label path="name">Name</form:label></td>
  <td><form:input path="name"></form:input></td>
 </tr>
 <tr>
    <td><form:label path="address">Address</form:label></td>
    <td><form:input path="address"/></td>
 </tr>
  <tr>
    <td><form:label path="phone">Phone</form:label></td>
    <td><form:input path="phone"/></td>
 </tr> 
 </table>
 
 Topping
 <select name="topping">
 <c:forEach var="choice" items="${result}">
 <option value="${choice.key}"> ${choice.value}</option>
 </c:forEach>
 <option value="${choice.key}"></select>
 
       <input type="submit" value="submit"/>
       </form:form>
</body>
</html>