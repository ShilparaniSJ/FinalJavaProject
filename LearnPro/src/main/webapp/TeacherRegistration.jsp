<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
       <style>
       body{
      background-image: url("img/bgg.jpg");
      background-size: cover;
      background-repeat: no-repeat;
     
       }
       
       </style>

</head>
<body>
<h2><center>Personal Information</center></h2>
	 <div class="container mt-5">
            <form>
                <div class="form-group row">
                    <label class="col-3">FullName</label>
                    <input type="text" name="FullName" class="form-control col-6">
                </div>
                
                 <div class="form-group row">
                    <label class="col-3">Email</label>
                    <input type="text" name="Email" class="form-control col-6">
                </div>
                
                <div class="form-group row">
                    <label class="col-3 col-form-label">Phone Number</label>
                    <input type="number" name="PhoneNo" class="form-control col-6">
                </div>
                
                 <div class="form-group row">
                    <label class="col-3">Address</label>
                    <input type="text" name="Address" class="form-control col-6">
                </div>
                
                 <div class="form-group row">
                    <label class="col-3">Gender</label>
                    <input type="radio" name="Gender" value="female">Female
                    <input type="radio" name="Gender" value="female">Male
                </div>
                
                <div class="form-group row">
                    <label class="col-3">Qualification</label>
                    <input type="text" name="Qualification" class="form-control col-6">
                </div>
                
                <div class="form-group row">
                    <label class="col-3">Password</label>
                    <input type="password" name="Password" class="form-control col-6">
                </div>
                
               <div class="form-group row">
                    <label class="col-3">Photo</label>
                    <input type="file" name="myFile">
                    
                </div>
                <br>
              <center> <a href="Specification.jsp"><input type="button" CLASS="form-group row btn btn-primary col-2" value="NEXT"></a></center>
           
            </form>
           
        </div>
	
	


</body>
</html>