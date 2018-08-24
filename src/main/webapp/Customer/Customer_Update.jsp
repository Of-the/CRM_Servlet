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

<body><form action="Customer_Update_Servlet">
		<h2>客户信息</h2>
			<table class="table-bordered">
				<tr>
				<td>客户姓名</td>
				<td>客户备注</td>
				<td>操作</td>
				</tr>
				<tr>			
				<td><input type="text" value="${care.customer_name}" name="customer_name"></td>
				<td><input type="text" value="${care.customer_remark}" name="customer_remark"></td>
				<td><input type="submit" value="提交">
				<input type="hidden" value="${care.customer_id}" name="customer_id">
				<a href="Customer_Show_Servlet?customer_id=${care.customer_id}">返回</a></td>
				</tr>
				
			</table>	
			</form>
</body>
</html>