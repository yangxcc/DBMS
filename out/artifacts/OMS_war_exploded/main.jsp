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
<p align="center">����������ѯ</p>
<br><hr>
<div align="center">
<form action="usercx" method="post">
    �û�����<input type="text" id="usercx" name="usercx"><br>
    ��ɫ  :<input type="text" id="role" name="role"><br>
    <input type="submit" value="�ύ">
</form>
</div>

<div align="center">
    ������Ĳ�ѯ�����ǣ��û�����<%=request.getParameter("usercx")%>&nbsp;��ɫ��<%=request.getParameter("role")%>
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
<%--        request.getRequestDispatcher("main.jsp").forward(request,response);   //һ��Ҫ��try...catch����Ϊ��һ�ν���main.jspû��ִ��servlet��--%>
<%--                                                                               // userlistΪ��ֵ--%>
<%--    }--%>
<%--%>--%>
<table align="center" border="1">
    <tr>
        <th>����</th>
        <th>����</th>
        <th>��ɫ</th>
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
