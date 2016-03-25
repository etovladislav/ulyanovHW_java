<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Добавление новой закладки: </h1>

<sf:form action="/add_bookmark" method="post" modelAttribute="bookmark">

    <sf:label path="siteName">Site name: </sf:label> <sf:input path="siteName"/> <sf:errors path="siteName"/> <br>
    <sf:label path="url">URL: </sf:label> <sf:input path="url"/> <sf:errors path="url"/><br>

    <button type="submit">Сохранить</button>
</sf:form>

</body>
</html>
