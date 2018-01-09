$(function () {

    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

});

var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#menuList').bootstrapTable({
            url: '',                             //请求后台的URL（*）
            method: 'post',                      //请求方式（*）
            toolbar: '#toolbar',                 //工具按钮用哪个容器
            height: 460,                         //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            striped: true,                       //设置为 true 会有隔行变色效果
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                    //是否启用排序
            sortOrder: "asc",                   //定义排序方式 'asc' 或者 'desc'
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 50,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            paginationPreText:"上一页",          //指定分页条中上一页按钮的图标或文字,默认‘<’
            paginationNextText:"下一页",         //指定分页条中下一页按钮的图标或文字,默认‘>’
            strictSearch: true,                 //设置为 true启用 全匹配搜索，否则为模糊搜索
            clickToSelect: true,                //是否启用点击选中行
            idField:"id",                        //指定主键列
            uniqueId: "id",                      //每一行的唯一标识，一般为主键列
            cardView: false,                     //是否显示详细视图
            detailView: false,                   //设置为 true 可以显示详细页面模式
            search:true,                         //是否启用搜索框
            showRefresh:true,                    //是否显示 刷新按钮
            showToggle:true,                     //是否显示 切换试图（table/card）按钮
            showPaginationSwitch:true,           //是否显示 数据条数选择框

            columns: [{
                field: 'id',
                title: '序号',
                halign:'center',
                align:'center'
            }, {
                field: 'liushuiid',
                title: '交易编号',
                halign:'center',
                align:'center'
            }]
        });
    };

    //得到查询的参数
    oTableInit.queryParams = function (params) {
        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit: params.limit,   //页面大小
            offset: params.offset,  //页码
        };
        return temp;
    };
    return oTableInit;
};