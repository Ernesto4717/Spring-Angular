<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<div class="text-center">
	<div class="jumbotron ">
		<h1>Winter Academy</h1>
		<p class="lead"></p>
		<p>
			<a class="btn btn-lg btn-success" href="http://www.softtek.com/es/"
				role="button">Softtek &raquo;</a>
		</p>
	</div>

</div>



<div class="container-center text-center">
	<div class="container marketing">

	
		<div class="row">
			<div class="col-lg-6">
				<img class="img-circle"
					src="<c:url value="/resources/images/user.png"/>" alt="User"
					width="140" height="140">
				<h2>User</h2>
				<p></p>
				<p>
					<a class="btn btn-default" href="#" role="button">in maintenance	
						&raquo;</a>
				</p>
			</div>
		
			<div class="col-lg-6">
				<img class="img-circle"
					src="<c:url value="/resources/images/cart.png"/>" alt="Cart"
					width="140" height="140">
				<h2>Cart</h2>
				<p></p>
				<p>
					<a class="btn btn-default" href="#" role="button" >in maintenance
						&raquo;</a>
				</p>
			</div>
		
		</div>
	</div>
</div>