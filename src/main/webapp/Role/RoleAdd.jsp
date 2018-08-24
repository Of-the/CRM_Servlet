<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
<base href="http://localhost:8080/CRM_S/">
<style type="text/css">
#role {
	background-color: royalblue;
	height: 35px;
	width: 66px;
	border-radius: 10px;
	position: fixed;
	color: #ffffff;
	position: relative;
	left: 100px;
	top: 60px;
}

#role a {
	color: #ffffff;
	position: fixed;
	margin-left: 17px;
	margin-top: 8px;
	position: fixed;
	margin-left: 17px;
	margin-top: 8px;
	position: relative;
}
td {
	border: 1px solid #eeeeee;
	padding: 20px;
}
#biao{
	position: absolute;
	top: 50px;
	left: 30px;
}
#niu1{
	position: absolute;
	top: 400px;
	left: 700px;
}
#niu2{
	position: absolute;
	top: 400px;
	left: 800px;
}
#ti1{
	font-size: 22px;
	position: relative;
	top: 10px;
	left: 10px;
}
#q1{
resize: none;
}
</style>
</head>
<body>
	<font id = "ti1">添加角色</font>
	<form action="RoleAddServlet">
		<table id="biao" border="3" bordercolor="#eeeeee">
			<tr>
				<td>角色名称</td>
				<td><input name="role_name" type="text" placeholder="填写角色名称"></td>
			</tr>
			<tr>
				<td>角色描述</td>
				<td><textarea id="q1" name="remark" rows="10" cols="220"></textarea></td>
			</tr>
		</table>
		<input id="niu1" class="btn btn-default" type="submit" style="background-color: #3c8dbc;color: #ffffff;" value="保存">
	</form>
	<form action="RoleShowServlet">
	<input id="niu2" class="btn btn-default" type="submit" style="background-color: #ffffff;color: #000000;" value="返回">
	</form>
</body>
</html>