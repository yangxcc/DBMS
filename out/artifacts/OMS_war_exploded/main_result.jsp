<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/3/22
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    ResultSet rs = (ResultSet) request.getAttribute("value");
%>
<body>

查询结果为 <%=rs.getString(1)%>

</body>
</html>
