<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>China Express Railway | Edit Trains</title>
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



 <b>Edit User Details </b>


  <div>
   <form:form method="post" action="/SpringMVCSecurityXML/update" modelAttribute="user">
    <table>
     <tr>
      <td>ForeName :</td>
      <td><form:input path="foreName"
        value="${map.user.foreName}" />
      </td>
     </tr>
     <tr>
      <td>Surname :</td>
      <td><form:input path="surName" value="${map.user.surName}" />
      </td>
     </tr>

     <tr>
          <td>UserName :</td>
          <td><form:input path="Username" value="${map.user.username}" />
          </td>
      </tr>

         <tr>
                   <td>Password :</td>
                   <td><form:input path="password" value="${map.user.password}" />
                   </td>
         </tr>

      <td> </td>
      <td><input type="submit" value="Save" />
      </td>
     </tr>
    </table>
    <form:hidden path="userId" value="${map.user.userId}" />

   </form:form>
  </div>
 </center>
</body>
</html>