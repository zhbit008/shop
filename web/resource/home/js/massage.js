/**
 * 
 * @authors Your Name (you@example.org)
 * @date    2015-06-30 00:40:21
 * @version $Id$
 */
window.onload=function(){
	var massage = document.getElementById('massage');
	var order = document.getElementById('order');
	var orderOnclick = document.getElementById('orderOnclick');
	var massageOnclick = document.getElementById('massageOnclick');

	orderOnclick.onclick=function(){
		massage.style.display='none';
		order.style.display='block';
	}
	massageOnclick.onclick=function(){
		massage.style.display='block';
		order.style.display='none';
	}
}
