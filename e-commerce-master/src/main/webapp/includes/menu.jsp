	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
	
	<!-- wpf loader Two -->
	<div id="wpf-loader-two">
		<div class="wpf-loader-two-inner">
			<span>Loading</span>
		</div>
	</div>
	<!-- / wpf loader Two -->
	<!-- SCROLL TOP BUTTON -->
	<a class="scrollToTop" href="#"><i class="fa fa-chevron-up"></i></a>
	<!-- END SCROLL TOP BUTTON -->


	<!-- Start header section -->
	<header id="aa-header">
		<!-- start header top  -->
		<div class="aa-header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-header-top-area">
							<!-- start header top left -->
							<div class="aa-header-top-left">

								<!-- start cellphone -->
								<div class="cellphone hidden-xs">
									<p>
										<span class="fa fa-phone"></span>00-62-658-658
									</p>
								</div>
								<!-- / cellphone -->
							</div>
							<!-- / header top left -->
							<div class="aa-header-top-right">
								<ul class="aa-head-top-nav-right">
									<li><a href="${pageContext.request.contextPath}/user/registerpage">Register</a></li>
									<li class="hidden-xs"><a href="cart.jsp">My Cart</a></li>
									<li class="hidden-xs"><a href="checkout.jsp">Checkout</a></li>
									<li><a href="" data-toggle="modal"
										data-target="#login-modal">Sign in</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- / header top  -->

		<!-- start header bottom  -->
		<div class="aa-header-bottom">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-header-bottom-area">
							<!-- logo  -->
							<div class="aa-logo">
								<!-- Text based logo -->
								<a href="${pageContext.request.contextPath}"> <span class="fa fa-shopping-cart"></span>
									<p>
										daily<strong>Shop</strong> <span>Your Shopping Partner</span>
									</p>
								</a>
							</div>
							<!-- / logo  -->
							<!-- cart box -->
							<div class="aa-cartbox">
								<a class="aa-cart-link"
									href="${pageContext.request.contextPath}/myaccount"> <span
									class="fa fa-shopping-basket"></span> <span
									class="aa-cart-title">SHOPPING CART</span> <span
									class="aa-cart-notify">2</span>
								</a>



							</div>
							<!-- / cart box -->
							<!-- he box -->
							<div class="aa-search-box">
                <form action="">
<div>
                  <div class="panel-body">
					<div class="row cc-margin-bottom">
                  <div class="col-md-6 col-sm-12">
							<div class="form-select">
								<select name="bookAuthor" class="form-control select2">
									<option value="%">Categories</option>
								</select>
							</div>
						</div>
                  <div class="col-md-6 col-sm-12">
                  
                  <input type="text" name="" id="" placeholder="Search here ex. 'man' ">
                  </div></div>
                  </div></div>
                  <button type="submit"><span class="fa fa-search"></span></button>
                </form>
              </div>	
							<!-- / search box -->
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- / header bottom  -->
	</header>
	<!-- / header section -->
	<!-- menu -->
	<section id="menu">
		<div class="container">
			<div class="menu-area">
				<!-- Navbar -->
				<div class="navbar navbar-default" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
					</div>
					<div class="navbar-collapse collapse">
						<!-- Left nav -->
						<ul class="nav navbar-nav">
							<li><a href="${pageContext.request.contextPath}">Home</a></li>
							<li><a href="#">Men <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Casual</a></li>
									<li><a href="#">Sports</a></li>
									<li><a href="#">Formal</a></li>
									<li><a href="#">Standard</a></li>
									<li><a href="#">T-Shirts</a></li>
									<li><a href="#">Shirts</a></li>
									<li><a href="#">Jeans</a></li>
									<li><a href="#">Trousers</a></li>
									<li><a href="#">And more.. <span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="#">Sleep Wear</a></li>
											<li><a href="#">Sandals</a></li>
											<li><a href="#">Loafers</a></li>
										</ul></li>
								</ul></li>
							<li><a href="#">Women <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Kurta & Kurti</a></li>
									<li><a href="#">Trousers</a></li>
									<li><a href="#">Casual</a></li>
									<li><a href="#">Sports</a></li>
									<li><a href="#">Formal</a></li>
									<li><a href="#">Sarees</a></li>
									<li><a href="#">Shoes</a></li>
									<li><a href="#">And more.. <span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="#">Sleep Wear</a></li>
											<li><a href="#">Sandals</a></li>
											<li><a href="#">Loafers</a></li>
											<li><a href="#">And more.. <span class="caret"></span></a>
												<ul class="dropdown-menu">
													<li><a href="#">Rings</a></li>
													<li><a href="#">Earrings</a></li>
													<li><a href="#">Jewellery Sets</a></li>
													<li><a href="#">Lockets</a></li>
													<li class="disabled"><a class="disabled" href="#">Disabled
															item</a></li>
													<li><a href="#">Jeans</a></li>
													<li><a href="#">Polo T-Shirts</a></li>
													<li><a href="#">SKirts</a></li>
													<li><a href="#">Jackets</a></li>
													<li><a href="#">Tops</a></li>
													<li><a href="#">Make Up</a></li>
													<li><a href="#">Hair Care</a></li>
													<li><a href="#">Perfumes</a></li>
													<li><a href="#">Skin Care</a></li>
													<li><a href="#">Hand Bags</a></li>
													<li><a href="#">Single Bags</a></li>
													<li><a href="#">Travel Bags</a></li>
													<li><a href="#">Wallets & Belts</a></li>
													<li><a href="#">Sunglases</a></li>
													<li><a href="#">Nail</a></li>
												</ul></li>
										</ul></li>
								</ul></li>
							<li><a href="#">Kids <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Casual</a></li>
									<li><a href="#">Sports</a></li>
									<li><a href="#">Formal</a></li>
									<li><a href="#">Standard</a></li>
									<li><a href="#">T-Shirts</a></li>
									<li><a href="#">Shirts</a></li>
									<li><a href="#">Jeans</a></li>
									<li><a href="#">Trousers</a></li>
									<li><a href="#">And more.. <span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="#">Sleep Wear</a></li>
											<li><a href="#">Sandals</a></li>
											<li><a href="#">Loafers</a></li>
										</ul></li>
								</ul></li>
							<li><a href="#">Sports</a></li>
							<li><a href="#">Digital <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Camera</a></li>
									<li><a href="#">Mobile</a></li>
									<li><a href="#">Tablet</a></li>
									<li><a href="#">Laptop</a></li>
									<li><a href="#">Accesories</a></li>
								</ul></li>
							<li><a href="#">Furniture</a></li>
							<li><a href="blog-archive.jsp">Blog <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="blog-archive.jsp">Blog Style 1</a></li>
									<li><a href="blog-archive-2.jsp">Blog Style 2</a></li>
									<li><a href="blog-single.jsp">Blog Single</a></li>
								</ul></li>
							<li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
							<li><a href="#">Pages <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="product.jsp">Shop Page</a></li>
									<li><a href="product-detail.jsp">Shop Single</a></li>
									<li><a href="404.jsp">404 Page</a></li>
								</ul></li>
						</ul>
					</div>
					<!--/.nav-collapse -->
				</div>
			</div>
		</div>
	</section>
	<!-- / menu -->