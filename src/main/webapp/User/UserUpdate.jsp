<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">

form {
	text-align: center;
}
td {
	border:1px solid #000;
	text-align: center;
}


</style>
</head>
<body>

	<form action="UserUpdateServlet">
	
	<table cellpadding="0" cellspacing="0" style="border-collapse:collapse" >
	<tr>
	<td>部门编号</td>
	<td>角色编号</td>
	<td>员工姓名</td>
	<td>性别</td>
	<td>电话</td>
	<td>年龄</td>
	<td>住址</td>
	<td>是否管理员</td>
	<td>是否内置</td>
	<td>密码</td>
	<td>座机</td>
	<td>身份证</td>
	<td>E_mail</td>
	<td>爱好</td>
	<td>学历</td>
	<td>工资卡号</td>
	<td>民族</td>
	<td>婚姻状况</td>
	<td>操作备注</td>
	<!-- <td>用户状态</td>
	
	<td>添加时间</td>
	<td>添加人</td>
	<td>修改时间</td>
	<td>修改人</td> -->
	</tr>

	<tr>
		<td><input type="text" value="${user.department_id}" name="department_id"></td>
		<td><input type="text" value="${user.role_id}" name="role_id"></td>
		<td><input type="text" value="${user.username}" name="username"></td>
		<td><input type="text" value="${user.is_male}" name="is_male"></td>
		<td><input type="text" value="${user.mobile}" name="mobile"></td>
		<td><input type="text" value="${user.age}" name="age"></td>
		<td><input type="text" value="${user.address}" name="address"></td>
		<td><input type="text" value="${user.is_admin}" name="is_admin"></td>
		<td><input type="text" value="${user.is_system}" name="is_system"></td>
		<td><input type="text" value="${user.password}" name="password"></td>
		<td><input type="text" value="${user.tel}" name="tel"></td>
		<td><input type="text" value="${user.id_num}" name="id_num"></td>
		<td><input type="text" value="${user.email}" name="email"></td>
		<td><input type="text" value="${user.hobby}" name="hobby"></td>
		<td><input type="text" value="${user.education}" name="education"></td>
		<td><input type="text" value="${user.card_num}" name="card_num"></td>
		<td><input type="text" value="${user.nation}" name="nation"></td>
		<td><input type="text" value="${user.marry}" name="marry"></td>
		<td><input type="text" value="${user.remark}" name="remark"></td>
			
				<%-- 	<td>${i.status}</td>
	
	<td>${i.create_time}</td>
	<td>${i.creater}</td>
	<td>${i.update_time}</td>
	<td>${i.updater}</td> --%>
	</tr>	
	</table>
		<input type="hidden" name="user_id" value="${user.user_id}">
	<input type="submit">
	</form>

</body>
</html>