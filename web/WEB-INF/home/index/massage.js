/**
 * Created by acer on 2015/6/30.
 */
window.onload=function(){
    var massage = document.getElementById('massage');
    var order = document.getElementById('order');
    var orderOnclick = document.getElementById('orderOnclick');
    var massageOnclick = document.getElementById('massageOnclick');

    orderOnclick.onclick=function(){
        massage.style.display='block';
        order.style.display='none';
    }
    massageOnclick.onclick=function(){
        massage.style.display='none';
        order.style.display='block';
    }
}
