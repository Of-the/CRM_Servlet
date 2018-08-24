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

</head>
<body>
	<a>公告通知</a><br>	
	
	<c:if test="${count%10==0}">
		<c:set value="${count/10}" var="page"></c:set>	
	</c:if>
	<c:if test="${count%10!=0}">
		<c:set value="${count/10+1}" var="page"></c:set>	
	</c:if>
	<c:forEach var="i" begin="1" end="${page}">
	
	<a href="NoticeShowServlet?page=${i}">${i}</a>
	
	
	</c:forEach>
	<a>总共${count}条，当前第${current}页</a>
	<form action="NoticeFindServlet">
	 搜索内容:<input type="text" name="name">&nbsp;&nbsp;
	 搜索字段:<select name="find">
<option value="主题">主题</option>
<option value="内容">内容</option>&nbsp;&nbsp;
</select>
	<input type="submit" value="搜索">
	</form>
	<table cellpadding="0" cellspacing="0" style="border-collapse:collapse" >
	<tr>
	<td>序号</td>
	<td>公告人</td>
	<td>公告主题</td>
	<td>通知范围</td>
	<td>公告内容</td>
	<td>公告时间</td>
	<td>截止时间</td>
	</tr>
	
	<c:forEach var="i" begin="0" end="${notices.size()-1}">
	<tr>
	<td>${notices[i].notice_id}</td>
	<td>${notices[i].receive_id}</td>
	<td>${notices[i].subject}</td>
	<td>${notices[i].remark}</td>
	<td>${notices[i].text}</td>
	<td>${notices[i].pub_time}</td>
	<td>${notices[i].expire_time}</td>
	</tr>
	</c:forEach>
	
	</table>
</body>
</html>