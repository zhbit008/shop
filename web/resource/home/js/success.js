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
function checkLogin(){
			var userName = document.getElementById("userName").value;
			var password = document.getElementById("Password").value;
			var password2 = document.getElementById("Password2").value;
			if (userName==null || userName==""){
				alert("用户名不能为空！");
				return false;
			}else if (password==null || password==""){
				alert("密码不能为空！");
				return false;
			}else if(password != password2){
				alert("密码不一样");
				return false;
			}
			return true;
		}
window.onload=function(){
	var ce=document.getElementById("center");
	ce.style.height = window.screen.availHeight-319+'px';
}