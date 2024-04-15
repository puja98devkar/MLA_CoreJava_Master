<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Passenger List</title>
</head>
<body>
    <h2>Registered Passengers</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>DOB</th>
                <th>Phone</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${passengerList}" var="passenger">
                <tr>
                    <td>${passenger.passenger_id}</td>
                    <td>${passenger.passenger_name}</td>
                    <td>${passenger.passenger_dob}</td>
                    <td>${passenger.passenger_phone}</td>
                    <td>${passenger.passenger_email}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <br>
    <a href="passengerForm">Add Passenger</a>

    <br><br>
    <c:if test="${not empty successMessage}">
        <div style="color: green;">${successMessage}</div>
    </c:if>
</body>
</html>
