/**
 * Created by acer on 2015/6/29.
 */

$(function(){
    var u = $("#username");
    var p1 = $("#password1");
    var p2 = $("#password2");
    var warning = $("#warning-block-register");
    var em = $("#warn-register");
    $("#submit").on("click", function(){
        var cate = $('.radio-inline input:checked');

        var $this = $(this);
        if ($this.is(".disable")){

            return;
        }
        var pass =true;
        if (u.val() == ''){
            warning.removeClass('hide');
            em.html("Username cannot be empty!!!");
            pass = false;
        }
        else if (p1.val() == ''){
            warning.removeClass('hide');
            em.html("Password cant be empty!!!");
            pass = false;
        }
        else if (p1.val() != p2.val()){
            warning.removeClass('hide');
            em.html("I'm sorry, you enter a wrong password!");
            pass = false;
        }
        $this.enable = function(enable){
            $this[enable?'removeClass' : 'addClass']('disable');
        };

        var action = $this.parent('form').attr('action');
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
                            alert('User name already exists！！！');break;
                    }
                }
                console.log(json);
            });

        return false;

    });

})