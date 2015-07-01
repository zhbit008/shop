/**
 * 
 * @authors Your Name (you@example.org)
 * @date    2015-06-22 14:07:05
 * @version $Id$
 */

$(function(){
    var u = $("#username");
    var p = $("#password");
    var c = $('#check');
    var loginName = $("#info_LoginName");
    var passWord = $("#info_PassWord");


    $("#submit").on("click", function(){
        loginName.addClass('hide');
        passWord.addClass('hide');
        var $this = $(this);
        if ($this.is(".disable")){
            return false;
        }

        var pass =true;
        if (u.val() == ''){
            loginName.removeClass('hide');
            loginName.html("用户名不能为空");
            pass = false;
        }
        if (p.val() == ''){
            passWord.removeClass('hide');
            passWord.html("密码不能为空");
            pass = false;
        }
        $this.enable = function(enable){
            $this[enable?'removeClass' : 'addClass']('disable');
        };

        var action = $('#login').attr('action');
        alert(action);
        $this.enable(false);
        pass && $.post(action, { "customer.username": u.val(), "customer.password": p.val() },
            function(json){
                if (json.stat){
                    location.href = json.url;
                }else{
                    switch(json.code){
                        case 4000:
                            loginName.removeClass('hide');
                            loginName.html("用户名不存在");
                            break;
                        case  4100:
                            passWord.removeClass('hide');
                            passWord.html("密码不正确");
                            break;
                    }
                }
                $this.enable(true);
                console.log(json);
            });
        return false;
    });

})