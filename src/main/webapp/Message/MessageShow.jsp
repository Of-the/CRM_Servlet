<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>

</head>
<body>
<h2>收件箱</h2>
	
	<form action="MessageShowServlet">
	总共${connte}条，当前第${pagevalue }页
	<c:if test="${connte%5==0}">
		<c:set var="page" value="${connte/5}"></c:set>
	</c:if>
	<c:if test="${connte%5!=0}">
		<c:set var="page" value="${connte/5+1}"></c:set>
	</c:if>
	<c:forEach var="i" begin="1" end="${page}">
		<input type="submit" value="${i}" name="page">
	</c:forEach>
	</form>
	<form action="MessageFindServlet">
	<table class="table-bordered">
	<tr>
	<td>搜索内容:<input type="text" name="text"> </td>
	<td>搜索字段:<select name="find">
	<option>标题</option>
	<option>内容</option>
	</select><input type="submit" value="搜索" name="sub"></td>
	</tr>
	<tr>
		<td>序号</td>
		<td>发件人</td>
		<td>主题</td>
		<td>发送时间</td>
		<td>操作</td>
	</tr>
	<c:forEach var="i" items="${messages}">	
	<tr>
		<td>${i.message_id}</td>
		<td>${i.username}</td>
		<td><a href="MessageShowOneServlet?message_id=${i.message_id}&b=1">${i.subject}</a></td>
		<td>${i.send_time}</td>
		<td><a href="MessageDeleteServlet?message_id=${i.message_id}">X</a></td>
	</tr>	
	</c:forEach>
	</table>
		
		
	</form>
</body>
</html>