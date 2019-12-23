<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2019/11/16
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    out.print(str);
    String mmm = request.getParameter("m");

%>

<%=mmm + ",,,"%>

<%!
    String str = "幻听";

%>
<br>

</body>
</html>
