<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<title>Being Java Guys | Spring DI Hello World</title>
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
 text-align: left;
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


 <b>China Express Railway | User Registration Form </b>

  <div>
   <form:form method="post" action="/insertTrain" modelAttribute="train">
    <table>
     <tr>
      <td> Name:</td>
      <td><form:input path="name" /></td>
     </tr>
     <tr>
      <td>Source :</td>
      <td><form:input path="source" /></td>
     </tr>
     <tr>
      <td>Destination :</td>
      <td><form:input path="destination" /></td>
     </tr>
     <tr>
      <td>Departure Time :</td>
      <td><form:input path="departureTime"/></td>
     </tr>
     <tr>
      <td>Arrival Time:</td>
      <td><form:input path="arrivalTime"/></td>
     </tr>
     <tr>
      <td>Total Seats:</td>
      <td><form:input path="totalSeats"/></td>
     </tr>
     <tr>
      <td>Kilometers:</td>
      <td><form:input path="kilometers"/></td>
     </tr>
     <tr>
      <td>First Class Seats:</td>
      <td><form:input path="firstClassSeats"/></td>
     </tr>
     <tr>
      <td>Second Class A Seats:</td>
      <td><form:input path="secondClassASeats"/></td>
     </tr>
     <tr>
      <td>Second Class B Seats:</td>
      <td><form:input path="secondClassBSeats"/></td>
     </tr>
     <tr>
      <td>Route:</td>
      <td><form:input path="route"/></td>
     </tr>
     <tr>
      <td>Date:</td>
      <td><form:input type="date" path="date"/></td>
     </tr>
     <tr>
      <td><input type="submit" value="Save" /></td>
     </tr>
     <tr>

      <td colspan="2"><a href="getTrainsList">Click Here to See The train List</a></td>
     </tr>
    </table>
   </form:form>
  </div>
 </center>
</body>
</html>
