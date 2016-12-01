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
<form action="${base }/sys/user/saveUser.html">
    <input type="text" name="name"/>
    <input type="text" name="age"/>
    <input type="submit" value="submit"> 
</form>
</body>
</html>