/**
 * Created by zhbitcxy on 2015/6/29 0029.
 */

$(function(){
    var $boxes = $('#boxes');
    var $box = $("#template-box");
    $box.removeAttr('id');
    var $page = $('#page');
    /**
     * 分页对象
     * @type {{cache: Array, url: string, data: {p: number, num: number, cid: number}, success: success, get: get}}
     */
    var pageHandle = {
        cache : [],
        cachefield : '',
        url: '/ajax/Home_product_getPage',
        data: {'p':1,'num':9, 'cid': 0},
        success : function(json){
//            console.log(json);
            var list = json.data.list;
            var page = json.data.page;
            var _this = this;
            //缓存
            pageHandle.cache[pageHandle.cachefield] = json;
            //清空产品
            $boxes.empty();
            //重新生成物品
            for(var i = 0; i < list.length; i++){
                var $item = $box.clone(true);
                $item.find('.proname').text(list[i].proname);
                $item.find('.title').text(list[i].title);
                $item.find('.url').attr('href','/home/product_show.html?productId='+list[i].id);
                $item.find('.img').attr('src', '/upload/product/'+list[i].image+'.jpg');
                $boxes.append($item);
            }
            //显示特效
            $boxes.children().slideDown(800);
            //删除分页
            $page.empty();
            //重新生成分页
            $page.append(page);
        },
        //p为第几页，cid为分类id
        get : function (p, cid, num) {
            var _this = this;
            _this.data.cid = cid || _this.data.cid;
            _this.data.num = num || _this.data.num;
            _this.data.p = p;
            var _url = _this.url;
            var _data = _this.data;
            //获取缓存
           _this.cachefield = _data.p+'_'+_data.num+'_'+_data.cid;
            var _cache = _this.cache[_this.cachefield];
//            TODO 增加缓存超时处理
            if (_cache){ _this.success(_cache); console.log('cache data') }
            else  { $.post(_url,_data ,_this.success); }
            return;
        }
    };
    /**
     * 分页为异步分页
     */
    $("#page").on("click","a", function(){
        var $this = $(this);
        if ($this.parent().is('.active')) return false;

        pageHandle.get($this.attr('href'));
        return false;
    });
    //初始化分页
    pageHandle.get(1, 0);

    var $myCarousel = $('#myCarousel');
    var $breadcrumb = $('#breadcrumb');
    /**
     * 右侧分类展示
     */
    $(".nav-tabs a").on('click', function(){
        //显示导航条
        $breadcrumb.show();
        var $this = $(this);
        //隐藏图片轮播
        $myCarousel.hide();
        pageHandle.get(1, $this.attr('href'));
        //第三项导航信息更新
        $breadcrumb.find('li.active').text($this.text());
        //第二项导航信息更新
        $breadcrumb.find('a').eq(1).text($this.closest('.panel').find('a[role="button"]').text());
        $breadcrumb.find('a').eq(1).attr('href',$this.closest('.panel').find('a[role="button"]').attr('data-id'));
//        TODO 这里应该写成支持无限极
        return false;
    });
    //导航条分类展示
    $breadcrumb.find('a').on('click',function(){
        var $this = $(this);
        pageHandle.get(1, $this.attr('href'));
        return false;
    })

});



