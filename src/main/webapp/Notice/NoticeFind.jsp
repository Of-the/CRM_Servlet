<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
<style type="text/css">
td {
	border:1px solid #000;
	text-align: center;
}

</style>

<base href="http://localhost:8080/CRM_S/">

</head>
<body>
	<a>公告管理</a><br>
	<table cellpadding="0" cellspacing="0" style="border-collapse:collapse" >
	<tr>
	<td>序号</td>
	<td>公告人</td>
	<td>公告主题</td>
	<td>通知范围</td>
	<td>公告内容</td>
	<td>公告时间</td>
	<td>截止时间</td>
	<td>操作</td>
	</tr>
		<c:if test="${conte%5==0}">
		<c:set var="page" value="${conte/5}"></c:set>
	</c:if>
	<c:if test="${conte%5!=0}">
		<c:set var="page" value="${conte/5+1}"></c:set>
	</c:if>
	<a href="NoticeShowServlet">返回</a>
	
	<c:forEach var="i" begin="1" end="${page}">
	
	<form action="NoticeFindServlet">
	<input type="hidden" value="${find}" name="find">
	<input type="hidden" value="${name}" name="name">
	<input type="submit" value="${i}" name="page">
	 </form>
	</c:forEach>
	
	<c:if test="${notices.size()>0}">
	<c:forEach var="i" begin="0" end="${notices.size()-1}">
	<tr>
	<td>${notices[i].notice_id}</td>
	<td>${notices[i].receive_id}</td>
	<td>${notices[i].subject}</td>
	<td>${notices[i].remark}</td>
	<td>${notices[i].text}</td>
	<td>${notices[i].pub_time}</td>
	<td>${notices[i].expire_time}</td>
	<td><a href="NoticeDeleteServlet?notice_id=${notices[i].notice_id}">X</a>
	<a href="NoticeEditServlet?notice_id=${notices[i].notice_id}">✎</a></td>
	</tr>
	</c:forEach>
	
	</c:if>
	<c:if test="${notices.size()==0}">
	<h1>没查找到公告</h1>
	
	</c:if>
	</table>
	总共${conte}条当前第${connte}页

</body>
</html>