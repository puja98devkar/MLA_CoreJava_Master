<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Passenger List</title>
</head>
<body>
<h1>Passenger List</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${passengers}" var="passenger">
        <tr>
            <td>${passenger.id}</td>
            <td>${passenger.firstName}</td>
            <td>${passenger.lastName}</td>
            <td>${passenger.age}</td>
            <td>${passenger.email}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<h2>Add Passenger</h2>
<form action="/passengers" method="post">
    First Name: <input type="text" name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Age: <input type="text" name="age"/><br/>
    Email: <input type="text" name="email"/><br/>
    <input type="submit" value="Add Passenger"/>
</form>
</body>
</html>
