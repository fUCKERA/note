
var laytpl,layer;
layui.use(['laytpl','layer'], function(){
    laytpl = layui.laytpl;
    layer = parent.layer === undefined ? layui.layer : top.layer;
    console.log("-----------------------------")
    //selectMenuList("0");
});
//查询菜单列表
function selectMenuList(parentId){
    $.ajax({
        type: 'POST',
        url: '/base/menu/findChildMenuList',
        data:JSON.stringify({"parentId":parentId}),
        contentType:"application/json",
        dataType: "json",
        success: function (result) {//res为相应体,function为回调函数
            console.log(JSON.stringify(result))
            var getTpl = menuList.innerHTML;
            laytpl(getTpl).render(result.data, function (html) {
                $("#iq-sidebar-toggle").html(html);
            })
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            layer.alert('操作失败！！！' + XMLHttpRequest.status + "|" + XMLHttpRequest.readyState + "|" + textStatus, { icon: 5 });
        }
    });
}

//重写<a>标签跳转页面
function rewriteA() {
   var links = $(document).find("a");
   for(var index in links){
      var _href = links.eq(index).attr("href");
      if(null != _href){
          links.eq(index).attr("href","javascript:eval_a_href_event('a"+index+"')");
      }
   }
}

function jump(url){
    console.log("跳转日志........")
    window.location.href = url;
}
