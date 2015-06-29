/**
 * Created by acer on 2015/6/29.
 */

$(function(){
    var u = $("#username");
    var p1 = $("#password1");
    var p2 = $("#password2");
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
        if (p1.val() == ''){
            alert('密码不能为空');
            pass = false;
        }
        if (p1.val() != p2.val()){
            alert('输入密码不一致');
            pass = false;
        }
        $this.enable = function(enable){
            $this[enable?'removeClass' : 'addClass']('disable');
        };

        var action = $this.parent('form').attr('action');

        pass && $.post(action, { "username": u.val(), "password1": p1.val() ,"password2":p2.val()},
            function(json){
                if (json.stat){
                    location.href = json.url;
                }else{
                    switch (json.code){
                        case 5100:
                            alert('用户名已经存在');break;
                    }
                }

                console.log(json);
            });

        return false;

    });

})