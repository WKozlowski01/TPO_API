<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>Wyniki</title></head>
<body>
<h1>Wyniki wyszukiwania</h1>
<ul>
    <c:forEach var="book" items="${books}">
        <li>${book.title} - ${book.author}</li>
    </c:forEach>
</ul>
<a href="index.jsp">Wróć</a>
</body>
</html>