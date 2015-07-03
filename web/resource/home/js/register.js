/**
 * Created by acer on 2015/6/29.
 */

$(function(){
    var u = $("#username");
    var p1 = $("#password1");
    var p2 = $("#password2");
    var c = $("#check");
    var loginName = $("#info_LoginName");
    var passWord1 = $("#info_PassWord1");
    var passWord2 = $("#info_PassWord2");
    $("#submit").prop('disabled', true);
    $('#check').on('click',function(){
        var $this = $(this);
        if (!$this.prop('check')){
            $('#submit').prop('disabled',false );
        }
    });
    $("#submit").on("click", function(){

        loginName.addClass('hide');
        passWord1.addClass('hide');
        passWord2.addClass('hide');
        var cate = $('.radio-inline input:checked');

        var $this = $(this);
        if ($this.is(".disable")){

            return;
        }
        var pass =true;
        if (u.val() == ''){
            loginName.removeClass('hide');
            loginName.html('用户名不能为空');
            pass = false;
        }
        if (p1.val() == ''){
            passWord1.removeClass('hide');
            passWord1.html('密码不能为空');
            pass = false;
        }
        if (p1.val() != p2.val()){
            passWord2.removeClass('hide');
            passWord2.html('两次输入的密码不一致');
            pass = false;
        }
        $this.enable = function(enable){
            $this[enable?'removeClass' : 'addClass']('disable');
        };

        var action = $('#register').attr('action');

        var params = {
            "username": u.val(),
            "password1": p1.val() ,
            "password2":p2.val(),
            "cate"  :  cate.val()
        };

        pass && $.post(action, params,
            function(json){
                if (json.stat){
                    location.href = json.url;
                }else{
                    switch (json.code){
                        case 5400:
                        case 5100:
                            loginName.removeClass('hide');
                            loginName.html('用户名已存在');break;
                    }
                }
                console.log(json);
            });

        return false;

    });

})