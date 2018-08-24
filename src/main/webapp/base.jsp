<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<title>Document</title>
<style>
#left {
	width: 250px;
	height: 800px;
	background-color: #222d32;
}

.topBtn {
	background-color: rgba(0, 0, 0, 0);
}

.topBtnSelect {
	background-color: black;
	color: white;
	border-left: 4px solid #f39c12;
}

.icon {
	margin-left: 20px;
	margin-right: 20px;
}

button {
	outline: none;
	color: #abb;
	border: none;
	width: 100%;
	height: 44px;
	text-align: left;
}

button:hover {
	color: white;
}

.childBtn {
	background-color: #2c3a40;
}

.btnHidden {
	display: none;
}

#right {
	position: absolute;
	left: 250px;
	top: 50px;
}

#top {
	width: 100%;
	height: 50px;
	background-color: #3c8dbc;
}

#topT {
	color: white;
	font-size: 20px;
	line-height: 50px;
	/*padding-left: 20px;*/
	margin-left: 40px;
}

.topBtn2 {
	width: auto;
	height: 50px;
	background-color: rgba(0, 0, 0, 0);
	color: white;
	text-align: center;
	position: relative;
	top: -2px;
}

.topBtn2:hover {
	background-color: blue;
}

#user {
	position: absolute;
	right: 0px;
	top: 0px;
}

#quit {
	position: absolute;
	right: 80px;
	top: 0px;
}

#right {
	width: 75%;
	height: 750px;
	float: left;
	background: rgba(1, 1, 1, 0);
	margin: 20px;
	border: 2px solid #D2D6DE;
	border-top: 6px solid #D2D6DE;
}

#t {
	width: auto;
	background: #337AB7;
	color: white;
	line-height: 40px;
	position: relative;
	left: 1250px;
}

#bt td {
	border: 1px solid black;
	width: 600ox;
	height: 40px;
	align-content: center;
	padding: 10px 60px 10px 60px;
}

#bt {
	margin: 20px;
}

#right {
	width: 1660px;
	padding: -50px;
	margin: 0px;
}

iframe {
	overflow-x: hidden;
	overflow-y: hidden;
	width: 1660px;
	height: 800px;
	padding: -50px;
	margin: 0px;
}
</style>
</head>

<body>
	<div id="top">
		<font id="topT">客户管理信息</font>
		<button style="margin-left: 200px;" class="topBtn2">工作台</button>
		<button class="topBtn2">报表</button>
		<button class="topBtn2">客户信息</button>
		<button class="topBtn2">员工信息</button>
		<button class="topBtn2">公告信息</button>
		<button class="topBtn2">发件箱</button>
		<button id="quit" class="topBtn2"
			onclick="window.location.href='ExitUserServlet';">退出</button>
		<button id="user" class="topBtn2">${user.username}</button>
	</div>
	<div id="left">
		<!--客户管理-->
		<div>
			<button id="top1" class="topBtn" onclick="btnTop(this,childDiv1)">
				<font class="icon glyphicon glyphicon-list-alt"></font>客户管理
			</button>
		</div>
		<div id="childDiv1" class="btnHidden">
			<button class="childBtn" onclick="btnChild(this,i1_0,'客户信息')">
				<font id="i1_0" class="icon glyphicon glyphicon-star-empty"></font>客户信息
			</button>
			<button class="childBtn" onclick="btnChild(this,i1_1,'客户分配')">
				<font id="i1_1" class="icon glyphicon glyphicon-star-empty"></font>客户分配
			</button>
			<button class="childBtn" onclick="btnChild(this,i1_2,'客户关怀')">
				<font id="i1_2" class="icon glyphicon glyphicon-star-empty"></font>客户关怀
			</button>
			<button class="childBtn" onclick="btnChild(this,i1_3,'客户分类')">
				<font id="i1_3" class="icon glyphicon glyphicon-star-empty"></font>客户分类
			</button>
			<button class="childBtn" onclick="btnChild(this,i1_4,'客户状态')">
				<font id="i1_4" class="icon glyphicon glyphicon-star-empty"></font>客户状态
			</button>
			<button class="childBtn" onclick="btnChild(this,i1_5,'客户来源')">
				<font id="i1_5" class="icon glyphicon glyphicon-star-empty"></font>客户来源
			</button>
		</div>

		<!--内部信息-->
		<div>
			<button id="top2" class="topBtn" onclick="btnTop(this,childDiv2)">
				<font class="icon glyphicon glyphicon-briefcase"></font>内部信息
			</button>
		</div>
		<div id="childDiv2" class="btnHidden">
			<button class="childBtn" onclick="btnChild(this,i2_0,'通知公告')">
				<font id="i2_0" class="icon glyphicon glyphicon-star-empty"></font>通知公告
			</button>
			<button class="childBtn" onclick="btnChild(this,i2_1,'员工信息')">
				<font id="i2_1" class="icon glyphicon glyphicon-star-empty"></font>员工信息
			</button>
			<button class="childBtn" onclick="btnChild(this,i2_2,'部门信息')">
				<font id="i2_2" class="icon glyphicon glyphicon-star-empty"></font>部门信息
			</button>
		</div>
		<!--站内邮件-->
		<div>
			<button id="top3" class="topBtn" onclick="btnTop(this,childDiv3)">
				<font class="icon glyphicon glyphicon-envelope"></font>站内邮件
			</button>
		</div>
		<div id="childDiv3" class="btnHidden">
			<button class="childBtn" onclick="btnChild(this,i3_0,'写邮件')">
				<font id="i3_0" class="icon glyphicon glyphicon-star-empty"></font>写邮件
			</button>
			<button class="childBtn" onclick="btnChild(this,i3_1,'收件箱')">
				<font id="i3_1" class="icon glyphicon glyphicon-star-empty"></font>收邮件
			</button>
			<button class="childBtn" onclick="btnChild(this,i3_2,'发件箱')">
				<font id="i3_2" class="icon glyphicon glyphicon-star-empty"></font>发件箱
			</button>
			<button class="childBtn" onclick="btnChild(this,i3_3,'草稿箱')">
				<font id="i3_3" class="icon glyphicon glyphicon-star-empty"></font>草稿箱
			</button>
			<button class="childBtn" onclick="btnChild(this,i3_4,'垃圾箱')">
				<font id="i3_4" class="icon glyphicon glyphicon-star-empty"></font>垃圾箱
			</button>
		</div>
		<!--管理员-->
		<div>
			<button id="top4" class="topBtn" onclick="btnTop(this,childDiv4)">
				<font class="icon glyphicon glyphicon-user"></font>管理员
			</button>
		</div>
		<div id="childDiv4" class="btnHidden">
			<button class="childBtn" onclick="btnChild(this,i4_0,'公告管理')">
				<font id="i4_0" class="icon glyphicon glyphicon-star-empty"></font>公告管理
			</button>
			<button class="childBtn" onclick="btnChild(this,i4_1,'部门管理')">
				<font id="i4_1" class="icon glyphicon glyphicon-star-empty"></font>部门管理
			</button>
			<button class="childBtn" onclick="btnChild(this,i4_2,'角色管理')">
				<font id="i4_2" class="icon glyphicon glyphicon-star-empty"></font>角色管理
			</button>
			<button class="childBtn" onclick="btnChild(this,i4_3,'用户管理')">
				<font id="i4_3" class="icon glyphicon glyphicon-star-empty"></font>用户管理
			</button>
		</div>
	</div>
	<div id="right">
		<iframe src='RoleShowServlet' frameborder="0" scrolling="no" id="aaa"></iframe>


	</div>
	<script>
        var lastTopBtn = null;
        var lastTopDiv = null;
        function btnTop(top, childDiv) {
            if (top == lastTopBtn) {
                if (top.className == "topBtn") {
                    top.className = "topBtnSelect";
                    childDiv.style.display = "inline";
                } else {
                    top.className = "topBtn";
                    childDiv.style.display = "none";
                }
                return;
            }
            if (lastTopBtn != null) {
                lastTopBtn.className = "topBtn";
                lastTopDiv.style.display = "none";
            }
            top.className = "topBtnSelect";
            childDiv.style.display = "inline";
            lastTopBtn = top;
            lastTopDiv = childDiv;
        }
        var lastChildBtn = null;
        var lastChildIcon = null;
        function btnChild(btn, icon, args) {
            if (lastChildBtn != null) {
                lastChildBtn.style.color = "#abb";
                lastChildIcon.className = "icon glyphicon glyphicon-star-empty";
            }

            btn.style.color = "white";
            icon.className = "icon glyphicon glyphicon-star";
			if (args=="客户信息") {
			document.getElementById("aaa").src='Customer_Show_Servlet'
			}
			if (args=="客户分配") {
				document.getElementById("aaa").src='Customer_link_Servlet'
			}
			if (args=="客户关怀") {
				document.getElementById("aaa").src='Customer_care_Servlet'
			}
			if (args=="客户分类") {
				document.getElementById("aaa").src='Customer_category_Show_Servlet'
			}
			if (args=="客户状态") {
				document.getElementById("aaa").src='Customer_state_Show_Servlet'
			}
			if (args=="客户来源") {
				document.getElementById("aaa").src='Customer_source_Show_Servlet'
			}
			if (args=="通知公告") {
				document.getElementById("aaa").src='NoticeShow_Show_Servlet'
			}
			if (args=="员工信息") {
				document.getElementById("aaa").src='UserDescServlet'
			}
			if (args=="部门信息") {
				document.getElementById("aaa").src='DepartmentDescServlet'
			}
			if (args=="写邮件") {
				document.getElementById("aaa").src='MessageGoAddServlet'
			}
			if (args=="收件箱") {
				document.getElementById("aaa").src='MessageShowServlet'
			}
			if (args=="发件箱") {
				document.getElementById("aaa").src='MessageOutboxServlet'
			}
			if (args=="草稿箱") {				
				document.getElementById("aaa").src='MessageDraftShowServlet'
			}
			if (args=="垃圾箱") {
				document.getElementById("aaa").src='MessageDustbinShowServlet'
			}
			if (args=="公告管理") {
				document.getElementById("aaa").src='NoticeShowServlet'
			}
			if (args=="部门管理") {
				document.getElementById("aaa").src='DepartmentShowServlet'
			}
			if (args=="角色管理") {
				document.getElementById("aaa").src='RoleShowServlet'	
			}
			if (args=="用户管理") {				
				document.getElementById("aaa").src='UserShowServlet'
			}
			
		
            lastChildBtn = btn;
            lastChildIcon = icon;
            title.innerHTML = args;
            

        }
    </script>

</body>



</html>