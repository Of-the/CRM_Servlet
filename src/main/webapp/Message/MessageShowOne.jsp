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
td {

	text-align: center;
	font-size: 16px;
}
#tt{
	border-right-style:none;
	border-left-style:none;
	border-top-style:none;

}

</style>

</head>
<body>
<h2>邮箱</h2>
	<form action="MessageFindServlet">
	<table class="table-bordered">

<tr>
		<td class="tt"><a href="MessageGoAddServlet"><h4>&nbsp;&nbsp;写邮件&nbsp;&nbsp;</h4></td>
		<td class="tt"><a href="MessageShowServlet"><h4>&nbsp;&nbsp;收件箱&nbsp;&nbsp;</h4></td>
		<td class="tt"><a href="MessageOutboxServlet"><h4>&nbsp;&nbsp;发件箱&nbsp;&nbsp;</h4></td>
		<td class="tt"><a href="MessageDraftShowServlet"><h4>&nbsp;&nbsp;草稿箱&nbsp;&nbsp;</h4></td>
		<td class="tt"><a href="MessageDustbinShowServlet"><h4>&nbsp;&nbsp;垃圾箱&nbsp;&nbsp;</h4></td>

	</tr>
	<tr>
		<td>序号</td>
		<td>
		<c:if test="${b==1}">发件人</c:if>
		<c:if test="${b==2}">收件人</c:if>
		<c:if test="${b==3}">收件人</c:if>
		<c:if test="${(message.receive_delete)==0}">发件人</c:if>
		<c:if test="${(message.send_delete)==0}">收件人</c:if>			
		</td>
		<td>主题</td>
		<td>内容</td>
		<td>发送时间</td>
		<td>操作</td>
	</tr>
		
	<tr>
		<td>${message.message_id}</td>
		<td>${message.username}</td>
		<td>${message.subject}</td>
		<td>${message.content}</td>
		<td>${message.send_time}</td>
		<td><a href="MessageDeleteServlet?message_id=${i.message_id}">X</a>
		</td>
	</tr>	
	
	</table>
		
		
	</form>
	
</body>
</html>