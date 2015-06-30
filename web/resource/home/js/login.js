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
    $("#submit").on("click", function(){
        var $this = $(this);
        if ($this.is(".disable")){
            return false;
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
        $this.enable(false);
        pass && $.post(action, { "customer.username": u.val(), "customer.password": p.val() },
            function(json){
                if (json.stat){
                    location.href = json.url;
                }
                $this.enable(true);
                console.log(json);
            });
        return false;
    });

})