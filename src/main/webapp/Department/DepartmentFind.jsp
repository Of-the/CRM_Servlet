<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Insert title here</title>

<style type="text/css">

form {
	text-align: center;
}
td {
	border:1px solid #000;
	text-align: center;
	width: 80px;
}


</style>
</head>
<body>
<table cellpadding="0" cellspacing="0" style="border-collapse:collapse" >
<tr>
	<td>用户ID</td>
	<td>名字</td>
	<td>描述</td>
	<td>权限</td>
	<td>情况</td>
	<td>创建时间</td>
	<td>创建者</td>
	<td>更新时间</td>
	<td>更新者</td>	
	
	</tr>
	<c:if test="${department.size()>0}">
	<c:forEach var="n" begin="0" end="${department.size()-1}">
		<tr>	
		<td>${1*10+n+1-10}</td>
		<td>${department[n].department_name}</td>
		<td>${department[n].department_desc}</td>
		<td>${department[n].status}</td>
		<td>${department[n].remark}</td>
		<td>${department[n].create_time}</td>
		<td>${department[n].creater}</td>
		<td>${department[n].update_time}</td>
		<td>${department[n].updater}</td>
		<input type="hidden" value="${departments[n].department_id}" name="department_id" >
	
	</tr>
	
	</c:forEach>
</c:if>

</table>
</body>
</html>