<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <nav class="navbar navbar-inverse">
	    <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="container">
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="#">家具城</a>
			    </div>

			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                     <ul class="nav navbar-nav">
                        <li class="active"><a href="/home/index_index.html">首页 <span class="sr-only">(current)</span></a></li>
                        <li><a href="#">收藏夹</a></li>
                        <li><a href="/home/index_pay.html">购物车</a></li>
                        <li><a href="#">联系客服</a></li>

                     </ul>
                     <form class="navbar-form navbar-left" role="search">
                          <div class="form-group">
                          <input type="text" class="form-control" placeholder="Search"/>
                          </div>
                     <button type="submit" class="btn btn-default">搜索</button>
                     </form>

                     <s:if test="#session.customer==null">
                         <ul class="nav navbar-nav navbar-right">
                             <li><a href="/home/index_login.html">登录</a></li>
                             <li><a href="/home/index_register.html">注册</a></li>
                         </ul>
                     </s:if>
                     <s:else>
                         <ul class="nav navbar-nav navbar-right">
                             <li><a href="/home/index_massage.html?id=#session.customer.getId()"><s:property value="#session.customer.getNickname()"></s:property> </a></li>

                             <li class="dropdown ">
                                 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">消息 <span class="badge">3</span><span class="caret"></span></a>
                                 <ul class="dropdown-menu dropdown-menu-left media-list" role="menu">
                                     <li class="media">
                                         <a class="pull-left" href="#">
                                             <img class="media-object" src="/resource/home/img/try01.png"/>
                                         </a>
                                         <div class="media-body">
                                             <h6 class="media-heading">订单号：1000</h6>
                                             <div><a href=""><h6>去看看</h6></a></div>
                                         </div>
                                     </li>
                                     <li class="media">
                                         <a class="pull-left" href="#">
                                             <img class="media-object" src="/resource/home/img/try01.png"/>
                                         </a>
                                         <div class="media-body">
                                             <h6 class="media-heading">订单号：1000</h6>
                                             <div><a href=""><h6>去看看</h6></a></div>
                                         </div>
                                     </li>
                                     <li class="divider"></li>
                                     <li class="media">
                                         <a class="pull-left" href="#">
                                             <img class="media-object" src="/resource/home/img/try01.png"/>
                                         </a>
                                         <div class="media-body">
                                             <h6 class="media-heading">订单号：1000</h6>
                                             <div><a href=""><h6>去看看</h6></a></div>
                                         </div>
                                     </li>
                                 </ul>
                             </li>
                             <li><a href="/json/Home_customer_exitHandle">退出</a></li>
                         </ul>
                     </s:else>
			    </div><!-- /.navbar-collapse -->
			</div>
		</div><!-- /.container-fluid -->
	</nav>
