<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看图书列表</title>
</head>
<body>
<h1>查看图书列表</h1>
<c:forEach var="book" items="${list}">
    ${book.book_id}_${book.book_name}_${book.book_counts}_${book.detail}
</c:forEach>

</body>
</html>
