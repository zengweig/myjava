<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/modify.css"/>
</head>
<body>
	<div class="modify_box">
		<p style="color:orange;font-size: 20px;">为了您的账户安全,输入密码时请注意遮挡</p>
		<ol>
			<li>谨防木马,修改密码时请先杀毒。</li>
			<li>建议不要使用生日作为密码。</li>
		</ol>
		
		<div class="fm">
			<form action="modify" method="post">
				<p>当前登录的用户是：${username }</p>
				<p><span class="red">*</span> 
					旧密码：<input type="password" name="old_pwd" required="true"/>
					<font color="red" size="2">${message1 }</font>
				</p>
				<p><span class="red">*</span> 
					新密码：<input type="password" name="new_pwd" required="true"/>
					<font color="silver" size="2">密码由6-16位字符组成,区分大小写,不能是纯数字</font>
				</p>
				<p><span class="red">*</span> 
					确认新密码：<input type="password" name="new_pwd2" required="true"/>
					<font color="red" size="2">${message }</font>
				</p>
				<p><input type="submit" value="确认修改"/></p>							
			</form>
		</div>
	</div>
	<script type="text/javascript" src="jquery-easyui-1.5.3/jquery.min.js"></script>
	<script type="text/javascript">
		var flag ="${flag}";
		if(flag){
			alert("修改成功！")
		}
	</script>
	
</body>
</html>