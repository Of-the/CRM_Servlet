<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<base href="http://localhost:8080/CRM_S/">
<title>Insert title here</title>
<style type="text/css">

textarea{ resize:none;}
</style>
</head>
<body>
	<a>发布公告</a>
	<table>
	<form action="NoticeAddServlet">
	<tr>
	<td>发布时间</td>
	<td><input type="date" name="pub_time"></td>
	<td>截至时间</td>
	<td><input type="date" name="expire_time"></td>
	</tr>
	<tr>
	<td>主题</td>
	<td><input type="text" name="subject"></td>
	<td>通知范围</td>
	<td>
	<select name="receive_id">	
<!-- 	<option>全部</option>	 -->
	<option>1</option>	
	<option>2</option>	
	</select>	
	</td>
	</tr>	
	<tr>
	<td>内容</td>
	<td  colspan="3" ><textarea rows="15" cols="70" name="text"></textarea></td>
	</tr>
	<tr>
	<td colspan="2"><input type="submit" value="保存" style="margin-left: 180px;"></td></form>
	<td colspan="2"><form action="NoticeShowServlet"><input type="submit" value="返回" ></form></td>
	</tr>
</table>
	

</body>
</html>