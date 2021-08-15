<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br>

<%
    System.out.println("sout");
    out.println("it is a demo");
    out.println("jsp内置对象：在jsp页面不需要获取和创建，直接可使用的对象");
    String contextPath = request.getContextPath();
    out.println(contextPath);
%>


</body>
</html>