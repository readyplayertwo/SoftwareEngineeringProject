<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>China Express Railway| Edit Trains</title>
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



 <b>Edit Train Details </b>


  <div>
   <form:form method="post" action="/SpringMVCSecurityXML/updateTrains" modelAttribute="train">
    <table>
     <tr>
      <td>Name :</td>
      <td><form:input path="name"
        value="${map.train.name}" />
      </td>
     </tr>
     <tr>
      <td>Source :</td>
      <td><form:input path="source" value="${map.train.source}" />
      </td>
     </tr>

     <tr>
          <td>Destination :</td>
          <td><form:input path="destination" value="${map.train.destination}" />
          </td>
      </tr>

      <tr>
        <td>Departure Time :</td>
        <td><form:input path="departureTime" value="${map.train.departureTime}" />
        </td>
      </tr>

      <tr>
        <td>Arrival Time :</td>
        <td><form:input path="arrivalTime" value="${map.train.arrivalTime}" />
        </td>
     </tr>

      <tr>
        <td>Total Seats:</td>
        <td><form:input path="totalSeats" value="${map.train.totalSeats}" />
        </td>
      </tr>

       <tr>
         <td>Kilometers:</td>
         <td><form:input path="kilometers" value="${map.train.kilometers}" />
         </td>
       </tr>

       <tr>
         <td>First Class Seats Remaining:</td>
         <td><form:input path="firstClassSeats" value="${map.train.firstClassSeats}" />
         </td>
       </tr>

        <tr>
          <td>Second Class A Seats Remaining:</td>
          <td><form:input path="secondClassASeats" value="${map.train.secondClassASeats}" />
          </td>
        </tr>

        <tr>
          <td>Second Class B Seats Remaining:</td>
          <td><form:input path="secondClassBSeats" value="${map.train.secondClassBSeats}" />
          </td>
        </tr>

         <tr>
           <td>Route:</td>
           <td><form:input path="route" value="${map.train.route}" />
           </td>
         </tr>

          <tr>
            <td>Date:</td>
            <td><form:input path="date" value="${map.train.date}" />
            </td>
          </tr>


      <td> </td>
      <td><input type="submit" value="Save" />
      </td>
     </tr>
    </table>
    <form:hidden path="trainId" value="${map.train.trainId}" />

   </form:form>
  </div>
 </center>
</body>
</html>