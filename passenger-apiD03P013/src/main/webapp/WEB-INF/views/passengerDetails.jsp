<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Passenger Details</title>
</head>
<body>
<h1>Passenger Details</h1>
<c:if test="${not empty passenger}">
    <p>ID: ${passenger.id}</p>
    <p>First Name: ${passenger.firstName}</p>
    <p>Last Name: ${passenger.lastName}</p>
    <p>Age: ${passenger.age}</p>
    <p>Email: ${passenger.email}</p>
</c:if>
</body>
</html>
