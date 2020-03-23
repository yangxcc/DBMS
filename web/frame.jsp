<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/21
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>主框架</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/frame.css">
</head>
<body>
<div class="main">
    <!--左侧菜单-->
    <div class="left">
        <div class="logo">
            <span> 后台管理系统框架 </span>
            <i class="toggle-menu-icon icon-sk054" onclick="leftMenuToggleEvent(event)"></i>
        </div>
        <ul class="menu first"></ul>
    </div>
    <!--顶部导航栏-->
    <div class="top">
        <div class="top-tool"></div>
        <div class="top-nav">
            <i class="icon-sk027 tab-pre"></i>
            <div class="tab-scroll">
                <div class="tab-container"></div>
            </div>
            <i class="icon-sk027 tab-next"></i>
        </div>
    </div>
    <!--页面容器-->
    <div class="container">

    </div>
</div>
<script src="js/jquery-1.8.1.min.js"></script>
<script src="js/DIVembed.js"></script>
<script src="js/underscore.js"></script>
<script src="js/mousewheel.js"></script>
<script src="js/frame.js"></script>
</body>
</html>
