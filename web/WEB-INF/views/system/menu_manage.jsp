<%-- 菜单管理页面 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>菜单管理</title>
    <base href="<%=basePath%>">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/plugins/bootstrap-table/bootstrap-table.min.css">

</head>
<body>

    <div>
        <div class="table-responsive">
            <div id="toolbar">
                <a class="btn btn-success" href="#" role="button">新增</a>
                <a class="btn btn-info" href="#" role="button">修改</a>
                <a class="btn btn-danger" href="#" role="button">删除</a>
            </div>
            <table id="menuList"></table>
        </div>
    </div>

<script src="static/js/jquery.min.js?v=2.1.4"></script>
<script src="static/js/bootstrap.min.js?v=3.3.6"></script>
<script src="static/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="static/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="static/js/system/menu_manage.js"></script>

</body>
</html>
