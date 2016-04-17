<html>
<link rel="stylesheet" type="text/css" href="css/styles.css"/>

<head>
<title>Login</title>
</head>
<body>

 
 <div id="headerArea">
  <h1>Login</h1>
 </div>
 
 <div id="pageWrapper">
 <form name='f' action="j_spring_security_check" method='POST'>
 
    <table>
       <tr>
          <td>Username:</td>
          <td><input type='text' name='username' value=''></td>
       </tr>
       <tr>
          <td>Password:</td>
          <td><input type='password' name='password' /></td>
       </tr>
       
       
    </table>
    
      <input name="submit" type="submit" value="Log In" class="button" />
</form>
</div>
</body>
</html>
