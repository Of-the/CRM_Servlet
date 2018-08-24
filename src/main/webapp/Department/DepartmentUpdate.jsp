<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="DepartmentUpdateServlet">
	<table>	
	<tr>
	<td>序号</td><td><input type="text" name="department_id" value="${department.department_id}"></td>
	</tr>
	<tr>
	<td>名字</td><td><input type="text" name="department_name" value="${department.department_name}"></td>
	</tr>
	<tr>
	<td>描述</td><td><input type="text" name="department_desc" value="${department.department_desc}"></td>
	</tr>
	<tr>
	<td>权限</td><td><input type="text" name="status" value="${department.status}"></td>
	</tr>
	<tr>
	<td>情况</td><td><input type="text" name="remark" value="${department.remark}"></td>
	</tr>
	<tr>
	<td>创建时间</td><td><input type="text" name="create_time" value="${department.create_time}"></td>
	</tr>
	<tr>
	<td>创建者</td><td><input type="text" name="creater" value="${department.creater}"></td>
	</tr>
	<tr>
	<td>更新时间</td><td><input type="text" name="update_time" value="${department.update_time}"></td>
	</tr>
	<tr>
	<td>更新人</td><td><input type="text" name="updater" value="${department.updater}"></td>	
	</tr>
	<tr>
	<td><input type="submit" name="department_id"></td>
	</tr>
	
	
	
	</table>
	
</form>	
	
</body>
</html>