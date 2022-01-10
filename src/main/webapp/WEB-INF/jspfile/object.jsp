<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Merhabalar Jsp</title>

</head>
<body>
<h1 >Merhabalar Object JSP </h1>
<h2>ID     : ${student_key.studentId} </h2>
<h2>NAME   : ${student_key.studentName}</h2>
<h2>SURNAME: ${student_key.studentSurname}</h2>
</body>
</html>