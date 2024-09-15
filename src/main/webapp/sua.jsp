<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post" >
<c:forEach var="kh" items="${requestScope.data_new }">


id:<input type="text" name="id" value="${kh.id }">
ma:<input type="text" name="ma" value="${kh.makhach }">
name:<input type="text" name="ten" value="${kh.hoten }">
namsinh:<input type="text" name="date" value="${kh.namsinh }">
</c:forEach>
<br>
<input type="submit" value="+">








</form>
</body>
</html>