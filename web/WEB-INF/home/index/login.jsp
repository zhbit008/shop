<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="登陆页面" />
    <jsp:param name="js" value="login" />
    <jsp:param name="css" value="index/register" />
</jsp:include>
<jsp:include page="../layout/nav.jsp" />
<!-- 内容 -->
<div class="container main" style="border: 1px solid #CCC;">
	<div class="row">
		<div class="col-md-8" id="main">
			<img alt="logo" src="/resource/home/img/login.jpg" style=" width:100%; display: block;"/>
		</div>
		<div class="col-md-4">
			<form  id="login"  action="/ajax/Home_customer_loginValidate" method="post" role="form">
				<br/>
				<center><label><h2><strong>会员登录：</strong></h2></label></center>
                <div class="hide alert alert-danger" id="warning-block-login">
                    <h5>Warning!<em id="warn-login"></em></h5>
                </div>
				 <div class="form-group">
				    <label for="username">用户名：</label>
				    <input  class="form-control" id="username" placeholder="请输入您的用户名" name="customer.username"/>
				  </div>
				  <div class="form-group">
				    <label for="password">密码：</label>
				    <input type="password" class="form-control" id="password" placeholder="请输入您的密码"  name="customer.password"/>
				  </div>

				  <div class="checkbox">
				    <label>
				      <input type="checkbox" name="check" /> 记住密码
				    </label>
				  </div>
				  <button  id="submit" class="btn btn-success">登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
				  &nbsp;&nbsp;&nbsp;
				  <button  class="btn btn-success">注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;册</button>
			</form>
		</div>
	</div>
</div>

<jsp:include page="../layout/footer.jsp"/>