
require(['supersized'], function(){
	$('body').keypress(function(e){
		if(e.keyCode == 13){
			$("#submit").click();
		}
	});
	var u = $(".username");
	var p = $(".password");
	u.focus();
	var loginFormBox = $('.page-container'), formHeight = loginFormBox.height();
	$(window).on('resize', function(){
		loginFormBox.css('marginTop', ($(window).height() * 0.8 - formHeight) / 2);
	}).resize();

	$.supersized({
		slide_interval     : 6000,
		transition         : 1,
		transition_speed   : 3000,
		performance        : 1,
		// Components
		slide_links        : 'blank',
		slides             : [
			{image : './resource/admin/img/login_bg/5.jpg'},
			{image : './resource/admin/img/login_bg/4.jpg'},
			{image : './resource/admin/img/login_bg/2.jpg'},
			{image : './resource/admin/img/login_bg/1.jpg'}
		]
	});

	$("#submit").bind('click', function(){
		var $this = $(this);
		if($this.is('.disable')){
			return;
		}
		var pass = true;
		if(u.val() == ''){
			u.error("用户名不能为空");
			pass = false;
		}
		if(p.val() == ''){
			p.error("密码不能为空");
			pass = false;
		}

		$this.enable = function(enable){
			$this[enable?'removeClass':'addClass']('disable');
		};
		pass && $this.doPost('/json/user_loginValidate', {'admin.username': u.val(),'admin.password': p.val()}, function(json){
            console.log(json + "======1");
            location.href = '/summary';
		}, function(json){
            console.log(json);
            if (json.stat){
                location.href = json.url;
                return;
            }
            switch (json.code){
                case 4000:
                    u.error("用户不存在");break;
                case 4100:
                    p.error("密码错误");break;

            }

		}, '正在提交请求...');
	});
});