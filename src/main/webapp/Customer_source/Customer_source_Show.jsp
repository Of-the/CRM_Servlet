<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
<style type="text/css">

#tub{
	margin-left: 800px;
}
</style>
</head>

<body>
		<h2>客户来源</h2>
		<form action="Customer_source/Customer_source_Add.jsp">
		<input type="submit" class="tbu" value="新增">
			<table class="table-bordered">
				<tr>
				<td>序号</td>
				<td>客户来源</td>
				<td>来源说明</td>
				<td>更新时间</td>
				<td>操作</td>
				</tr>
				<c:forEach var="i" items="${cares }">
				<tr>
				<td>${i.customer_source_id}</td>
				<td>${i.customer_source_name}</td>
				<td>${i.customer_source_desc}</td>
				<td>${i.update_time}</td>
				<td><a href="Customer_source_Delete_Servlet?customer_source_id=${i.customer_source_id}">X</a>
				<a href="Customer_source_Edit_Servlet?customer_source_id=${i.customer_source_id}">✎</a></td>
				</tr>
				></c:forEach>
			
			
			
			</table>	
		</form>
</body>
</html>