<%--
  Info: 
  User: One
  Date: 2019-03-15


--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>⼀一⾏行行 Java 代码</h3>
<p>

    今天的⽇日期是: <%=(new java.util.Date())%>
</p>
<h3>多⾏行行 Java 代码</h3>
<p>

    你的 IP 地址是： <% out.println("Your IP address is " + request.getRemoteAddr() + "</br>");
    out.println("⼀一段代码 "); %></p>
<h3>For 循环实例例</h3> <% int count = (int) session.getAttribute("count");
    for (int fontSize = 1; fontSize <= count; fontSize++) { %> 纯洁的微笑 <br/> <%}%>
</body>
</html>
