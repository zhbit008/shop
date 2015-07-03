/**
 * Created by Guangzi on 2015/7/3 0003.
 */
$(function(){
    /**
     * 加入购物车和收藏商铺
     */
    $(".add-item").on('click',function(){
        var $this = $(this);
        //获得商品ID
        var id = $this.attr('data-id');
        var action = $this.attr('href') + id;
        $.post(action, {'id':id}, function(json){
            if (json.stat){
                $this.text(json.msg);
                $this.prop('disabled', true);
            }else{
                alert('添加失败');
            }
            console.log(json);
        });
    });
})