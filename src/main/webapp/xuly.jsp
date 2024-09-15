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
<script type="text/javascript">

function doDelete(id){
	if(confirm("xac nhan xoa khach hang co id ="+id)){
		window.location="delete?id="+id;
	}
}
</script>
<a href="them.jsp">them</a>

<table border="1px">

<tr>
<th>id</th>
<th>ma</th>
<th>ten</th>
<th>ngay sinh</th>
<th>lua chon</th>


</tr>

<c:forEach items="${applicationScope.data }" var="kh">

<c:set value="${kh.id }" var="id" target=""></c:set>

<tr>
<td>${id }</td>
<td>${kh.makhach}</td>
<td>${kh.hoten }</td>
<td>${kh.namsinh }</td>
<td>
<a href="update?id=${id}">Update</a> |
<a href="#" onclick="doDelete('${id}')">delete</a> 


</td>







</tr>







</c:forEach>









</table>
</body>
</html>