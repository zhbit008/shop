<%--
  Created by zhbitcxy.
  User: Guangzi
  Date: 2015/6/25 0025
  Time: 3:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <base href="/">
    <title>${param.title}${param.WEB_NAME}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="keywords" content="${param.keywords}">
    <meta name="description" content="${param.description}">
    <%--<link rel="icon" href="" type="image/x-icon">--%>
    <link rel="stylesheet" href="/resource/admin/js/3rd/layer/1.9.3/skin/layer.css"/>
    <%
        String css = request.getParameter("css");
        String[] csses = css.split(",");
        for(String item : csses){
            out.print("<link rel=\"stylesheet\" href=\"/resource/admin/css/"+item+"\" />");
        }
    %>

    <script data-main="${param.js}" src="/resource/admin/js/entry.js"></script>
</head>
<body>

