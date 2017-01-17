
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div data-ng-controller="cartController">
<ol class="breadcrumb">
  <li><a href="<c:url value="/Cart/home"/>">Home</a></li>
  <li class="active">User List</li>
</ol>

	
<div class="table-responsive">
	
	<table class="table">
	 <thead class="thead-inverse">
		<tr>
			<th width="5%">Cart Id</th>
			<th width="10%">Lines Amount</th>
			<th width="10%">Shipping Amount</th>
			<th width="10%">Cart Amount</th>
			<th width="17%">Ship To</th>
			<th width="7%">Status</th>
			<th width="15%">Created Date</th>
			<th width="15%">Modified Date</th>
			<th width="11%">Delete</th>
		</tr>
		
		</thead>
		<tbody>
		<c:forEach var="cart" items="${carts}">
			<tr>							
				<td><a href="<c:url value="/Cart/edit?cartId=${cart.id.id}&status="/>"><fmt:formatNumber pattern="000" value="${cart.id.id}"/></a></td>
				
				<td><fmt:formatNumber pattern="$ #,##0.00" value="${cart.cartDetails.linesAmount}" /></td>
				<td><fmt:formatNumber pattern="$ #,##0.00" value="${cart.cartDetails.shippingAmount}" /></td>
				<td><fmt:formatNumber pattern="$ #,##0.00" value="${cart.cartDetails.cartAmount}" /></td>
				<td>${cart.cartDetails.shipTo.name}</td>
				<td>${cart.cartDetails.status.description}</td>
				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${cart.audit.createDate}" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${cart.audit.updateDate}" /></td>
				<td><c:if test="${cart.cartDetails.status.id != 1300}">Delete</c:if></td>
			</tr>
			<!--
			<tr data-ng-repeat="cart in ${carts}>							
				<td><a href="<c:url value="/Cart/edit?cartId=${cart.id.id}&status="/>"><fmt:formatNumber pattern="000" value="${cart.id.id}"/></a></td>
				
				<td data-ng-bind></td>
				<td><fmt:formatNumber pattern="$ #,##0.00" value="${cart.cartDetails.shippingAmount}" /></td>
				<td><fmt:formatNumber pattern="$ #,##0.00" value="${cart.cartDetails.cartAmount}" /></td>
				<td>${cart.cartDetails.shipTo.name}</td>
				<td>${cart.cartDetails.status.description}</td>
				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${cart.audit.createDate}" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${cart.audit.updateDate}" /></td>
				<td><c:if test="${cart.cartDetails.status.id != 1300}">Delete</c:if></td>
			</tr>
			-->
		</c:forEach>
		</tbody>
	</table>
	</div>
</div>