<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/" method="post">
    <label>Name</label><input type="text" name="name"/><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
