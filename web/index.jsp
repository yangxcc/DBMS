<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/16
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>订单管理系统</title>
    <script>
      window.onload = function () {
        var image = document.getElementById("img");
        image.onclick = function () {
          image.src =  "code?"+new Date().getTime()   //是gettime，不是getdate
        }
      }
    </script>
  </head>
  <body>
  <center><div>用户登录</div></center>
  <center>
  <form action="login" method="post">
    用户名<input type="text" id="user" name="user"/><br>
    密&nbsp;&nbsp;码<input type="password" id="pwd" name="pwd"/><br>
    验证码<input type="text" id="image" name="image" placeholder="请在此输入验证码">
    <img src="code" id="img"><br>
    <input type="submit" value="提交">&nbsp;&nbsp;<input type="reset" value="重置">
  </form>
  </center>
  <a href="frame.jsp">菜单测试</a>
  </body>
</html>
