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
<h2>编辑处</h2>
	<form action="MessageAddServlet">
	<table class="table-bordered">
	<tr>
		<td>收件人</td>
		<td>
		<select name="user_id">
		<c:forEach var="i" items="${users}">
		<option value="${i.user_id}">${i.username}</option>	
		</c:forEach>
		</select>
		</td>
	</tr>  
	<tr>
		<td>主题</td>
		<td><input type="text" name="subject" value="${message.subject }"></td>
	</tr>
	<tr>
		<td>内容</td>
		<td><textarea rows="20" cols="65" name="content">${message.content }</textarea></td>
	</tr>	
	</table>
		<input type="hidden" value="${message.message_id}" name="message_id">
		<input type="submit" value="发送" name="sub">
		<input type="submit" value="保存草稿" name="sub">
	</form>
</body>
</html>