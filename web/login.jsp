<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html lang="en">
  <head>

    <title>登录</title>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="shortcut icon" href="favicon.ico">
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="static/css/animate.min.css" rel="stylesheet">
    <link href="static/css/style.min.css" rel="stylesheet">
    <link href="static/css/login.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>
        if(window.top!==window.self){window.top.location=window.location};
    </script>
  </head>

  <body class="signin">
  <div class="signinpanel">
    <div class="row">
      <div class="col-sm-7">
        <div class="signin-info">
          <div class="logopanel m-b">
            <h1>[ H+ ]</h1>
          </div>
          <div class="m-b"></div>
          <h4>欢迎使用 <strong>H+ 后台主题UI框架</strong></h4>
          <ul class="m-b">
            <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一</li>
            <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二</li>
            <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三</li>
            <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四</li>
            <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势五</li>
          </ul>
          <strong>还没有账号？ <a href="#">立即注册&raquo;</a></strong>
        </div>
      </div>
      <div class="col-sm-5">
        <form method="post" action="login">
          <h4 class="no-margins">登录：</h4>
          <p class="m-t-md">登录到H+后台主题UI框架</p>
          <input type="text" class="form-control uname" placeholder="用户名" name="username"/>
          <input type="password" class="form-control pword m-b" placeholder="密码" name="password"/>
          <a href="#">忘记密码了？</a>
          <button class="btn btn-success btn-block">登录</button>
        </form>
      </div>
    </div>
    <div class="signup-footer">
      <div class="pull-left">
        &copy; 2018 所有版权归 盛创软件工作室 所有
      </div>
    </div>
  </div>

  </body>

</html>
