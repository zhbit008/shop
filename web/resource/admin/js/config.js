(function (p) {
    p.jt = {
        version: '0.0.1',
        config: {
            mode: 'debug', //production
            jsDir: '/js',
            remote: 'http://js.spcrm.com'
        },
        device: {
            width: 640,
            scalable: false,
            touchable: false,
            browser: null
        }
    };
    p.requireConfig = {
        baseUrl: 'http://localhost:8080/resource/admin/js/',
        ver: p.jt.config.mode === 'debug' ? Math.random() : p.jt.version,
        entry: []
    };

    //移除 data-main属性
    var scripts = document.getElementsByTagName('script');
    for (var i = 0, l = scripts.length; i < l; i++) {
        var main = scripts[i].getAttribute('data-main');
        scripts[i].removeAttribute('data-main');
        if (main) {
            p.requireConfig.entry.push(main);
        }
    }


    var touchDevice = ['Android', 'webOS', 'iPhone', 'iPad', 'iPod', 'BlackBerry', 'Windows Phone'];
    var nu = navigator.userAgent;
    var touchable = false;
    for (var i = 0, l = touchDevice.length; i < l; i++) {
        if (nu.indexOf(touchDevice[i]) !== -1) {
            touchable = true;
            break;
        }
    }

    p.jt.device.touchable = touchable;

    if (touchable) {
        document.write('<s' + 'cript src="' + p.requireConfig.baseUrl + 'lib/viewport.js?v=' + p.requireConfig.ver + '"></scr' + 'ipt>');
    }
    document.write('<s' + 'cript src="' + p.requireConfig.baseUrl + '3rd/require/2.1.14/require.js"></scr' + 'ipt>');
    document.write('<s' + 'cript src="' + p.requireConfig.baseUrl + 'init.js?v=' + p.requireConfig.ver + '"></scr' + 'ipt>');
})(this);