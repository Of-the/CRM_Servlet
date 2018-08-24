<%@page import="com.practice1.model.Role"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
<style type="text/css">




#biao {
	width: 400px;
	height: 300px;
}
#f1{
	position: absolute;
	left: 1470px;
	top: 90px;
}
#biaoti{
	font-size: 20px;
	position: relative;
	left: 20px;
	top: 20px;
}
th {
	text-align: center;
}
nav {
	position: absolute;
	left: 1350px;
}
</style>
</head>
<body>
	<font id="biaoti">角色管理</font>
	<form id="f1" action="Role/RoleAdd.jsp">
	<input class="btn btn-default" style="background-color: #3c8dbc;color: #ffffff" type="submit" value="添加角色">
	</form>
	<div id="biao">
		<table width="1550" border="3" bordercolor="#eeeeee" height="260" style="text-align: center;margin-top: 110px;margin-left: 10px;">
			<tr>
				<th>序号</th>
				<th>角色名称</th>
				<th>角色描述</th>
				<th>更新时间</th>
				<th>操作</th>
			</tr>
			<c:forEach var="i" begin="0" end="${roles.size()-1}">
			<tr>
				<td>${current*10+i+1-10}</td>
				<td>${roles[i].role_name}</td>
				<td>${roles[i].remark}</td>
				<td>${roles[i].update_time}</td>
				<td><a style="color: black;" href="RoleEditServlet?role_id=${roles[i].role_id}">✎<i class='fa fa-pencil'></i></a><a style="margin-left: 30px;color: black;" href="RoleDeleteServlet?role_id=${roles[i].role_id}"><i class='fa fa-times'>X</i></a></td>
			</tr>

		</c:forEach>

		</table>
	</div>
	总${count}条 ，当前第${current}页
	<c:if test="${count%10 != 0}">
		<c:set var="page" value="${count/10+1}"></c:set>
	</c:if>
	<c:if test="${count%10 == 0}">
		<c:set var="page" value="${count/10}"></c:set>
	</c:if>
	<nav aria-label="Page navigation">
	<ul class="pagination">
		<c:if test="${current != 1}">
			<li><a href="RoleShowServlet?page=${current-1}"
				aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
			</a></li>
		</c:if>
		<c:if test="${current == 1}">
			<li><a href="RoleShowServlet?page=${current}"
				aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
			</a></li>
		</c:if>

		<c:forEach var="i" begin="1" end="${page}">
			<c:if test="${i == current }">
				<li class="active"><a href="#">${i }</a></li>
			</c:if>
			<c:if test="${i != current }">
				<li><a href="RoleShowServlet?page=${i}">${i }</a></li>

			</c:if>
		</c:forEach>
		
		<li><a href="RoleShowServlet?page=${current+1}" aria-label="Next">
				<span aria-hidden="true">&raquo;</span>
		</a></li>
	</ul>
	</nav>

</body>
</html>