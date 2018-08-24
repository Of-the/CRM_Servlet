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
	<a href="User/UserAdd.jsp">新增员工</a>
	<table cellpadding="0" cellspacing="0" style="border-collapse:collapse" >
	<tr>
	<td>员工编号</td>
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
	<td>备注</td>
	</tr>
	<c:forEach var="i" items="${users}">
	<tr>
	<td>${i.user_id}</td>
	<td>${i.department_id}</td>
	<td>${i.role_id}</td>
	<td>${i.username}</td>
	<td>${i.is_male}</td>
	<td>${i.mobile}</td>
	<td>${i.age}</td>
	<td>${i.address}</td>
	<td>${i.is_admin}</td>
	<td>${i.is_system}</td>
	<td>${i.password}</td>
	<td>${i.tel}</td>
	<td>${i.id_num}</td>
	<td>${i.email}</td>
	<td>${i.hobby}</td>
	<td>${i.education}</td>
	<td>${i.card_num}</td>
	<td>${i.nation}</td>
	<td>${i.marry}</td>
	<td>${i.remark}</td>
<%-- 	<td>${i.status}</td>
	
	<td>${i.create_time}</td>
	<td>${i.creater}</td>
	<td>${i.update_time}</td>
	<td>${i.updater}</td> --%>
	<td><a href="UserDeleteServlet?user_id=${i.user_id}" >X</a>
	<a href="UserEditServlet?user_id=${i.user_id}">✎</a></td>
	</tr>
	
	
	</c:forEach>
	
	
	</table>
	
</body>
</html>