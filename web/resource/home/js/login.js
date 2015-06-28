/**
 * 
 * @authors Your Name (you@example.org)
 * @date    2015-06-22 14:07:05
 * @version $Id$
 */


// $(function(){
// 	$(window).resize(function(){
// 		var oMain = $("#main");
// 		var oWin = $(window);
// 		if (oMain.width() > 720){
// 			oMain.height(oWin.height()-327);
// 		}
// 		console.log(oWin.height());
// 	}).resize();
// })
//function checkLogin(){
//			var userName = document.getElementById("userName").value;
//			var password = document.getElementById("Password").value;
//			var password2 = document.getElementById("Password2").value;
//			if (userName==null || userName==""){
//				alert("用户名不能为空");
//				return false;
//			}else if (password==null || password==""){
//				alert("密码不能为空");
//				return false;
//			}else if(password != password2){
//				alert("确认密码不正确");
//				return false;
//			}
//
//			return true;
//		}
$(function(){
    var u = $("#username");
    var p = $("#password");
    var c = $('#check');
    $("#submit").on("click", function(){
        var $this = $(this);
        if ($this.is(".disable")){
            return;
        }
        var pass =true;
        if (u.val() == ''){
            alert('用户名不能为空');
            pass = false;
        }
        if (p.val() == ''){
            alert('密码不能为空');
            pass = false;
        }
        $this.enable = function(enable){
            $this[enable?'removeClass' : 'addClass']('disable');
        };

        var action = $this.parent('form').attr('action');

        pass && $.post(action, { "customer.username": u.val(), "customer.password": p.val() },
            function(json){
                if (json.stat){
                    location.href = json.url;
                }
                console.log(json);
            });
        return false;
    });

})