﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/home/layout/header.jsp"></jsp:include>
<jsp:include page="/WEB-INF/home/layout/nav.jsp"></jsp:include>
<!-- 内容 -->
<div class="container" style="border: 1px solid #CCC;">
	<div class="row">
		<div class="col-md-8" id="main">
			<img alt="100%x180" src="/resource/home/img/login.jpg" style=" width: 100%; display: block;"/>
		</div>
		<div class="col-md-4">
			<form  id="register"  action="#" onsubmit="javascript: return checkLogin();" method="post" role="form">
				<br/>
				<label><h2><strong>会员注册：</strong></h2></label>
				
				 <div class="form-group">
				    <label for="userName">用户名：</label>
				    <input  class="form-control" id="userName" placeholder="请输入您的用户名"/>
				  </div>
				  <div class="form-group">
				    <label for="Password1">密码：</label>
				    <input type="password" class="form-control" id="Password" placeholder="请输入您的密码"/>
				  </div>
				   <div class="form-group">
				    <label for="Password2">确定密码：</label>
				    <input type="password" class="form-control" id="Password2" placeholder="请再次输入密码"/>
				  </div>

                <div class="radio-inline">
                    <input type="radio" name="login" id="customer" value="customer"/>客户
                </div>
                <div class="radio-inline">
                    <!-- 	shop manager==Smanager -->
                    <input type="radio" name="login" id="Smanager" value="Smanager"/>分店店长
                </div>
               <center><h6>
               <label><input type="checkbox"/></label>
                请阅读《艾家网用户协议》</h6></center>
              <button type="submit" class="btn btn-success">同意以上协议并注册</button>
			</form>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/home/layout/footer.jsp"></jsp:include>