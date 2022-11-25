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
<form action="resp" method="post">

    <input name="name" type="text"  />
    <input name="password" type="password" /><br>
    <button onclick="">提交</button>
</form>
</body>
</html>