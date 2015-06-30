﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="注册页面" />
    <jsp:param name="js" value="register" />
</jsp:include>
<jsp:include page="../layout/nav.jsp"/>
<!-- 内容 -->
<div class="container" style="border: 1px solid #CCC;">
	<div class="row">
		<div class="col-md-8" id="main">
			<img alt="100%x180" src="/resource/home/img/login.jpg" style=" width: 100%; display: block;"/>
		</div>
		<div class="col-md-4">
			<form  id="register"  action="/ajax/Home_system_registerValidate"  method="post" role="form">
				 <br/>
				<label><h2><strong>会员注册：</strong></h2></label>
				
				 <div class="form-group">
				    <label for="username">用户名：</label>
				    <input  class="form-control" id="username" placeholder="请输入您的用户名" name="username"/>
				 </div>
                 <div class="form-group">
                    <label for="password1">密码：</label>
                    <input type="password" class="form-control" id="password1" placeholder="请输入您的密码" name="password1"/>
                 </div>
                 <div class="form-group">
                    <label for="password2">确定密码：</label>
                    <input type="password" class="form-control" id="password2" placeholder="请再次输入密码" name="password2"/>
                 </div>

                <div class="radio-inline">
                    <input type="radio" name="login" id="customer" value="customer" checked/>客户
                </div>
                <div class="radio-inline">
                    <!-- 	shop manager==Smanager -->
                    <input type="radio" name="login" id="Smanager" value="Smanager"/>商家
                </div>

               <center><h6>
               <label><input type="checkbox"/></label>
                请阅读《艾家网用户协议》</h6></center>
              <button id="submit" class="btn btn-success" onclick="return false;">同意以上协议并注册</button>
			</form>
		</div>
	</div>
</div>

<jsp:include page="../layout/footer.jsp"/>