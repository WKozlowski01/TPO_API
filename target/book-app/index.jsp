<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Biblioteka książek</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f9f9f9;
        }
        h1 {
            color: #333;
        }
        section {
            margin-bottom: 40px;
            padding: 20px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
        }
        input[type=text], input[type=number] {
            padding: 6px;
            width: 250px;
            margin: 5px 0;
        }
        input[type=submit] {
            padding: 6px 12px;
            margin-top: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
        }
        input[type=submit]:hover {
            background-color: #45a049;
        }
        form {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<h1>System biblioteczny</h1>

<section>
    <h2>Wyszukaj książkę</h2>
    <form action="search" method="get">
        <input type="text" name="query" placeholder="Tytuł lub autor" required>
        <input type="submit" value="Szukaj">
    </form>
</section>

<!-- 📋 Lista wszystkich książek -->
<section>
    <h2>Wszystkie książki</h2>
    <a href="books">Pokaż listę książek</a>
</section>
</body>
</html>