/**
 * Created by zhbitcxy on 2015/6/29 0029.
 */

$(function(){
    var $boxes = $('#boxes');
    var $box = $("#template-box");
    $box.removeAttr('id');
    var $page = $("#page");
    var page = {
        url: '/json/Home_product_getPage',
        data: {'p':1,'num':10},
        success : function(json){
            console.log(json);
            var list = json.data.list;
            var page = json.data.page;
            var _this = this;
            //清空产品
            $boxes.empty();
            //重新生成物品
            for(var i = 0; i < list.length; i++){
                var $item = $box.clone(true);
//                $item.css('display', 'block');
                $item.find('.proname').text(list[i].proname);
                $item.find('.title').text(list[i].title);
                $boxes.append($item);
            }

            $boxes.children().show(1200);
            //删除分页
            $page.empty();
            //重新生成分页
            $page.append(page);
        },
        get : function (p, num) {
            var _this = this;
            _this.data.p = p;
            _this.data.num = num;
            var _url = _this.url;
            var _data = _this.data;
            $.post(_url,_data ,_this.success);
        }
    };
    $("#page").on("click","a", function(){
        var $this = $(this);
        if ($this.parent().is('.active')) return false;

        page.get($this.attr('href'), 9);
        return false;
    });
    page.get(1, 9);
});



