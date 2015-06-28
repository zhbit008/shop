<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../layout/header.jsp">
    <jsp:param name="title" value="商品页面" />
</jsp:include>
<jsp:include page="../layout/nav.jsp"/>

	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<a href="#" class="thumbnail">
				<img src="/resource/home/img/shop_logo.png" />
				</a>
			</div>
			<div><h4><strong><a href="/home/index/index_index.do">首页</a>&nbsp;<&nbsp;沐风旗舰店</strong></h4></div>
			<div class="col-sm-12">
				<a href="#" class="thumbnail" style="border: 0;">
				<img src="/resource/home/img/shop_logo2.png" />
				</a>
			</div>
            <div class="col-sm-3">
                <div class="panel panel-default">
                    <div class="panel-heading" style="background: #1D1D1D;">
                        <center style="color:white">搜索</center>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="#" class="form-horizontal">
                            <div class="form-group">
                                <div class="row">
                                    <label for="Name0" class="col-sm-4 control-label">关键字：</label>
                                    <div class="col-sm-7">
                                        <input type="text" class="form-control" id="Name0" placeholder="请输入。。。">
                                    </div>
                                </div>
                            </div>
                            <center>
                                <button class="btn btn-success" type="button">搜索</button>
                            </center>
                            <br/>
                        </form>
                    </div>
                </div>
                <br/>
                <div class="panel panel-default">
                    <div class="panel-heading" style="background:#1D1D1D;">
                        <center style="color:white">宝贝分类</center>
                    </div>
                    <div class="panel-body">
                        <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                            <div class="panel panel-default">
                                <div class="panel-heading" role="tab" id="headingOne">
                                    <h4 class="panel-title">
                                        <a role="button" data-toggle="collapse" data-parent="#accordion" href="#room" aria-expanded="true" aria-controls="room">
                                            卧室
                                        </a>
                                    </h4>
                                </div>
                                <div id="room" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                                    <div class="panel-body">
                                        11111111111111111
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading" role="tab" id="headingTwo">
                                    <h4 class="panel-title">
                                        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#book" aria-expanded="false" aria-controls="book">
                                            书桌
                                        </a>
                                    </h4>
                                </div>
                                <div id="book" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                                    <div class="panel-body">
                                        2222222222222222222
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading" role="tab" id="headingThree">
                                    <h4 class="panel-title">
                                        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#kitchen" aria-expanded="false" aria-controls="kitchen">
                                            厨房
                                        </a>
                                    </h4>
                                </div>
                                <div id="kitchen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                                    <div class="panel-body">
                                        3333333333333333
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-9">
                <div class="col-sm-4 media" style="margin-top: 15px;">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="...">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">new</span></h4>
                        <div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
                    </div>
                </div>
                    <div class="col-sm-4 media" style="margin-top: 15px;">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">new</span></h4>
                        <div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
                    </div>
                </div>
                <div class="col-sm-4 media" style="margin-top: 15px;">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
                    </a>
                 <div class="media-body">
                        <h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">new</span></h4>
                        <div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
                    </div>
                </div>
                <div class="col-sm-4 media" style="margin-top: 15px;">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="/resource/home/img/04.jpg" style="width: 300px;height: 170px;" alt="..."/>
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">系列：十天精通CSS3						<span class="label label-warning">new</span></h4>
                        <div>全方位深刻详解CSS3模块知识，经典案例分析，代码同步调试，让网页穿上绚丽装备！</div>
                    </div>
                </div>
            </div>
        </div>
		<nav>
		  <ul class="pager">
		    <li><a href="#">Previous</a></li>
		    <li><a href="#">Next</a></li>
		  </ul>
		</nav>
	</div>

<jsp:include page="../layout/footer.jsp"/>