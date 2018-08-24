<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>login</title>
<style>
body {
	background-color: #E0E0E0;
}

#ground {
	background-color: white;
	margin: 0 auto;
	margin-top: 300px;
	width: 500px;
	height: 400px;
}

#login {
	text-align: center;
	padding-top: 30px;
}

#name {
	margin-left: 170px;
}

#uname {
	color: #cccccc;
	outline: none;
	border-radius: 3px;
	border: 1px solid #cccccc;
}

input {
	margin-left: 100px;
	width: 300px;
	height: 35px;
	font-size: 15px;
}

#password {
	border: none;
	width: 280px;
	margin-left: 0px;
	outline: none;
	border-radius: 3px;
}

#ps {
	border: 1px solid #cccccc;
	width: 300px;
	margin-left: 100px;
	border-radius: 3px;
	outline: none;
}

img {
	width: 20px;
	margin-bottom: -6px;
	margin-right: 0px;
}

#img {
	width: 180px;
	height: 77px;
}

#check {
	margin-bottom: -4px;

}

#button {
	width: 305px;
	background-color: red;
	margin-left: 100px;
	margin-top: 5px;
	height: 40px;
	border: none;
	color: white;
	font-size: 18px;
	border-radius: 3px;
	cursor: pointer;
	outline: none;
}
#egg{
	
	padding-left: 280px;
	margin-top:-20px;
}
</style>
</head>

<body>
	<div id="ground">
		<div id="login">
			<img id="img" src="image/login.png">
		</div>
		<div id="name">智游客户关系管理系统</div>
		<br>
		<form action=UserLoginServlet name="form2" method="POST"
			onsubmit="return checkform2()">
			<input id="uname" type="text" name="username" value="请输入账号/邮箱/手机号"
				onfocus="if (value =='请输入账号/邮箱/手机号'){value =''}"
				onblur="if (value ==''){value='请输入账号/邮箱/手机号'}"><br> <br>
			<div id="ps">
				<span id="span"><input name="password" type=password
					id="password" /><img src="image/cang.gif" id="egg"
					onClick="change_pic()"></span>
			</div>
			<c:if test="${msg != null }">
			<script type="text/javascript">
			alert('${msg}');
			
			</script>
						
			</c:if>
			<p>
				<span style="margin-left: 150px; font-size: 15px"><img
					src="image/checkbox_normal.gif" id="check" onClick="check_png()">记住用户名和密码</span><br>
				<button id="button" onclick="btn">登&nbsp;录</button>
		</form>
	</div>
	<script>
		function change_pic() {
			var imgObj = document.getElementById("egg");
			var input = document.querySelector('#password');
			if (imgObj.getAttribute("src", 2) == "image/xian.gif") { //如果图片是显示
				imgObj.src = "image/cang.gif"; //点击变为隐藏
				input.type = 'password'; //同时密码变为password
			} else {
				imgObj.src = "image/xian.gif";
				input.type = 'text';
			}
		}
	</script>
	<script>
		function check_png() {
			var imgObj = document.getElementById("check");
			if (imgObj.getAttribute("src", 2) == "image/checkbox_normal.gif") { //如果图片是显示
				//点击变为隐藏
				imgObj.src = "image/checkbox_check.gif";
			} else {
				imgObj.src = "image/checkbox_normal.gif";
			}

		}
	</script>

	<script language="javascript">
		function checkform2() {
			if (document.form2.password.value.length < 1) {
				alert("密码为空");
				document.form2.password.focus();
				return false;
			}
			if (document.form2.uname.value.length < 1) {
				alert("用户名不能为空");
				document.form2.uname.focus();
				return false;
			}
			return true;
		}
	</script>

</body>

</html>