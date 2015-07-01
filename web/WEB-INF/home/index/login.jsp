<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="登陆页面" />
    <jsp:param name="js" value="login" />
    <jsp:param name="css" value="index/login" />
</jsp:include>
<jsp:include page="../layout/nav.jsp" />
<!-- 内容 -->
<div class="container main" style="border: 1px solid #CCC;">
    <div class="row">
        <div class="col-sm-12 hidden-xs" style="height:100px;">
        </div>
        <div class="col-md-6 col-sm-offset-1" id="main" style="border-right: 1px solid #CCC;">
            <img alt="logo" src="/resource/home/img/login.jpg"/>
        </div>
        <div class="col-md-5">
            <form  id="login"  action="/ajax/Home_customer_loginValidate" method="post" role="form">
                <div class="col-sm-12">
                    <label><h3><strong>会员登录：</strong></h3></label>
                    <label style="float: right;margin-right: 15px;margin-top: 10px;"><a href=""><h4>还不是会员？立即注册</h4></a></label>
                </div>

                <div class="col-sm-10">
                    <div class="form-group">
                        <label for="username">用户名：</label>
                        <input  class="form-control" id="username" placeholder="请输入您的用户名" name="customer.username"/>
                    </div>
                </div>
                <div class="col-sm-2">
                    <span id="info_LoginName" class=" tips_error">不能为空</span>
                </div>
                <br/><br/><br/><br/>
                <div class="col-sm-10">
                    <div class="form-group">
                        <label for="password">密&nbsp;&nbsp;&nbsp;码：</label>
                        <input type="password" class="form-control" id="password" placeholder="请输入您的密码"  name="customer.password"/>
                    </div>
                </div>
                <div class="col-sm-2">
                    <span id="info_PassWord" class=" tips_error">不能为空</span>
                </div>
                <br/>
                <br/>
                <br/>
                <div class="checkbox col-sm-12">
                    <label>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="check" /> 记住密码
                    </label>
                </div>
                <div class="col-sm-12">
                    <button  id="submit" class="btn btn-success" onclick="return false;">登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
                </div>
            </form>
        </div>
        <div class="col-sm-12 hidden-xs" style="height:100px;">
        </div>
    </div>
</div>

<jsp:include page="../layout/footer.jsp"/>