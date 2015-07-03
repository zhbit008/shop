<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="注册页面" />
    <jsp:param name="js" value="register" />
    <jsp:param name="css" value="index/register" />
</jsp:include>
<jsp:include page="../layout/nav.jsp"/>
<!-- 内容 -->
<div class="container main" style="border: 1px solid #CCC;">
    <div class="row">
        <div class="col-sm-12 hidden-xs" style="height:100px;">
        </div>
        <div class="col-md-6 col-sm-offset-1" id="main" style="border-right: 1px solid #CCC;">
            <img alt="logo" src="/resource/home/img/login.jpg"/>
        </div>
        <div class="col-md-5">
            <form  id="register"  action="/ajax/Home_system_registerValidate"  method="post" role="form">
                <div class="col-sm-12">
                    <label><h3><strong>注册新会员：</strong></h3></label>
                </div>
                <br/><br/>
                <div class="col-sm-10">
                    <div class="form-group">
                        <label for="username">用户名：</label>
                        <input  class="form-control" id="username" placeholder="请输入您的用户名" name="username"/>
                    </div>
                </div>
                <div class="col-sm-2">
                    <span id="info_LoginName" class="hide tips_error" style="margin-left: -5px;">不能为空</span>
                </div>
                <div class="col-sm-10">
                    <div class="form-group">
                        <label for="password1">密&nbsp;&nbsp;&nbsp;码：</label>
                        <input type="password" class="form-control" id="password1" placeholder="请输入您的密码"  name="password1"/>
                    </div>
                </div>
                <div class="col-sm-2">
                    <span id="info_PassWord1" class="hide tips_error" style="margin-left: -5px;">不能为空</span>
                </div>
                <div class="col-sm-10">
                    <div class="form-group">
                        <label for="password2">密&nbsp;&nbsp;&nbsp;码：</label>
                        <input type="password" class="form-control" id="password2" placeholder="请输入您的密码"  name="password2"/>
                    </div>
                </div>
                <div class="col-sm-2">
                    <span id="info_PassWord2" class="hide tips_error" style="margin-left: -5px;">不能为空</span>
                </div>
                <div class="col-sm-12">
                    <div class="radio-inline">
                        <input type="radio" name="login" id="customer" value="customer" checked/>客户
                    </div>
                    <div class="radio-inline">
                        <input type="radio" name="login" id="Smanager" value="Smanager"/>商家
                    </div>
                </div>

                <div class="col-sm-12">
                    <center><h6>
                        <label><input type="checkbox" id="check"/></label>
                        请阅读《艾家网用户协议》</h6></center>
                    <button id="submit" class="btn btn-success" onclick="return false;">同意以上协议并注册</button>
                </div>
            </form>
        </div>
        <div class="col-sm-12 hidden-xs" style="height:100px;">
        </div>
    </div>
</div>

<jsp:include page="../layout/footer.jsp"/>