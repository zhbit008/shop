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
    var warning = $("#warning-block-login");
    var em = $("#warn-login");

    $("#submit").on("click", function(){
        var $this = $(this);
        if ($this.is(".disable")){
            return false;
        }
        var pass =true;
        if (u.val() == ''){
            warning.removeClass('hide');
            em.html("Username cannot be empty!!!");
            pass = false;
        }else if (p.val() == ''){
            warning.removeClass('hide');
            em.html("Password cant be empty!!!");
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
                }else{
                    switch(json.code){
                        case 4000:
                            warning.removeClass('hide');
                            em.html("User name does not exist");
                            break;
                        case  4100:
                            warning.removeClass('hide');
                            em.html("Password mistake");
                            break;
                    }
                }
                $this.enable(true);
                console.log(json);
            });
        return false;
    });

})