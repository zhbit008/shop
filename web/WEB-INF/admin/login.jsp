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
</jsp:include>
<body>
    <s:form action="user_loginValidate" namespace="/admin" method="post">
        帐号：<s:textfield name="user.username" label=""/><br/>
        密码：<s:textfield name="user.password" label=""/><br/>
        <s:submit value="登陆"/>
    </s:form>
</body>
</html>
