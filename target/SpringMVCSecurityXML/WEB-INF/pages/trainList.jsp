
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>China Express Railway | Train List</title>
<style>
body {
 font-size: 20px;
 color: teal;
 font-family: Calibri;
}

td {
 font-size: 15px;
 color: black;
 width: 100px;
 height: 22px;
 text-align: center;
}
.heading {
 font-size: 18px;
 color: white;
 font: bold;
 background-color: orange;
 border: thick;
}
</style>
</head>
<body>
 <center>



 <b>Train List | China Express Railway </b>

  <table border="1">
   <tr>
    <td class="heading">Train ID</td>
    <td class="heading">Name</td>
    <td class="heading">Source</td>
    <td class="heading">Destination</td>
    <td class="heading">Departure Time</td>
    <td class="heading">Arrival Time</td>
    <td class="heading">Total Seats</td>
    <td class="heading">Kilometers</td>
    <td class="heading">First Class Seats Remaining</td>
    <td class="heading">Second Class A Seats Remaining</td>
    <td class="heading">Second Class B Seats Remaining</td>
    <td class="heading">Route</td>
    <td class="heading">Date</td>

    <td class="heading">Edit</td>
    <td class="heading">Delete</td>
   </tr>
   <c:forEach var="train" items="${trainList}">
    <tr>
     <td>${train.trainId}</td>
     <td>${train.name}</td>
     <td>${train.source}</td>
     <td>${train.destination}</td>
     <td>${train.departureTime}</td>
     <td>${train.arrivalTime}</td>
     <td>${train.totalSeats}</td>
     <td>${train.kilometers}</td>
     <td>${train.firstClassSeats}</td>
     <td>${train.secondClassASeats}</td>
     <td>${train.secondClassBSeats}</td>
     <td>${train.route}</td>
     <td>${train.date}</td>

     <td><a href="editTrains?id=${train.trainId}">Edit</a></td>
     <td><a href="deleteTrain?id=${train.trainId}">Delete</a></td>
    </tr>
   </c:forEach>
  </table>

 </center>
</body>
</html>

