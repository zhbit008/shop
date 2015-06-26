(function(p){
	require.config({
		enforceDefine: false,
		baseUrl: p.requireConfig.baseUrl,
		urlArgs: 'v=' + p.requireConfig.ver,
		paths: {
			"jquery": ["lib/jqueryModify"],
			"jquery-cookie": ["3rd/jquery/cookie/1.4.1/cookie"],
			"supersized": ['app/login/supersized.3.2.7.min'],
            "layer":['3rd/layer/1.9.3/layer']
		},
		shim: {
			'jquery': {
				deps: ['3rd/jquery/2.1.4/jquery'],
				exports: 'jquery'
			}
		},
		waitSeconds: 60
	});

	require(['jquery'], function($){
		$(function(){
			//加载入口函数
			require(p.requireConfig.entry);
		});
	});
})(this);
