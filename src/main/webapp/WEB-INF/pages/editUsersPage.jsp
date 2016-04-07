<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Being Java Guys | Spring DI Hello World</title>
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
