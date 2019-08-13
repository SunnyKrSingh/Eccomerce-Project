<%-- <%@include file="includes/header.jsp" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Daily Shop | Account Page</title>
<%--  <jsp:include page="${pageContext.request.contextPath }/includes/header.jsp"/> --%>
<%@include file="../../includes/header.jsp"%>
</head>
<body>

	<%@include file="../../includes/menu.jsp"%>

	<!-- catg header banner section -->
	<section id="aa-catg-head-banner">

		<img src="../img/fashion/fashion-header-bg-8.jpg" alt="fashion img">
		<div class="aa-catg-head-banner-area">
			<div class="container">
				<div class="aa-catg-head-banner-content">
					<h2>Account Page</h2>
					<ol class="breadcrumb">
						<li><a href="${pageContext.request.contextPath}">Home</a></li>
						<li class="active">Account</li>
					</ol>
				</div>
			</div>
		</div>
	</section>
	<!-- / catg header banner section -->

	<!-- Cart view section -->
	<section id="aa-myaccount">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="aa-myaccount-area">
						<div class="row">
							<div class="col-md-6">
								<div class="aa-myaccount-login">
									<h4>Login</h4>
									<form action="" class="aa-login-form">
										<label for="">Username or Email address<span>*</span></label>
										<input type="text" placeholder="Username or email"> <label
											for="">Password<span>*</span></label> <input type="password"
											placeholder="Password">
										<button type="submit" class="aa-browse-btn">Login</button>
										<label class="rememberme" for="rememberme"><input
											type="checkbox" id="rememberme"> Remember me </label>
										<p class="aa-lost-password">
											<a href="#">Lost your password?</a>
										</p>
									</form>
								</div>
							</div>
							<div class="col-md-6">
								<div class="aa-myaccount-register">
									
									<%-- <c:choose>
										<c:when test="${message != "Registration Successful .."}">
      										<h3 style="color: green">${message}</h3>							 
										</c:when>
										<c:otherwise>
        									<h3 style="color: red">${message}</h3>
										</c:otherwise>
									</c:choose> --%>
									${message}

									<h4>Register</h4>
									<form action="${pageContext.request.contextPath}/user/register"
										method="POST" class="aa-login-form">
										<label for=""> Name<span>*</span></label> <input type="text"
											placeholder="sunny" name="userName"> <label for="">
											Mobile<span>*</span>
										</label> <input type="text" placeholder="+91-4512483529" name="mobile">
										<label for=""> Email address<span>*</span></label> <input
											type="text" placeholder="abc123@gmail.com" name="email">
										<label for="">Password<span>*</span></label> <input
											type="password" placeholder="Password"
											name="encrytedPassword">
										<button type="submit" class="aa-browse-btn">Register</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- / Cart view section -->

	<!-- footer -->
	<%-- <jsp:include page="includes/footer.jsp"/> --%>
	<%@include file="../../includes/footer.jsp"%>

</body>
</html>