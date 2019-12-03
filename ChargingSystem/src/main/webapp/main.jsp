<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>欢迎进入主页</title>
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.8.7/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.8.7/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.8.7/demo/demo.css">
	<script type="text/javascript" src="jquery-easyui-1.8.7/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.8.7/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<style type="text/css">
		.imgs{
			width:1100px;
			height: 100px;
			margin: 0 auto;
			
		}
		.imgs>div{
			width: 10%;
			height: 100px;
			float: left;
			text-align: center;
		}
				
		.items:hover{
			cursor: pointer;
			opacity:1;
			color:red;
		}	
		.active p{
			color: red;
		}
		
		.active{
			background:silver;
		}
		
		.left{
			width: 60%;
			height: 100%;
		}
		.right{
			width: 40%;
			height: 100%;
		}
		
		.center>div{
			float: left;
		}
		
		.left>div{
			width: 90%;
			height: 47%;
			background: #f5f5f5;
		}
		
		.center{
			padding: 10px;
		}
		.more{
			float: right;
		}
		
		.email_title{
			padding: 10px;
			border-bottom: 1px solid silver;
		}
		.agency_title{
			padding: 10px;
			border-bottom: 1px solid silver;
		}
		ul,li{
			list-style: none;
		}
		
		ul>li>div{
			width:100px;
			height:20px;
			line-height:20px;
			overflow:hidden;
			text-align:center;
			float: left;
			margin-top: 5px;	
		}
		
		.content_1{
			width: 400px;	
			text-align: left;
		}
		
		.email{
			margin-bottom: 15px;
		}
		
		.agency_content{
			height: 150px;
		}
	</style>
</head>
<body style="background: #fcfcfc">	
	<div class="easyui-layout" style="width: 1240px;height: 600px;margin:0 auto;">
		<div region="north" style="height: 100px;background: #fcfcfc">
			<div class="imgs" >
				<div id="main" class="items active">
					<img src="imgs/main.png">
					<p>主页</p>
				</div>
				<div id="role" class="items">
					<img src="imgs/js.png">
					<p>角色管理</p>
				</div>
				<div id="manager" class="items">
					<img src="imgs/admin.png">
					<p>管理员</p>
				</div>
				<div id="postage" class="items">
					<img src="imgs/zf.png">
					<p>资费管理</p>
				</div>
				<div id="finance" class="items">
					<img src="imgs/cw.png">
					<p>财务账户</p>
				</div>
				<div id="business" class="items">
					<img src="imgs/zh.png">
					<p>业务账户</p>
				</div>
				<div id="bill" class="items">
					<img src="imgs/zd.png">
					<p>账单管理</p>
				</div>
				<div id="report" class="items">
					<img src="imgs/bb.png">
					<p>报表</p>
				</div>
				<div id="info" class="items">
					<img src="imgs/ai.png">
					<p>${username['username'] }</p>
				</div>
				<div id="modify" class="items">
					<img src="imgs/pwd.png">
					<p>修改密码</p>
				</div>		
			</div>
		</div>	
		<div region="south" style="height: 100px;background: #fcfcfc">版权所有!!</div>	
		<div id="tt" region="center" class="easyui-tabs" style="width: 1240px;height:600px;background: #fcfcfc"  >
			<div title="main"  class="center">
			<div class="left">
				<div class="email">
					<div class="email_title">
						<span class="easyui-linkbutton" iconCls="icon-ok">邮件信息</span>
						<span class="easyui-linkbutton more" iconCls="icon-add">更多</span>
					</div>
					<div class="email_content">
						<ul>
							<li>
								<div class="content_1"><b>·</b> 豆个挖胆大年纪的拉动看的</div>
								<div>xieliping</div>
								<div>2019-10-09</div>
							</li>
							<li>
								<div class="content_1"><b>·</b> 豆个挖胆大年纪的拉动看的</div>
								<div>xieliping</div>
								<div>2019-10-09</div>
							</li>
							<li>
								<div class="content_1"><b>·</b> 豆个挖胆大年纪的拉动看的</div>
								<div>xieliping</div>
								<div>2019-10-09</div>
							</li>
							<li>
								<div class="content_1"><b>·</b> 豆个挖胆大年纪的拉动看的</div>
								<div>xieliping</div>
								<div>2019-10-09</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="agency">
					<div class="agency_title">
						<span class="easyui-linkbutton" iconCls="icon-ok">代办任务</span>
						<span class="easyui-linkbutton more" iconCls="icon-add">更多</span>
					</div>
					<div class="agency_content">
						<table class="easyui-datagrid" style="width: 100%;height: 80%">
							<thead>
								<tr>
									<th field="name" width="80%">代办1</th>
									<th field="date" width="20%">2019-10-12</th>
								</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
			<div class="right">
				<div class="job"></div>
				<div class="notice"></div>
				<div class="notice_1"></div>
			</div>
			</div>
		</div>	
	</div>	
	
	<script type="text/javascript">
		$(".items").each(function(){
			var text = $(this).attr("id");
			var url = text+".jsp";
			$(this).click(function(){
				openTab(text,url);
			})
		})
		
		function openTab(text,url){
			
			if($("#tt").tabs('exists',text)){
				
				$("#tt").tabs('select',text);
			}else{
				var content_1='<iframe style="width:100%;height:100%" frameborder="0" src="'+url+'"></iframe>';
				$("#tt").tabs('add',{
					title:text,
					content:content_1,
					closable:true
				})
			}
		}	
	</script>
	
	
</body>
</html>