<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="类型展示页"/>
</jsp:include>
<jsp:include page="../layout/nav.jsp"/>
	<div class="container">
		<div class="row">
			<div class="col-sm-9">
				<ol class="breadcrumb">
				  <li><a href="#">首页</a></li>
				  <li><a href="#">书桌</a></li>
				  <li class="active">类型</li>
				</ol>

                <s:iterator value="listProduct">
                    <div class="col-6 col-sm-6 col-lg-4 media" style="margin-top: 0px;">
                        <a class="pull-left thumbnail" href="#">
                            <img class="media-object" src="/resource/home/img/04.jpg" style="width: 251px;height: 176px;" alt="..."/>
                        </a>
                        <div class="media-body">
                            <h4 class="media-heading"><s:property value="proname"></s:property> 系列：十天精通CSS3						<span class="label label-warning">new</span></h4>
                            <div><s:property value="title"></s:property></div>
                        </div>
                    </div>
                </s:iterator>
			</div>
			<div class="col-sm-3">
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
                <br/>
                <ul id="myTab" class="nav nav-tabs" role="tablist">
					    <li class="active"><a href="#bulletin" role="tab" data-toggle="tab">热销排行</a></li>
					    <li><a href="#rule" role="tab" data-toggle="tab">最近浏览</a></li>
					</ul>
                <div id="myTabContent" class="tab-content">
						<div class="tab-pane active" id="bulletin" style="border:1px solid #CCC;">
							<div class="media" style="margin-top: 5px;">		
								<center>
								<a class="pull-left" href="#">
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="..."/>
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
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="..."/>
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
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="..."/>
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
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="..."/>
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
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="..."/>
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
							        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 80%;height: 170px;" alt="..."/>
							  	</a>
							  	<div class="media-body">
							    	<h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">fire</span></h4>
							    	<div style="margin: 0 15px;">全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
							  	</div>
							  	</center>
							</div>
						</div>
				
					</div>
					<br/>
			</div>
		</div>
	</div>


<jsp:include page="../layout/footer.jsp"/>