<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Passenger Registration Form</title>
</head>
<body>
    <h2>Passenger Registration Form</h2>
    <form:form action="registerPassenger" method="post" modelAttribute="passenger">
        <table>
            <tr>
                <td>Passenger ID:</td>
                <td><form:input path="passenger_id" /></td>
            </tr>
            <tr>
                <td>Passenger Name:</td>
                <td><form:input path="passenger_name" /></td>
            </tr>
            <tr>
                <td>Date of Birth:</td>
                <td><form:input path="passenger_dob" type="date" /></td>
            </tr>
            <tr>
                <td>Phone Number:</td>
                <td><form:input path="passenger_phone" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="passenger_email" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register Passenger" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
