<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="商品展示页"/>
</jsp:include>
<jsp:include page="../layout/nav.jsp"/>
	
	<div class="container">
		<!-- 头部物品介绍 -->
        <ol class="breadcrumb">
            <li><a href="#">首页</a></li>
            <li><a href="#">书桌</a></li>
            <li class="active">类型</li>
        </ol>
		<ul class="media-list">
		    <li class="media">
		        <a class="pull-left" href="#">
		            <img class="media-object" src="/upload/product/${requestScope.product.image}.jpg" alt="...">
		        </a>
		        <div class="media-body" style="">
		        	<br/>
		            <h3 class="media-heading"><strong>${requestScope.product.name}</strong></h3>
		            <br/>
		            <div>
			            <strong><h4>${requestScope.product.title}<br/><br/></h4></strong>
						<h5><p>${requestScope.product.describe}</p>
						<p>推荐人群：${requestScope.product.love}</p>
						<p>所属标签：卧房，伊丽莎白</p>
						<p>网上优惠价：<em style="  font-size: 24px;
	  color: #a51616;">￥${requestScope.product.salePrice}</em>（仅供参考 请以实际成交价为准）</p>
						<p>优惠截止日期：${requestScope.product.dateline}</p>
						<p>套餐所含件数：${requestScope.product.saleNum}件套</p>
						<p>定制周期：30天左右（视配送距离而定）</p></h5>
					</div>
					<br/><br/>
					<center>
					<button class="btn btn-danger" type="button" href="${requestScope.product.id}">加入购物车</button>
					&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/home/shoppingCart_index" class="btn btn-danger">立即&nbsp;购买</a>
					</center>
		        </div>
		    </li>
		</ul>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<!-- 商家 -->
					<div class="panel panel-default">
					    <div class="panel-heading">
					    沐风旗舰店
					    <a href="#" style="background:url(/resource/home/img/qq.gif);background-position: -80px 0;  width: 20px;height: 20px;  display: inline-block;"></a>
					    </div>
					    <div class="panel-body">
					    	<center><h4>信誉度 服务度 物流度</h4></center>
					    	<center><h4 style="  font-size: 24px;
	  color: #a51616;">4.8&nbsp;&nbsp;&nbsp;  4.8 &nbsp;&nbsp;  5.0</h4></center>
	  <center>
					<button class="btn btn-success" type="button" href="${requestScope.product.storeId}">进店逛逛</button>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<button class="btn btn-success" type="button" href="${requestScope.product.storeId}">收藏店铺</button>
					</center>
						</div>
					</div>
				<!-- 选项卡组件（菜单项nav-tabs）-->
				<!-- 热销排行与最近浏览 -->
					<ul id="myTab" class="nav nav-tabs" role="tablist">
					    <li class="active"><a href="#bulletin" role="tab" data-toggle="tab">热销排行</a></li>
					    <li><a href="#rule" role="tab" data-toggle="tab">最近浏览</a></li>
					</ul>
				<!-- 选项卡面板 -->
					<div id="myTabContent" class="tab-content">
						<div class="tab-pane active" id="bulletin" style="border:1px solid #CCC;">
							<div class="media" style="margin-top: 5px;">		
								<center>
								<a class="pull-left" href="#">
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="...">
							  	</a>
							  	<div class="media-body">
							    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">fire</span></h4>
							    	<div style="margin: 0 15px;">全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
							  	</div>
							  	</center>
							</div>
							<div class="media" style="margin-top: 5px;">		
								<center>
								<a class="pull-left" href="#">
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="...">
							  	</a>
							  	<div class="media-body">
							    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">fire</span></h4>
							    	<div style="margin: 0 15px;">全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
							  	</div>
							  	</center>
							</div>
							<div class="media" style="margin-top: 5px;">		
								<center>
								<a class="pull-left" href="#">
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="...">
							  	</a>
							  	<div class="media-body">
							    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">fire</span></h4>
							    	<div style="margin: 0 15px;">全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
							  	</div>
							  	</center>
							</div>						
						</div>
						<div class="tab-pane" id="rule" style="border:1px solid #CCC;">
							<div class="media" style="margin-top: 5px;">		
								<center>
								<a class="pull-left" href="#">
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="...">
							  	</a>
							  	<div class="media-body">
							    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">fire</span></h4>
							    	<div style="margin: 0 15px;">全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
							  	</div>
							  	</center>
							</div>
							<div class="media" style="margin-top: 5px;">		
								<center>
								<a class="pull-left" href="#">
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="...">
							  	</a>
							  	<div class="media-body">
							    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">fire</span></h4>
							    	<div style="margin: 0 15px;">全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
							  	</div>
							  	</center>
							</div>
							<div class="media" style="margin-top: 5px;">		
								<center>
								<a class="pull-left" href="#">
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="...">
							  	</a>
							  	<div class="media-body">
							    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">fire</span></h4>
							    	<div style="margin: 0 15px;">全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
							  	</div>
							  	</center>
							</div>
						</div>
				
					</div>

				</div>
				<!-- 商品详细介绍 -->
				<div class="col-sm-9">	
					<ul class="nav nav-tabs" >
					    <li style="width: 120px;"><a href="#0">套餐详情</a></li>
					    <li style="width: 120px;"><a href="#1">定制流程</a></li>
					 	<li style="width: 120px;"><a href="#2">定制优势</a></li>
					 	<li style="width: 120px;"><a href="#3">购物保障</a></li>
					</ul>
					<div class="media">
						<div class="alert alert-success" role="alert">产品信息</div>
						<a href="#" class="pull-left" style="padding:5px solid #CCC;">
							<img class="media-object" src="/resource/home/img/037(1).jpg" style="width: 100%;">
						</a>
						<a href="#" class="pull-left" style="padding:5px solid #CCC;" name="1">
							<img class="media-object" src="/resource/home/img/a.png" style="width: 100%;">
						</a>
						<a href="#" class="pull-left">
							<img class="media-object" src="/resource/home/img/b.jpg" style="width: 100%;">
						</a>
						<a href="#" class="pull-left">
							<img class="media-object" src="/resource/home/img/c.jpg" style="width: 100%;">
						</a>
						<a href="#" class="pull-left" name="2">
							<img class="media-object" src="/resource/home/img/d.jpg" style="width: 100%;">
						</a>
						<a href="#" class="pull-left" name="3">
							<img class="media-object" src="/resource/home/img/e.jpg" style="width: 100%;">
						</a>
						<a href="#" class="pull-left" >
							<img class="media-object" src="/resource/home/img/f.jpg" style="width: 100%;">
						</a>
						<a href="#" class="pull-left" name="4">
							<img class="media-object" src="/resource/home/img/g.jpg" style="width: 100%;">
						</a>
					</div>
				</div>
			</div>			
		</div>
	</div>
	<!-- 尾部 -->
<jsp:include page="../layout/footer.jsp"/>