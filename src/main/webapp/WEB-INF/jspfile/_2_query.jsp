<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Merhabalar Jsp</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<h1 class="text-primary display-4">Merhabalar Query</h1>

<ul class="list-group">
    <li class="list-group-item text-success">Mesaj ${query_key.concat(" Deneme").toUpperCase()}</li>
    <li class="list-group-item text-primary">ADI:    <span class="text-warning">${query_admin.adminName}</span>    </li>
    <li class="list-group-item text-primary">SOYADI:  <span class="text-warning">${query_admin.adminSurname}</span>  </li>
</ul>


<%--//JSF--%>
<%--//JSP--%>
<%--//Themaleaf--%>
<%--//React--%>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
</body>
</html>