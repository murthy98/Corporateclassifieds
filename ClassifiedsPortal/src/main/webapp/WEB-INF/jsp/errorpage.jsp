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

<title>Notfound-404</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/jumbotron/">
<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Template Main CSS File -->
<style>
/*--------------------------------------------------------------
# General
--------------------------------------------------------------*/
#brand {
	color: white;
	outline: none;
	text-decoration: none;
	font-size: 45px;
	padding-left:1rem
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

/*--------------------------------------------------------------
 Card section
--------------------------------------------------------------*/

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
#button{
padding-top:10px;
}
.container{
padding-top:2rem;
}
</style>

</head><body>

	<!-- ======= Header ======= -->
	<header id="header">
		<div id="logo" class="pull-left">
			<a id="brand" href="viewalloffers"> Corporate Classifieds</a>


		</div>
	</header>
	<!-- End Header -->

	<!-- ======= Start Login ======= -->

	<main role="main">
		<div class="container" align="center">

			<div class="jumbotron" id="content">

				<h1 class="display-4">Service Unavailable.Please check after
					some time</h1>
			</div>
			<div id="image">
				<img src="https://static.thenounproject.com/png/2406164-200.png"
					alt="time out icon" width="200" height="230">
			</div>
			<div id="button">
				<a class="btn btn-primary btn-lg" href="userlogin" role="button">Click
					to Home&raquo;</a>
			</div>
		</div>
	</main>



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