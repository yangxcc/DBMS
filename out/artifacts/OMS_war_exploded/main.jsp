<%@ page import="java.sql.ResultSet" %>
<%@ page import="domain.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.taglibs.standard.tag.common.core.NullAttributeException" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/21
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" pageEncoding="GBK" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p align="center">根据条件查询</p>
<br><hr>
<div align="center">
<form action="usercx" method="post">
    用户名：<input type="text" id="usercx" name="usercx"><br>
    角色  :<input type="text" id="role" name="role"><br>
    <input type="submit" value="提交">
</form>
</div>

<div align="center">
    您输入的查询条件是：用户名：<%=request.getParameter("usercx")%>&nbsp;角色：<%=request.getParameter("role")%>
</div>
<hr>
<%--<%--%>
<%--    try{--%>
<%--        ArrayList userlist = (ArrayList) request.getAttribute("userlist");--%>
<%--    for (int i =0;i < userlist.size();i++){--%>
<%--        User user = (User) userlist.get(i);--%>
<%--        //out.println(user.getName());--%>
<%--    }--%>
<%--    } catch (NullPointerException e){--%>
<%--        request.getRequestDispatcher("main.jsp").forward(request,response);   //一定要有try...catch，因为第一次进入main.jsp没有执行servlet，--%>
<%--                                                                               // userlist为空值--%>
<%--    }--%>
<%--%>--%>
<table align="center" border="1">
    <tr>
        <th>姓名</th>
        <th>密码</th>
        <th>角色</th>
    </tr>
    <%
        try{
            ArrayList userlist = (ArrayList) request.getAttribute("userlist");
            for (int i = 0;i<userlist.size();i++){
                User user = (User) userlist.get(i);%>
   <tr>
       <td><%=user.getName()%></td>
       <td><%=user.getPassword()%></td>
       <td><%=user.getRole()%></td>
   </tr>
           <% }%>
      <%  } catch (NullPointerException e){
            request.getRequestDispatcher("main.jsp").forward(request,response);
      }%>
</table>

</body>
</html>
