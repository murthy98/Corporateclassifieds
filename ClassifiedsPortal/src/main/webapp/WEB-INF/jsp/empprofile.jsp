<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<title>Profile</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/jumbotron/">
<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
	padding-top: 3.5rem;
}

#content {
	padding-top: 5rem;
}

#profile {
	padding-left: 4rem;
}

#brand {
	font-size: 45px;
}

#addbutton {
	padding-top: 10px;
}

#search {
	padding-left: 1rem;
}

#logbutton {
	padding-right: 2rem;
}

#profilecontent {
	padding-top: 1rem;
	padding-left: 30rem;
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
	padding-top: 2rem;
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
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="viewalloffers">Home</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Menu </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
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
			</div>
		</div>
		<div id="logbutton">
			<a class="btn btn-outline-success" href="logout">Logout<role="button"></a>
			<div>
	</nav>
	<main role="main">

		<div class="jumbotron" id="content">
			<div class="container">
				<h1 class="display-6" align="center">Your Profile</h1>
			</div>
		</div>
		<div id="subscribe">
			<section class="subscribe" align="center">
				<div class="container" data-aos="fade-up" align="center">
					<div class="col-md-3">
						<div class="card">
							<div class="card-body">
								<!-- Example row of columns -->
								<div id="image">
									<img
										src="https://www.pngitem.com/pimgs/m/2-24109_computer-icons-login-person-black-black-and-white.png"
										alt="sign in logo" width="200" height="200">
								</div>
								<h2>${employee.empName}</h2>
								<h5>Emolyee Id:${employee.empId}</h5>
								<h5>${employee.empEmail}</h5>
								<h5>Points Gained:${points}</h5>
							</div>
						</div>
						<div id="addbutton">
							<a class="btn btn-primary btn-lg" href="addOffer" role="button">Post
								a New Offer &raquo;</a>
						</div>
					</div>
			</section>
		</div>

	</main>
	<div id="footer">
		<div id="footercontent">© 2020 Copyright:
			CorporateClassifieds.com</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>

</html>
