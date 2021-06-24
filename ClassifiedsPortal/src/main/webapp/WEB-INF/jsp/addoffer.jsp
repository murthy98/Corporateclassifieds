<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.79.0">
<title>AddOffer</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/sign-in/">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

#main {
	padding-bottom: 15rem;
}

#content1 {
	padding-top: 5rem;
}

#search {
	padding-left: 1rem;
}

#contentcat {
	padding-top: 4rem;
}

#logbutton {
	padding-right: 2rem;
}
#footer{
  height: 80px;
  background-color: #1a1a1a; 
  position:fixed;
  
   left: 0;
   bottom: 0;
   width: 100%;
   color: white;
   text-align: center;
}
#footercontent{
padding-top:2rem;
}
</style>
<script>
function validateForm() {
  var offername = document.getElementById("offerName").value;
  var openedDate =document.getElementById("openedDate").value;
  var closedDate = document.getElementById("closedDate").value;
  openedDate = new Date(openedDate);
  closedDate = new Date(closedDate);
  var regex = /^[A-Za-z_ ]+$/;
  if (!(offername.match(regex))) {
    alert("Offer Name must be alphabets only");
    return false;
  }
  else if( openedDate > closedDate){
      alert("Offer Closing date should be higher than offer opening date");
      return false;
  }
  
}
</script>


</head>
<body class="text-center">
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

	<main class="form-signin" id="main">
		<form name="addoffer" method="post" action="/addOffer" onsubmit="return validateForm()" >
			<div class="jumbotron" id="content">
				<div class="container">
					<h1 class="display-6">Post Your Offer</h1>
				</div>
			</div>
			<div id="content1">

				<label for="inputEmail" class="visually-hidden">Employee Id</label>
				<input type="text" id="inputEmail" class="form-control"
					placeholder="Employee id" value="${empid}" name="empId" required
					autofocus readonly="readonly"> <label for="offerName"
					class="visually-hidden">Offer Name</label> <input type="text"
					id="offerName" class="form-control" placeholder="Offer name"
					name="offerName"   autofocus> <label
					for="openedDate" class="visually-hidden">Open Date</label> <input
					type="date" id="openedDate" class="form-control"
					placeholder="Open Date" name="openedDate" required autofocus>

				<label for="closedDate" class="visually-hidden">Close Date</label> <input
					type="date" id="closedDate"  class="form-control"
					placeholder="Close Date" name="closedDate" required autofocus>

				<label for="inputPassword" class="visually-hidden">Offer
					Category</label> <select name="offerCategoryId" class="form-control"
					id="selectcategory" required>
					<option value="">Choose Category</option>
					<option value="120">Homes</option>
					<option value="121">Vehicles</option>
					<option value="122">Electronics</option>
					<option value="123">Home Appliances</option>
					<option value="124">Mobiles & Tablets</option>
					<option value="125">Furniture & Decors</option>
					<option value="126">Commercial Rentals</option>
				</select>


				<div class="checkbox mb-3"></div>
				<button class="w-100 btn btn-lg btn-primary" type="submit" >Add
					offer</button>
		</form>
	</main>
	</div>
	<div id="footer">
		<div id="footercontent">© 2020 Copyright:
			CorporateClassifieds.com</div>
	</div>
	<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
	crossorigin="anonymous"></script>
</body>


<style>
html, body {
	height: 100%;
}

body {
	display: flex;
	align-items: center;
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	width: 100%;
	max-width: 330px;
	padding: 15px;
	margin: auto;
}

.form-signin .checkbox {
	font-weight: 400;
}

.form-signin .form-control {
	position: relative;
	box-sizing: border-box;
	height: auto;
	padding: 10px;
	font-size: 16px;
}

.form-signin .form-control:focus {
	z-index: 2;
}

.form-signin input[type="email"] {
	margin-bottom: -1px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}

#content {
	padding-top: 5rem;
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
	padding-top: 2rem;
}
</style>




</html>