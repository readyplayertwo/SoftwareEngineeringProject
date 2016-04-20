<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
   <html>

   <head>
   <link rel="stylesheet" type="text/css" href="css/styles.css"/>
   <title>China Express Railway| Train Search</title>
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
      <form:form method="POST" action="/trainSearchResults" modelAttribute="train">
      		<table>
      			<tr>
      				<td><form:label path="name">Name</form:label></td>
      				<td><form:input path="name" value="${map.Name}" /></td>
      			</tr>
      			<tr>
      				<td><form:label path="source">source</form:label></td>
      				<td><form:input path="source" value="${map.Source}"/></td>
      			</tr>
      			<tr>
      				<td><form:label path="destination"> Destination</form:label></td>
      				<td><form:input path="destination" /></td>
      			</tr>
                <tr>
            	    <td><form:label path="departureTime"> departureTime</form:label></td>
            		<td><form:input path="departureTime" /></td>
            	</tr>
                <tr>
                    <td><form:label path="arrivalTime"> arrivalTime</form:label></td>
                     <td><form:input path="arrivalTime" /></td>
                </tr>
                <tr>
                  	 <td><form:label path="totalSeats"> totalSeats</form:label></td>
                     <td><form:input path="totalSeats" /></td>
                </tr>
                <tr>
                   <td><form:label path="kilometers"> kilometers</form:label></td>
                   <td><form:input path="kilometers" /></td>
                </tr>
                <tr>
                   <td><form:label path="firstClassSeats"> firstClassSeats</form:label></td>
                   <td><form:input path="firstClassSeats" /></td>
                </tr>
                <tr>
                    <td><form:label path="secondClassASeats"> secondClassASeats</form:label></td>
                    <td><form:input path="secondClassASeats" /></td>
                 </tr>
                <tr>
                    <td><form:label path="secondClassBSeats"> secondClassBSeats</form:label></td>
                    <td><form:input path="secondClassBSeats" /></td>
                </tr>
                <tr>
                    <td><form:label path="route"> route</form:label></td>
                    <td><form:input path="route" value="${map.Route}" /></td>
                </tr>
                <tr>
                    <td><form:label path="date"> date</form:label></td>
                    <td><form:input path="date" /></td>
                </tr>
      			<tr>
      				<td><input type="submit" value="Submit" /></td>
      			</tr>
      		</table>
      	</form:form>

     </div>
    </center>
    <script>
   cars=new Array("Mercedes","Volvo","BMW","porche");
   phones=new Array('Samsung','Nokia','Iphone');
   names=new Array('Kasper','Elke','Fred','Bobby','Frits');
   colors=new Array('blue','green','yellow');

   populateSelect();

   $(function() {

         $('#cat').change(function(){
           populateSelect();
       });

   });

   document.getElementById("selectSource").;
   document.getElementById("mySelect").onchange = function(){

   function populateSelect(){
       cat=$('#cat').val();
       $('#item').html('');

          eval(cat).forEach(function(t) {
               $('#item').append('<option>'+t+'</option>');
           });
       }
    </script>
   </body>

   </html>
