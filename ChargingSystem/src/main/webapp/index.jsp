<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>欢迎使用XXX计费系统</title>
	<style type="text/css">
		.bg{
			width: 1000px;
			height: 500px;
			margin: 0 auto;
			background-image: url("imgs/timg.jpg");
			margin-top: 100px;
			position: relative;
		}
		
		body{
			background: #ede8cf;	
		}
		
		.register{
			height:300px;
			width: 250px;
			position: absolute;
			right: 20px;
			top:150px;
			text-align: center;
		}
		
		.register input{
			margin-bottom: 30px;
		}
		
		#ipt{
			width: 200px;
		}
		
		.error{
			margin-bottom: 20px;
		}
	</style>
</head>
<body>
	<div class="bg">
		<div class="register">
			<div class="error">
				<font color="red">${error }</font>
			</div>
			<form action="login" method="post">
				<label>用户名：</label>
				<input type="text" name="username" placeholder="QQ/邮箱/电话"/>
				<label>密&nbsp;&nbsp;&nbsp;码：</label>
				<input type="password" name="password" placeholder="密码">
				
				<input id="ipt" type="submit" value="Login"/>
				
				<p><a href="register.jsp">还没注册？点击这里</a></p>
			</form>
		</div>
	</div>
</body>
</html>