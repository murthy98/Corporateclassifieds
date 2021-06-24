<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Corporate Classifieds</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="assets/img/favicon.png" rel="icon">
    <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700"
        rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <!-- Template Main CSS File -->
    <style>
        /*--------------------------------------------------------------
# General
--------------------------------------------------------------*/
body {
    background: linear-gradient(90deg, rgba(233,233,213,1) 0%, rgba(196,195,208,1) 35%, rgba(233,233,213,1) 100%);
    font-family: "Open Sans", sans-serif;
  }
  

  
  #brand {
    color: white;
    outline: none;
    text-decoration: none;
    padding-left:2rem;
  }
  
  p {
    padding: 0;
    margin: 0 0 30px 0;
  }
  
  h1, h2, h3, h4, h5, h6 {
    font-family: "Poppins", sans-serif;
    font-weight: 400;
    margin: 0 0 20px 0;
    padding: 0;
  }

  
  /*--------------------------------------------------------------
  # Header
  --------------------------------------------------------------*/
  #header {
    padding: 10px 0;
    height: 100px;
    position: relative;
    left: 0;
    top: 0;
    right: 0;
 background-color: #1a1a1a;
 
  }
  
  #header.header-fixed {
    background: rgba(19, 23, 26, 0.9);
    padding: 30px 0;
    height: 80px;
  }

  .pull-left {
      float: left;
  }

  /*--------------------------------------------------------------
 Card section
--------------------------------------------------------------*/

.login-form {
    width: 340px;
    margin: 50px auto;
    font-size: 15px;
    padding-top:4rem;
}
.login-form form {
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .btn {
    min-height: 38px;
    border-radius: 2px;
}
.btn {        
    font-size: 15px;
    font-weight: bold;
}

/*--------------------------------------------------------------
# Footer
--------------------------------------------------------------*/
#footer {
  height: 80px;
  background-color: #1a1a1a;
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  color: white;
  text-align: center;
}

#footercontent {
  padding-top: 2rem;
}

#logo{

  padding-top: 6px;
  font-size: 45px;


}
#invalidmsg{
color:red;
text-align: center;
align-content: center;
padding-top:10px;
}



  
  </style>

</head>

<body>

    <!-- ======= Header ======= -->
    <header id="header">
            <div id="logo" class="pull-left">
               <a id="brand" href="viewalloffers"> Corporate Classifieds</a>

      
        </div>
    </header>
    <!-- End Header -->

    <!-- ======= Start Login ======= -->


<div class="login-form">
    <form action="/login" method="post" >
    
        <div class="text-center"><img src="https://www.pngitem.com/pimgs/m/2-24109_computer-icons-login-person-black-black-and-white.png"
        alt="sign in logo" width="90" height="90" ></div>  
        <div id="invalidmsg"><p>${invalidmsg}</p></div>   
        <div class="form-group">
           <input type="text" class="form-control" id="inputEmail3"
                  name="empUsername" placeholder="Username">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" id="inputPassword3"
                  name="empPassword" placeholder="Password">
        </div>
        <div class="form-group">
            <button id="submit" type="submit" class="btn btn-primary btn-block">Sign in</button>
        </div>
              
    </form>
</div>



  <!-- ======= End Login ======= -->





    <!-- ======= Footer ======= -->
        <!-- ======= Footer ======= -->
      <div id="footer">
              <div id="footercontent">© 2020 Copyright:
                CorporateClassifieds.com</div>
            </div>
<!-- End Footer -->
   
</body>

</html>