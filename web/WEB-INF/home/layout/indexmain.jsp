<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <div class="container">
		<div class="row">
			<div class="col-sm-9">
				<p class="pull-right visible-xs">
					<button class="btn-xs btn btn-primary">Taggle</button>
				</p>
				<!-- 图片轮播开始 -->
				<div id="myCarousel" class="carousel slide">
			        <ol class="carousel-indicators">
			           <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			           <li data-target="#myCarousel" data-slide-to="1"></li>
			           <li data-target="#myCarousel" data-slide-to="2"></li>
			        </ol>
			        <div class="carousel-inner">
			            <div class="item active">
			                <img src="/resource/home/img/01.jpg" alt=""/>
			                <div class="carousel-caption">
			                  <h4>标题一</h4>
			                  <p>图片一内容简介</p>
			                </div>
			            </div>
			            <div class="item">
			                <img src="/resource/home/img/02.jpg" alt=""/>
			                <div class="carousel-caption">
			                   <h4>标题二</h4>
			                   <p>图片二内容简介</p>
			                </div>
			            </div>
			            <div class="item">
			            	<img src="/resource/home/img/03.jpg" alt=""/>
			                <div class="carousel-caption">
			                  <h4>标题三</h4>
			                  <p>图片三内容简介</p>
			                </div>
			            </div>
			      	</div>

			        <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
			        <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
		    	</div>
				<!-- 图片轮播结束 -->
				<!-- 内容开始 -->
				<div class="row">
					<div class="col-6 col-sm-6 col-lg-4 media" style="margin-top: 15px;">
						<a class="pull-left" href="#">
					        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
					  	</a>
					  	<div class="media-body">
					    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">new</span></h4>
					    	<div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
					  	</div>
					</div>
					<div class="col-6 col-sm-6 col-lg-4 media">
						<a class="pull-left" href="#">
					        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..." />
					  	</a>
					  	<div class="media-body">
					    	<h4 class="media-heading">系列：十天精通CSS3</h4>
					    	<div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
					  	</div>
					</div>
					<div class="col-6 col-sm-6 col-lg-4 media">
						<a class="pull-left" href="#">
					        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
					  	</a>
					  	<div class="media-body">
					    	<h4 class="media-heading">系列：十天精通CSS3</h4>
					    	<div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
					  	</div>
					</div>
					<div class="col-6 col-sm-6 col-lg-4 media">
						<a class="pull-left" href="#">
					        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
					  	</a>
					  	<div class="media-body">
					    	<h4 class="media-heading">系列：十天精通CSS3</h4>
					    	<div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
					  	</div>
					</div>
					<div class="col-6 col-sm-6 col-lg-4 media">
						<a class="pull-left" href="#">
					        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
					  	</a>
					  	<div class="media-body">
					    	<h4 class="media-heading">系列：十天精通CSS3</h4>
					    	<div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
					  	</div>
					</div>
					<div class="col-6 col-sm-6 col-lg-4 media">
						<a class="pull-left" href="#">
					        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
					  	</a>
					  	<div class="media-body">
					    	<h4 class="media-heading">系列：十天精通CSS3</h4>
					    	<div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
					  	</div>
					</div>
					<!-- 内容结束 -->
					<center>
					<ul class="pagination pagination">
					  <li><a href="#">&laquo;第一页</a></li>
					  <li class="active"><a href="#">1</a></li>
					  <li><a href="#">2</a></li>
					  <li ><a href="#">3</a></li>
					  <li><a href="#">4</a></li>
					  <li class="disabled"><a href="#">5</a></li>
					  <li ><a href="#">最后一页&raquo;</a></li>
					</ul>  
					</center> 
				</div>
			</div>
			<div class="col-sm-3">
			<!-- 右边栏开始 -->
				<div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				        <div class="panel-heading">	
				            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#room">卧房</a></h4>
				        </div>
				        <div id="room" class="panel-collapse collapse in">
				            <div class="panel-body">
				            <ul class="list-inline">
								<li><a href="#" >柜门定制</a></li>
								<li><a href="#">整体衣柜</a></li>
								<li><a href="#">衣帽间</a></li>
							</ul></div>
				        </div>
				    </div>
				</div>
				<div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				        <div class="panel-heading">	
				            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#book">书房</a></h4>
				        </div>
				        <div id="book" class="panel-collapse collapse in">
				            <div class="panel-body">
				            <ul class="list-inline">
								<li><a href="#" >书柜</a></li>
								<li><a href="#">书柜组合</a></li>
								<li><a href="#">榻榻米</a></li>
							</ul></div>
				        </div>
				    </div>
				</div>
				<div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				        <div class="panel-heading">	
				            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseOne3">书房</a></h4>
				        </div>
				        <div id="collapseOne3" class="panel-collapse collapse in">
				            <div class="panel-body">
				            <ul class="list-inline">
								<li><a href="#" >书柜</a></li>
								<li><a href="#">书柜组合</a></li>
								<li><a href="#">榻榻米</a></li>
							</ul></div>
				        </div>
				    </div>
				</div>
				<div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				        <div class="panel-heading">	
				            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseOne4">书房</a></h4>
				        </div>
				        <div id="collapseOne4" class="panel-collapse collapse in">
				            <div class="panel-body">
				            <ul class="list-inline">
								<li><a href="#" >书柜</a></li>
								<li><a href="#">书柜组合</a></li>
								<li><a href="#">榻榻米</a></li>
							</ul></div>
				        </div>
				    </div>
				</div>
				<div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				        <div class="panel-heading">	
				            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseOne5">书房</a></h4>
				        </div>
				        <div id="collapseOne5" class="panel-collapse collapse in">
				            <div class="panel-body">
				            <ul class="list-inline">
								<li><a href="#" >书柜</a></li>
								<li><a href="#">书柜组合</a></li>
								<li><a href="#">榻榻米</a></li>
							</ul></div>
				        </div>
				    </div>
				</div>

				<!-- 右边栏结束 -->
			</div>
		</div>
		<br/>
	</div>
