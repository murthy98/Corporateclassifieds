<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8" content="width=device-width, initial-scale=1.0"
	name="viewport">
<title>SearchCategory</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/jumbotron/">
<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 3.5rem;
	position: relative;
	margin: 0;
	padding: 0;
	overflow: auto;
}

#content {
	padding-top: 8rem;
}

#content1 {
	padding-top: 2rem;
}

#search {
	padding-left: 65rem;
}

#search {
	padding-left: 1rem;
}

#logbutton {
	padding-left: 2rem;
}

#brand {
	font-size: 45px;
}

#offerbutton {
	padding-top: 1rem;
}

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
	padding-top: 1rem;
}
#selectcategory{
     width:250px;    
}
#category{
padding-top:1rem;
}

</style>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" id="brand" href="viewalloffers">Corporate
				Classifieds</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Menu </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="viewprofile">My
									Profile</a></li>
							<li><a class="dropdown-item" href="myoffer">My Offers</a></li>
							<li><a class="dropdown-item" href="viewtopofferbylikes">Top
									Offers</a></li>
							<li><a class="dropdown-item" href="viewoffer">Other
									Employee Offers</a></li>
							<li><a class="dropdown-item" href="viewofferbyposteddate">Search
									Offer By Posted Date</a></li>
							<li><a class="dropdown-item" href="viewofferbycatid">Search
									Offer By Category</a></li>

						</ul></li>
				</ul>
				<ul class='nav'>
					<div id="logbutton">
						<a class="btn btn-outline-success" href="logout">Logout<role="button"></a>
						<div></div>
					</div>
	</nav>



	<main role="main">
		<div class="container" align="center">

			<div class="jumbotron" id="content">

				<h1 class="display-6">Search Offer By Category</h1>
			</div>

			<form action="viewofferbycat">
			
				<div id="category">
					<label for="inputPassword" class="visually-hidden" >Offer
						Category</label> <select name="offCategoryId" class="form-control"
						id="selectcategory" required="true">
						<option value="">Choose Category</option>
						<option value="120">Homes</option>
						<option value="121">Vehicles</option>
						<option value="122">Electronics</option>
						<option value="123">Home Appliances</option>
						<option value="124">Mobiles & Tablets</option>
						<option value="125">Furniture & Decors</option>
						<option value="126">Commercial Rentals</option>
					</select>
				</div>
				<div id="offerbutton">
					<button class="btn btn-primary btn-lg">
						View Offer &raquo;</a>
				</div>
		</div>
		</div>
	</main>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>

</body>
<footer id="footer">
	<div id="footercontent">© 2020 Copyright:
		CorporateClassifieds.com
</footer>
</div>

</html>