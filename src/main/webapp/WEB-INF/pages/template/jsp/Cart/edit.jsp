
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<ol class="breadcrumb">
  <li><a href="<c:url value="/Cart/home"/>">Home</a></li>
  <li><a href="<c:url value="/Cart/List"/>">List</a></li>
  <li class="active">Bootstrap 3</li>
</ol>
 

<div>
<div class="container-center ">



		<form name="registration_form" id="registration_form" method="post" action="/jpaproject/Cart/update" 
			class="form-horizontal">
			<div class="form-group">
				<div class="col-sm-4">
					<label for="Id" class="sr-only">id</label> 
							<input type="text"class="form-control input-group-lg reg_name"  name="id" value="${map.cart.id.id}" readonly="readonly">
				</div>
				
				<div class="col-sm-4">
					<label for="cartAmount" class="sr-only"></label>
						<input type="text" class="form-control input-group-lg" name="cartAmount" value="${map.cart.cartDetails.cartAmount}">
				</div>


			</div>

			<div class="form-group">
				<div class="col-sm-4">
					<label for="linesAmount" class="sr-only"></label> 
						<input type="text" class="form-control form-control-danger input-group-lg "name="linesAmount" value="0">
						
				</div>

				<div class="col-sm-4">
					<label for="Shipping Amount" class="sr-only"></label>
						<input type="text"class="form-control input-group-lg" name="shippingAmount" value="${map.cart.cartDetails.shippingAmount}">

				</div>

			</div>

			<div class="form-group">
				<div class="col-sm-8">
					<label for="statusId" class="sr-only"></label> <select
						name="statusId" class="form-control">
						<option value="0">- Select -</option>
						<c:forEach var="status" items="${map.cartStatus}">
							<option value="${status.id}"
								<c:if test="${status.id==map.cart.cartDetails.status.id}">selected</c:if>>${status.description}</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-8">
					<label for="shipToId" class="sr-only"></label> <select
						name="shipToId" class="form-control">
						<option value="0">- Select -</option>
						<c:forEach var="shipTo" items="${map.shipTos}">
							<option value="${shipTo.id}"
								<c:if test="${shipTo.id==map.cart.cartDetails.shipTo.id}">selected</c:if>>${shipTo.name}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<!--/form-group-->

			<div class="form-group"></div>

			<div class="form-group">
				<div class="col-sm-4">
					<label for="createDate" class="sr-only"></label> <input
						id="createDate" class="form-control input-group-lg" type="text"
						name="createDate" title="createDate"
						value="${map.cart.audit.createDate}" readonly="readonly">
				</div>
				<div class="col-sm-4">
					<label for="updateDate" class="sr-only"></label> <input
						id="updateDate" 
						class="form-control input-group-lg" type="text"
						name="updateDate" title="updateDate"
						value="${map.cart.audit.updateDate}" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6 container-button">
					<input type="submit" name="update" value="Update" class="btn btn-info"> 
				</div>
				
			</div>
		</form>

	</div>
	</div>
