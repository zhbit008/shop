<%@ taglib prefix="s" uri="/struts-tags" %>
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
			                  <h4>圣托里尼卧房</h4>
			                  <p>这般充满灵魂的简欧风尚家居设计，在典雅中呈现简洁清爽的视觉效果。</p>
			                </div>
			            </div>
			            <div class="item">
			                <img src="/resource/home/img/02.jpg" alt=""/>
			                <div class="carousel-caption">
			                   <h4>加勒比客餐厅</h4>
			                   <p>大理石铺就的客餐厅，时尚，舒适，大气，别致！</p>
			                </div>
			            </div>
			            <div class="item">
			            	<img src="/resource/home/img/03.jpg" alt=""/>
			                <div class="carousel-caption">
			                  <h4>圣托里尼客厅</h4>
			                  <p>圣托里尼是“碧蓝可酣饮的火山”，这也是对这款客厅家具最恰当的形容。</p>
			                </div>
			            </div>
			      	</div>

			        <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
			        <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
		    	</div>
				<!-- 图片轮播结束 -->
				<!-- 内容开始 -->
                <div style="height: 15px;width: 1px;"></div>
                <div class="row">
                    <s:iterator value="listProduct">
                        <div class="col-6 col-sm-6 col-lg-4 media" style="margin-top: 0px;">
                            <a class="pull-left thumbnail" href="#">
                                <img class="media-object" src="/resource/home/img/04.jpg" alt="..."/>
                            </a>
                            <div class="media-body">
                                <h4 class="media-heading"><s:property value="proname"></s:property> 系列：十天精通CSS3						<span class="label label-warning">new</span></h4>
                                <div><s:property value="title"></s:property></div>
                            </div>
                        </div>
                    </s:iterator>

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
                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingOne">
                            <center>
                            <h4 class="panel-title ">
                                <a role="button" data-toggle="collapse" data-parent="#accordion" href="#room" aria-expanded="true" aria-controls="room">
                                    卧室
                                </a>
                            </h4>
                            </center>
                        </div>
                        <div id="room" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
                            <div class="panel-body">
                                <ul class="nav nav-tabs">
                                    <li><a href="##">定制床</a></li>
                                    <li><a href="##">梳妆</a></li>
                                    <li><a href="##">衣帽间</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingTwo">
                            <center>
                            <h4 class="panel-title">
                                <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#book" aria-expanded="false" aria-controls="book">
                                    书房
                                </a>
                            </h4>
                            </center>
                        </div>
                        <div id="book" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                            <div class="panel-body">
                                <ul class="nav nav-tabs">
                                    <li><a href="##">书柜</a></li>
                                    <li><a href="##">书桌</a></li>
                                    <li><a href="##">榻榻米</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingThree">
                            <center>
                            <h4 class="panel-title">
                                <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#kitchen" aria-expanded="false" aria-controls="kitchen">
                                    餐厅
                                </a>
                            </h4>
                            </center>
                        </div>
                        <div id="kitchen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                            <div class="panel-body">
                                <ul class="nav nav-tabs">
                                    <li><a href="##">餐边柜</a></li>
                                    <li><a href="##">斗柜</a></li>
                                    <li><a href="##">酒柜</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingFour">
                            <center>
                            <h4 class="panel-title">
                                <a role="button" data-toggle="collapse" data-parent="#accordion" href="#living_room" aria-expanded="true" aria-controls="living_room">
                                    客厅
                                </a>
                            </h4>
                            </center>
                        </div>
                        <div id="living_room" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
                            <div class="panel-body">
                                <ul class="nav nav-tabs">
                                    <li><a href="##">茶几</a></li>
                                    <li><a href="##">电视柜</a></li>
                                    <li><a href="##">玄关柜</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingFive">
                            <center>
                            <h4 class="panel-title">
                                <a role="button" data-toggle="collapse" data-parent="#accordion" href="#else" aria-expanded="true" aria-controls="else">
                                    其他
                                </a>
                            </h4>
                            </center>
                        </div>
                        <div id="else" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
                            <div class="panel-body">
                                <ul class="nav nav-tabs">
                                    <li><a href="##">飘窗柜</a></li>
                                    <li><a href="##">鞋柜</a></li>
                                    <li><a href="##">阳台柜</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>

				<!-- 右边栏结束 -->
			</div>
		</div>
		<br/>
	</div>
