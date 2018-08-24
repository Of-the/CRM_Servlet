<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
	<td>序号</td>
	<td>名字</td>
	<td>描述</td>
	<td>权限</td>
	<td>情况</td>
	<td>创建时间</td>
	<td>创建者</td>
	<td>更新时间</td>
	<td>更新者</td>	
	
	</tr>
	<c:forEach var="n" items="${departments}">
		<tr>
		<td>${n.department_id}</td>
		<td>${n.department_name}</td>
		<td>${n.department_desc}</td>
		<td>${n.status}</td>
		<td>${n.remark}</td>
		<td>${n.create_time}</td>
		<td>${n.creater}</td>
		<td>${n.update_time}</td>
		<td>${n.updater}</td>
		</tr>
	</c:forEach>
	</table>
	
	</form>
</body>
</html>