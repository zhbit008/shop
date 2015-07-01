<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="个人信息"/>
    <jsp:param name="js" value="massage"/>
</jsp:include>
<jsp:include page="../layout/nav.jsp"/>

<!-- 内容 -->

<div style="background: #f5f5f5;">
    <div class="container" >
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-2">
                    <img src="/resource/home/img/massage.png"/>
                </div>
                <div class="col-sm-10">
                    <ul class="nav nav-tabs">
                        <li><a href="##" id="orderOnclick">所有订单</a></li>
                        <li><a href="##" id="massageOnclick">个人资料修改</a></li>
                        <li><a href="##">收藏夹</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-2" style="background: #FFF;">
                <div style="  border-bottom: 1px solid #000">
                    <br/>
                    <center>
                        <a  href="#">
                            <img class="img-responsive img-circle" src="/resource/home/img/header.png">
                        </a>
                    </center>

                    <center><h4><strong>亲爱的，铭尘沐风<br/>
                        欢迎回来</strong></h4></center>
                    <center><h6>您是T2会员,距离升级还有: 6261经验值</h6></center>
                    <br/>
                </div>
                <br/>
                <ul class="nav">
                    <center><li>我的天猫积分 233 积分</li></center>
                    <center><li>权益消费总额 可用额度</li></center>
                    <center><li>购物行为评级 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li></center>
                </ul>
                <br/>
            </div>

            <!-- /*个人订单*/ -->

            <div class="col-sm-9 col-sm-offset-1" style="background: #FFF;" id="order">
                <br/>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <ul class="nav">
                            <li class="col-sm-2"><center>宝贝</center></li>
                            <li class="col-sm-2"><center>订单号</center></li>
                            <li class="col-sm-1"><center>单价</center></li>
                            <li class="col-sm-1"><center>数量</center></li>
                            <li class="col-sm-2"><center>实付款((元)</center></li>
                            <li class="col-sm-2 dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="padding: 0;">交易状态 <span class="caret"></span></a>
                                <ul class="dropdown-menu dropdown-menu-left">
                                    <li><a href="#">等待买家付款</a></li>
                                    <li><a href="#">买家已付款</a></li>
                                    <li><a href="#">卖家已发货</a></li>
                                    <li><a href="#">交易成功</a></li>
                                    <li><a href="#">交易失败</a></li>
                                    <li><a href="#">退款中的订单</a></li>
                                </ul>
                            </li>
                            <li class="col-sm-2">交易操作</li>
                        </ul>
                    </div>
                </div>
                <br/>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <div class="checkbox">
                            <h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <label><input type="checkbox" /></label>
                                &nbsp;
                                <span class="glyphicon glyphicon-heart"></span>沐风旗舰店
                                <a href="#" style="background:url(/resource/home/img/qq.gif);background-position: -80px 0;  width: 20px;height: 20px;  display: inline-block;"></a></h4>
                        </div>
                    </div>
                    <div class="panel-body">
                        <div class="col-sm-2">
                            <img src="/resource/home/img/05.jpg" style="margin:15px 0;" />
                        </div>
                        <div class="col-sm-2">
                            <p style="margin-top: 50px"><center>0001</center></p>
                        </div>
                        <div class="col-sm-1">
                            <p style="margin-top: 50px"><center>200</center></p>
                        </div>
                        <div class="col-sm-1">
                            <p style="margin-top: 50px"><center>2</center></p>
                        </div>
                        <div class="col-sm-2">
                            <p style="margin-top: 50px"><center>200(含运费：0.00 )</center></p>
                        </div>
                        <div class="col-sm-2">
                            <ul class="nav">
                                <li><a href="#"> 交易成功</a></li>
                                <li><a href="#"> 订单详情</a></li>
                                <li><a href="#"> 查看物流</a></li>
                            </ul>
                        </div>
                        <div class="col-sm-2">
                            <ul class="nav">
                                <li><a href="#"> 追加评论</a></li>
                                <li><a href="#"> 删除订单</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /*个人资料修改*/ -->
            <div class="col-sm-9 col-sm-offset-1" style="background: #FFF;display: none;" id="massage">
                <br/>
                <section>
                    ${errorMsg}
                    <s:form role="form" action="customer_alter" method="post" namespace="/home" cssClass="form-horizontal">
                         <div class="col-sm-5" >
                              <h4><strong>昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</strong></h4>
                              <s:textfield  cssClass="form-control" id="nickName" name="nickName" placeholder="请输入昵称" key="nickName"/><br/>
                              <s:radio list="#{'man':' 男','woman':'  女'}" value="sex" name="sex" id="sex"></s:radio><br/>
                              <h4><strong>用户名：</strong></h4>
                              <s:textfield  cssClass="form-control" id="username" name="username" key="username" placeholder="请输入用户名" /><br/>
                              <h4><strong>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</strong></h4>
                              <s:password cssClass="form-control" id="password1" name="password1" key="password1" placeholder="请输入密码" /><br/>
                              <h4><strong>确认密码:</strong></h4>
                              <s:password cssClass="form-control" id="password2" name="password2" key="password2" placeholder="请再次输入密码"/><br/>
                         </div>
                        <div class="col-sm-5 col-sm-offset-2">
                             <h4><strong>真实姓名：</strong></h4>
                             <s:textfield cssClass="form-control" id="realname" name="realname" key="realname" placeholder="请输入真实名字" /><br/>
                             <h4><strong>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：</strong></h4>
                             <s:textfield cssClass="form-control" id="rel" name="rel" key="rel" placeholder="请输入电话"/><br/>
                             <h4><strong>电子邮箱：</strong></h4>
                             <s:textfield cssClass="form-control" id="email" name="email" key="email" placeholder="请输入您的邮箱地址"/><br/>
                             <s:submit cssClass="btn btn-success" value="确认提交" key="submit" /><br/>
                        </div>

                    </s:form>
                </section>
            </div>

        </div>
    </div>
</div>

<jsp:include page="../layout/footer.jsp"/>