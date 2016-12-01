<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<c:set var="base" value="${pagecontext.request.contextpath }"></c:set>
<body>
<a href="${base }/sys/user/tzadd.html">add</a>
<table>
  <tr>
    <th>name</th>
    <th>age</th>
    <th>编辑</th>
  </tr>
  <c:if test="${not empty requestScope.users }">
	  <c:forEach var="user" items="${requestScope.users }">
	      <tr>
	          <td>${user.name }</td>
	          <td>${user.age }</td>
	          <td>
	             <a href="${base }/sys/user/findTzUpdate.html?id=${user.id}">edit</a>&nbsp;&nbsp;&nbsp;&nbsp;
	             <a href="${base }/sys/user/deleteUser.html?id=${user.id}">delete</a>
	          </td>
	      </tr>
	  </c:forEach>
  </c:if>
</table>
</body>
</html>