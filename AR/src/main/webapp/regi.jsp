<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
  <script type="text/javascript" src="js/index.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<script type="text/javascript">
function validateform(){  
var fname = document.myform.fname.value;  
var password=document.myform.password.value;  
  
if (fname==null || fname==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password.length<6){  
  alert("Password must be at least 6 characters long and can't be empty .");  
  return false;  
  }  
}  
</script> 
  
<body>
<h1> User Registration Form</h1>
<form action="Register1" method="post" name="myform"  onsubmit="return validateform()">
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="lname">Last name:</label>
  <input type="text" id="lname" name="lname"><br><br>
  <label for="phone">phone number:</label>
<input type="tel" id="phone" name="phone" ><br><br>
  <label for="fname">Username: </label>
  <input type="text" id="User" name="Username"><br><br>
  <label for="fname">Password: </label>
  <input type="text" id="password" name="password"><br><br>
  
  <input type="submit" value="Submit"  >
 
</form>
</body>
</html>