
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    <div class="container">
		<div class="row">
			<div class="col-sm-9">
				<p class="pull-right visible-xs">
					<button class="btn-xs btn btn-primary">Taggle</button>
				</p>
                <ol class="breadcrumb" id="breadcrumb" style="display: none;">
                    <li><a href="0">所有</a></li>
                    <li><a href="#">书桌</a></li>
                    <li class="active">类型</li>
                </ol>
				<!-- 图片轮播开始 -->
				<div id="myCarousel" class="carousel slide">
			        <ol class="carousel-indicators">
			           <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			           <li data-target="#myCarousel" data-slide-to="1"></li>
			           <li data-target="#myCarousel" data-slide-to="2"></li>
			        </ol>
			        <div class="carousel-inner">
			            <div class="item active">
			                <img src="/upload/lunbo/01.jpg" alt=""/>
			                <div class="carousel-caption">
			                  <h4>圣托里尼卧房</h4>
			                  <p>这般充满灵魂的简欧风尚家居设计，在典雅中呈现简洁清爽的视觉效果。</p>
			                </div>
			            </div>
			            <div class="item">
			                <img src="/upload/lunbo/02.jpg" alt=""/>
			                <div class="carousel-caption">
			                   <h4>加勒比客餐厅</h4>
			                   <p>大理石铺就的客餐厅，时尚，舒适，大气，别致！</p>
			                </div>
			            </div>
			            <div class="item">
			            	<img src="/upload/lunbo/03.jpg" alt=""/>
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
                <center>
                    <ul class="pagination pagination" id="page">
                    </ul>
                </center>
                <!-- 内容开始 -->
                <div style="height: 15px;width: 1px;"></div>
                <div class="row">
                    <div id="boxes">

                    </div>
                    <div class="col-6 col-sm-6 col-lg-4 media" style="margin-top: 0px;display: none;" id="template-box">
                        <span class="label label-warning">分类名称</span>
                        <a class="pull-left url" href="#" >

                            <img class="media-object img" src="" style="width: 300px;height: 170px;" alt="..."/>
                        </a>
                        <div class="media-body">
                            <h4 class="media-heading"><span class="proname"></span> </h4>
                            <div><span class="title"></span></div>
                        </div>
                    </div>
					<!-- 内容结束 -->

				</div>
			</div>
			<div class="col-sm-3">
			<!-- 右边栏开始 -->
                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                    <s:iterator value="productCateList" id="item">
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="productCate<s:property value="#item.id" />">
                            <center>
                            <h4 class="panel-title ">
                                <a role="button" data-id="<s:property value="#item.id" />" data-toggle="collapse" data-parent="#accordion" href="#productCate<s:property value="#item.id" />sss" aria-expanded="true" aria-controls="productCate<s:property value="#item.id" />sss">
                                    <s:property value="#item.catename" />
                                </a>
                            </h4>
                            </center>
                        </div>
                        <div id="productCate<s:property value="#item.id" />sss" class="panel-collapse collapse" role="tabpanel" aria-labelledby="productCate<s:property value="#item.id" />">
                            <div class="panel-body">
                                <ul class="nav nav-tabs">
                                    <s:iterator value="#item.childCateList">
                                    <li><a href="<s:property value="id"/> "><s:property value="catename"/> </a></li>
                                    </s:iterator>
                                </ul>
                            </div>
                        </div>
                    </div>
                    </s:iterator>
                </div>

				<!-- 右边栏结束 -->
			</div>
		</div>
		<br/>
	</div>
