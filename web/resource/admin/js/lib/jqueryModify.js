/**
 * Created by zhbitcxy on 2015/6/11.
 */

require(['layer'], function(){
	var matched, browser;
	$.uaMatch = function( ua ) {
		ua = ua.toLowerCase();
		var match = /(chrome)[ \/]([\w.]+)/.exec( ua ) ||
			/(webkit)[ \/]([\w.]+)/.exec( ua ) ||
			/(opera)(?:.*version|)[ \/]([\w.]+)/.exec( ua ) ||
			/(msie) ([\w.]+)/.exec( ua ) ||
			ua.indexOf("compatible") < 0 && /(mozilla)(?:.*? rv:([\w.]+)|)/.exec( ua ) || [];
		return {
			browser: match[ 1 ] || "",
			version: match[ 2 ] || "0"
		};
	};
	matched = $.uaMatch( navigator.userAgent );
	browser = {};    if ( matched.browser ) {
		browser[ matched.browser ] = true;
		browser.version = matched.version;
	}
	// Chrome is Webkit, but Webkit is also Safari.
	if ( browser.chrome ) {
		browser.webkit = true;
	} else if ( browser.webkit ) {
		browser.safari = true;
	}
	$.browser = browser;

	$.ajaxSetup({
		type: "post",
		cache: true,
		timeout: 60000 * 1000,
		dataType: 'json',
		beforeSend: function(){
			this.url += '.json';
		},
		converters: {
			"text json": function(responseText){
				var json = $.parseJSON(responseText);
				if(!json){
					layer.msg('服务器返回的不是有效的JSON格式数据',{
                        offset: 0,
                        shift: 6
                    });
					return {};
				}else{
					return json;
				}
			}
		},
		error: function(x, s, e){
			layer.msg('请求失败，服务器发生错误',{
                offset: 0,
                shift: 6
            });
		}
	});

	$.each(['get', 'post', 'put', 'delete', 'header', 'options'], function(i, method){
		$.fn['do' + method[0].toUpperCase() + method.slice(1)] = function(url, data, success, error, waiting){
			var btn = this;
			// Shift arguments if data argument was omitted
			if($.isFunction(data)){
				error = error || success;
				success = data;
				data = undefined;
			}
			success = success || function(json){
				layer.msg('操作成功: ' + json.msg);
			};
			error = error || function(json){
				btn.error(json.msg);
			};
			$.each([data, success, error, waiting, ''], function(i, v){
				if(typeof v === 'string'){
					waiting = v;
					return false;
				}
			});
			if(waiting){
				btn.waiting(waiting);
			}
			return $.ajax({
				url: url,
				type: method,
				data: data,
				success: function(json){
					if(json.success){
						success(json);
					}else{
						if(json.code === 'inputIll'){//输入错误
							$(':input[name="' + json.data.field + '"]').error(json.msg);
						}else{
							error(json);
						}
					}
				},
				complete: function(){
					if(waiting){
						btn.stopWaiting();
					}
				}
			});
		};
	});
	$.extend($.fn, {
		error: function(){
			var tpl = '<div class="layer-panel"><div class="layer-content">{{msg}}</div><i class="layer-corner layer-corner-left"></i></div>';
			return function(msg){
				var input = this, tip;
				if(input.data('jtTip')){
					input.data('jtTip').destroy();
				}
				if(input.length){
					tip = $(tpl.replace('{{msg}}', msg));
					input.offsetParent().append(tip);
					var pos = input.position();
					tip.css({
						top: pos.top + input.outerHeight(true),
						left: pos.left
					});
				}else{
					return this;
				}
				tip.close = function(){
					tip.fadeOut().promise(tip.destroy);
				};
				tip.destroy = function(){
					input.removeClass('error');
					tip.remove();
					tip = null;
				};
				tip.click(tip.close);
				input.one('keydown', function(){
					tip && tip.close();
				});
				input.data('jtTip', tip);
				input.getTip = function(){
					return input.data('jtTip');
				};
				input.addClass('error');
				if(!$(':input:focus').is('.error')){
					input.focus();
				}
				return input;
			};
		}(),
		waiting: function(){
			var waitingBar = $('<div id="waitingBar"><div class="waitingIcon"></div><span class="con"></span></div>');
			var waitingTpl = '<div class="waiting"><div class="waiting-bounce1"></div><div class="waiting-bounce2"></div></div>';
			waitingBar.find('.waitingIcon').append(waitingTpl);
			waitingBar.con = waitingBar.find('.con');
			$('body').append(waitingBar);
			return function(msg){
				var btn = this.data('kendoButton') || this.is('.button')?this:$('');
				btn && $.isFunction(btn.enable) && btn.enable(false);
				this.append($(waitingTpl));
				msg && waitingBar.show().animate({
					top:0
				}).con.html(msg);
				this.stopWaiting = function(){
					btn.find('.waiting').remove();
					btn && btn.enable(true);
					msg && waitingBar.animate({
						top:0 - waitingBar.outerHeight()
					}, function(){
						waitingBar.hide();
					});
				}
				return this;
			};
		}()
	});
	return $;
});