<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/home/layout/header.jsp"></jsp:include>
<jsp:include page="/WEB-INF/home/layout/nav.jsp"></jsp:include>

<!-- 内容 -->
<div class="container">
	<div class="row">
		<div class="col-sm-3">
			<ul class="list-group ">
				<li class="list-group-item ">
					<a href="#"><center>增加店长资料</center></a>
				</li>
				<li class="list-group-item">
					<a href="#"><center>所有店长资料</center></a>
				</li>
			</ul>
			<ul class="list-group">
				<li class="list-group-item">
					<a href="#"><center>修改登陆密码</center></a>
				</li>
				<li class="list-group-item">
					<a href="#"><center>修改个人资料</center></a>
				</li>
			</ul>
			<ul class="list-group">
				<li class="list-group-item">
					<a href="#"><center>分店业绩管理</center></a>
				</li>
			</ul>
		</div>
		<div class="col-sm-9 " >
			<center><h3 class="bg-info">请填写后台用户信息</h3></center>
			<form role="form" action="#" class="form-horizontal">
				<div class="form-group">
				    <label for="Name0" class="col-sm-2 control-label">姓名：</label>
				    <div class="col-sm-4">
				      <input type="text" class="form-control" id="Name0" placeholder="请输入名字">
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<!-- 单选按钮开始 -->
				<div class="col-sm-2"></div>
				<div class="form-group col-sm-10">
					<label class="checkbox-inline">
						<input type="radio" name="post" id="manager" value="manager" checked />总经理
					</label>
					<label class="checkbox-inline">
						<input type="radio" name="post" id="admin" value="admin"  />分店店长
					</label>
					<label class="checkbox-inline">
						<input type="radio" name="post" id="coutomer" value="coutomer" />顾客
					</label>
				</div>
				<!-- 单选按钮结束 -->
				<div class="form-group">
				    <label for="Name1" class="col-sm-2 control-label">登录名：</label>
				    <div class="col-sm-4">
				      <input type="text" class="form-control" id="Name1" placeholder="请输入登录名">
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<div class="form-group">
				    <label for="Password" class="col-sm-2 control-label">密码：</label>
				    <div class="col-sm-4">
				      <input type="text" class="form-control" id="Password" placeholder="请输入密码">
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<div class="form-group">
				    <label for="Password1" class="col-sm-2 control-label">确认密码：</label>
				    <div class="col-sm-4">
				      <input type="text" class="form-control" id="Password1" placeholder="请再次输入密码">
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<div class="form-group">
				    <label for="realname" class="col-sm-2 control-label">真实姓名：</label>
				    <div class="col-sm-4">
				      <input type="text" class="form-control" id="realname" placeholder="请输入真实名字">
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<div class="form-group">
				    <label for="rel" class="col-sm-2 control-label">店长电话：</label>
				    <div class="col-sm-4">
				      <input type="text" class="form-control" id="rel" placeholder="请输入电话">
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<div class="form-group">
				    <label for="email" class="col-sm-2 control-label">电子邮箱：</label>
				    <div class="col-sm-4">
				      <input type="email" class="form-control" id="email" placeholder="请输入您的邮箱地址">
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<div class="col-sm-2"></div>
				<div class="form-group col-sm-10">
					<label class="checkbox-inline">
						<input type="radio" name="power" id="normal" value="normal" checked />正常
					</label>
					<label class="checkbox-inline">
						<input type="radio" name="power" id="frost" value="frost"  />冻结
					</label>
				</div>

				<div class="form-group">
				    <label for="exampleInputName2" class="col-sm-2 control-label">分店地址：</label>
				    <div class="col-sm-4">
				      <select class="form-control">
				      	<option>珠海香洲</option>
				      	<option>广州天河</option>
				      	<option>深圳龙华</option>
				      </select>
				    </div>
				    <div class="col-sm-6"></div>
				</div>
				<div class="col-sm-2"></div>
				<button class="btn btn-success" type="sumbit" >确认提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-success" type="sumbit" >重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;置</button>
			</form>
			<br/>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/home/layout/footer.jsp"></jsp:include>