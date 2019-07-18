<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
      
    <style>
       body
       {
      		background-image: url("img/download.jfif");
      		background-size: cover;
      		background-repeat: no-repeat;
     
       }
     </style>
     
</head>
<body>

	<form>
		<h2><center>Login</center></h2>
			<div class="container mt-5">
            	<form>
	                <div class="form-group row">
	                   <label class="col-2">UserName</label>
	                   <input type="text" class="form-control col-8" placeholder="Enter your Username">
	                </div>
              
	                <div class="form-group row">
	                    <label class="col-2">Password</label>
	                    <input type="text" class="form-control col-8" placeholder="Enter your Username">
	                </div>
	               <center> <input type="button" CLASS="form-group row btn btn-primary col-2" value="submit"> </center>
	                
                </form>
                
                <br>
            </div>
            
	        <center>
				<a href="ForgotPassword.jsp">Forgot Passsword?</a><br>
				<a href="TeacherRegistration.jsp">New Registration?</a>
			</center>
	 </form>
</body>
</html>