<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/info.css">
	<script type="text/javascript">
		var user="${userId}";
		var phone="${phone}";
		if(phone==""){
			window.location.href="getInfo?username="+user;
		}
	</script>
</head>
<body>
	
	<p><b>号码信息</b></p>
	<div class="top">
		<span>当前状态：${phone.getStatus() }</span>
		<span>用户类型：${phone.getType() }</span>
		<span>入网时间：${phone.getAdmission() }</span>
		<span>通话级别：${phone.getLevel() }</span>
		<span>所属品牌：${phone.getBrand() }</span>
	</div>
	<p><b>个人基本信息</b></p>
	<div class="bottom">
		<div>
			<span>用户姓名：${basic.getName() }</span>
			<span>当前套餐：${basic.getMeal() }</span>
			<span>用户级别：${basic.getLevel() }</span>
			<span>证件类型：${basic.getPapers() }</span>
		</div>
		<div>
			<span>证件号码：${basic.getPapers_number() }</span>
			<span>客户经理：${basic.getAccount_manager() }</span>
			<span>服务热线：${basic.getHotline() }</span>
			<span>账单户名：${basic.getBill_name() }</span>
		</div>
		<div>
			<span>付费方式：${basic.getPay_method() }</span>
			<span>Email：${basic.getEmail() }</span>
			<span>寄送地址：${basic.getAddress() }</span>
		</div>
	</div>
</body>
</html>