<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/home/layout/header.jsp"></jsp:include>
<jsp:include page="/WEB-INF/home/layout/nav.jsp"></jsp:include>
<!-- 内容 -->
<div class="container main" style="border: 1px solid #CCC;">
	<div class="row">
		<div class="col-md-8" id="main">
			<img alt="logo" src="/resource/home/img/login.jpg" style=" width:100%; display: block;"/>
		</div>
		<div class="col-md-4">
			<form  id="login"  action="consumer" onsubmit="javascript: return checkLogin();" method="post" role="form">
				<br/>
				<label><h2><strong>会员登录：</strong></h2></label>
				
				 <div class="form-group">
				    <label for="userName">用户名：</label>
				    <input  class="form-control" id="userName" placeholder="请输入您的用户名"/>
				  </div>
				  <div class="form-group">
				    <label for="Password">密码：</label>
				    <input type="password" class="form-control" id="Password" placeholder="请输入您的密码" />
				  </div>

				  <div class="checkbox">
				    <label>
				      <input type="checkbox"/> 记住密码
				    </label>
				  </div>
				  <button type="submit" class="btn btn-success">登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
				  &nbsp;&nbsp;&nbsp;
				  <button type="submit" class="btn btn-success">注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;册</button>
			</form>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/home/layout/footer.jsp"></jsp:include>