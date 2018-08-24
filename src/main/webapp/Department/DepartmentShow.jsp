<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
form {
	text-align: center;
}

td {
	border: 1px solid #000;
	text-align: center;
	width: 80px;
}
</style>
</head>
<form action="DepartmentFindServlet">

	请输入搜索内容:<input type="text" name="findName"> <select name="find">
		<option value="姓名">姓名</option>
		<option value="描述">描述</option>
	</select> <input type="submit">
</form>
<body>
	<a href="Department/DepartmentAdd.jsp">添加角色</a>
	<table cellpadding="0" cellspacing="0" style="border-collapse: collapse">
		<c:if test="${count%10==0}">
			<c:set value="${count/10}" var="page">
			</c:set>
		</c:if>
		<c:if test="${count%10!=0}">
			<c:set value="${count/10+1}" var="page">
			</c:set>
		</c:if>

		<c:forEach var="i" begin="1" end="${page}">
			<a href="DepartmentShowServlet?page=${i}">${i}</a>
			<%-- 	<c:set var="max" value="${i}"></c:set> --%>

		</c:forEach>

		<%-- 	<c:if test="${current != max }">
		<a style="font-size: 40px;"
			href="DepartmentShowServlet?page=${current+1}">&raquo;</a>
	</c:if> --%>
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
			<td>备注</td>

		</tr>
		<c:forEach var="n" begin="0" end="${departments.size()-1}">
			<tr>
				<td>${current*10+n+1-10}</td>
				<td>${departments[n].department_name}</td>
				<td>${departments[n].department_desc}</td>
				<td>${departments[n].status}</td>
				<td>${departments[n].remark}</td>
				<td>${departments[n].create_time}</td>
				<td>${departments[n].creater}</td>
				<td>${departments[n].update_time}</td>
				<td>${departments[n].updater}</td>
				<input type="hidden" value="${departments[n].department_id}"
					name="department_id">
				<td><a
					href="DepartmentDeleteServlet?department_id=${departments[n].department_id}">X</a>
					<a
					href="DepartmentEditServlet?department_id=${departments[n].department_id}">✎</a></td>
			</tr>
		</c:forEach>
	</table>
	</form>
	<a>总共${count}条 当前第${current}页</a>
</body>
</html>