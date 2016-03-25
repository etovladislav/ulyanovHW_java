<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Список пользователей</h1>

<core:forEach var="user" items="${users}">
    ${user.name} ${user.surname} ${user.login} ${user.age} <br>

    <core:forEach var="bookmark" items="${user.bookmarks}">
        <li>
                ${bookmark.siteName} ${bookmark.url}
        </li>
    </core:forEach>
    <li><a href="/add_bookmark/${user.id}">add bookmark</a></li>
    <br>
</core:forEach>

<a href="/">Назад</a>

</body>
</html>
