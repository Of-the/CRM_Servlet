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

<body><form action="Customer_care_Edit_Servlet">
		<h2>客户关怀</h2>
			<table class="table-bordered">
				<tr>
				<td>顾客序号</td>
				<td>主题</td>
				<td>描述</td>
				<td>更新时间</td>
				<td>操作</td>
				</tr>
		
				<tr>			
				<td><input type="text" value="${care.customer_care_id}" name="customer_care_id"></td>
				<td><input type="text" value="${care.care_subject}" name="care_subject"></td>
				<td><input type="text" value="${care.remark}" name="remark"></td>
				<td><input type="text" value="${care.update_time}" name="update_time"></td>
				<td><input type="submit" value="提交">
				<input type="hidden" value="${care.customer_care_id}" name="customer_care_id">
				<a href="Customer_care_Servlet?customer_care_id=${care.customer_care_id}">返回</a></td>
				</tr>	
			</table>	
			</form>
</body>
</html>