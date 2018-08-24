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
		<h2>客户关怀</h2>
		<form action="Customer_care/Customer_care_Add.jsp">
		<input type="submit" class="tbu" value="新增">
			<table class="table-bordered">
				<tr>
				<td>顾客序号</td>
				<td>主题</td>
				<td>描述</td>
				<td>更新时间</td>
				<td>操作</td>
				</tr>
				<c:forEach var="i" items="${cares }">
				<tr>
				<td>${i.customer_care_id}</td>
				<td>${i.care_subject}</td>
				<td>${i.remark}</td>
				<td>${i.update_time}</td>
				<td><a href="Customer_care_Delete_Servlet?customer_care_id=${i.customer_care_id}">X</a>
				<a href="Customer_care_Update_Servlet?customer_care_id=${i.customer_care_id}">✎</a></td>
				</tr>
				></c:forEach>
			
			
			
			</table>	
		</form>
</body>
</html>