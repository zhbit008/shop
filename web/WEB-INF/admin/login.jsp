<%--
  Created by zhbitcxy.
  User: Guangzi
  Date: 2015/6/25 0025
  Time: 2:04
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<jsp:include page="layout/header.jsp">
    <jsp:param name="title" value="登陆页面" />
    <jsp:param name="css" value="common.css,login/style.css" />
    <jsp:param name="js" value="app/login/login" />
</jsp:include>

<div class="page-container">
    <h1>家具商城后台登陆</h1>

    <form action="/ajax/Admin_user_loginValidate" method="post">
        <s:textfield name="admin.username" cssClass="username"  placeholder="用户名" autocomplete="off" /><br/>
        <s:password name="admin.password" cssClass="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" /><br/>
        <input type="button" value="登陆" class="button" id="submit"/>

    </form>
    <div class="connect">
        <p>{{$msg_en}}</p>
        <p style="margin-top:20px;">{{$msg_cn}}</p>
    </div>
</div>

</body>
</html>
