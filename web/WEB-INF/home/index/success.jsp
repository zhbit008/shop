<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="注册页面" />
    <jsp:param name="js" value="success" />
</jsp:include>
<jsp:include page="../layout/nav.jsp"/>

	<div class="container"  id="center">
		<div class="row">
			<br/>		
			<div class="col-sm-offset-4 col-sm-4" >
			<h1 style="color: #a51616;"><center><span class="glyphicon glyphicon-ok" ></span>恭喜登陆成功</center></h1>
			<br/><center>三秒后跳到首页</center>
			</div>
					
		</div>
	</div>
<jsp:include page="../layout/footer.jsp"/>