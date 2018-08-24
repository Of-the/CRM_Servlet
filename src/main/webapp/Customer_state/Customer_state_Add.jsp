<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="http://localhost:8080/CRM_S/">
<title>Insert title here</title>
</head>
<body>
	<form action="Customer_state_Add_Servlet">
		<h2>客户状态</h2>
			<table class="table-bordered">
				<tr>
				<td>状态名称</td>
				<td>状态描述</td>
				</tr>
		
				<tr>			
				<td><input type="text" name="customer_state_name"></td>
				<td><input type="text" name="customer_state_desc"></td>
				</tr>	
				<input type="submit" value="提交">
			</table>	
			</form>
</body>
</html>