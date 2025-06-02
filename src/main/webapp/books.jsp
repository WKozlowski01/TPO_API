<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Wyniki</title></head>
<body>
<h1>Wszystkie książki</h1>
<ul>
    <c:forEach var="book" items="${books}">
        <li>${book.title} - ${book.author}</li>
    </c:forEach>
</ul>
</body>
</html>