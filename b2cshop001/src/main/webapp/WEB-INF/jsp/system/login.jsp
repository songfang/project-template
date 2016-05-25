<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="basepath" value="${pageContext.request.contextPath}"/>
<%
String error=(String)request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
request.setAttribute("error",error);
%>
<html>
<head>
<title>b2cshop</title>
<link rel="stylesheet" type="text/css" href="../../../static/css/bglogin.css"/>
<script src="${basepath}/static/plugins/easyui/jquery/jquery-1.11.1.min.js"/>
<script>
	var captcha;
	function refreshCaptcha(){
		document.getElementById("img_captcha").src="${basepath}/static/images/kaptcha.jpg?t=" + Math.random();
	}
</script>
<style>
	.login_main{
		background:url('../../../static/images/login_bg.png');
		width:423px;height:366px;display:block;margin:auto;margin-top:30px;
	}
	.login_top{width:100%;height:150px;background-color:#0060A9;display:block;float:left;}
	
</style>
</head> 
<body>
	<div>
		<form id="loginForm" action="${basepath}/a/login" method="get">
			<div class="login_top">
				<div class="login_title">
				后台管理系统登录页 
				</div>
			</div>
			<div style="float:left;width:100%">
				<div class="login_main">
					<div class="login_main_top"></div>
					<div class="login_main_errortip">&nbsp;</div>
					<div class="login_main_ln">
						<input type="text" id = "username" value="admin"/>
					</div>
					<div class="login_main_pw">
						<input type="password" id="password" name="password" value="123456"/>
					</div>
					<div class="login_main_yzm">
						<div>
						<input type="text" id="captcha" name="captcha"/>
						<img alt="验证码" src="${basepath}/static/images/kaptcha.jpg" title="点击更换" id="img_captcha" onclick="javascript:refreshCaptcha();" style="height:45px;width:85px;float:right;margin-right:98px;"/>
						</div>
					</div>
					<div class="login_main_remb">
					<input id="rm" name="rememberMe" type="hidden">
					</div>
					<div class="login_main_submit">
					<button onclick=""></button>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>