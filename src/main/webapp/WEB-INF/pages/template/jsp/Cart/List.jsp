
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

				<tr data-ng-repeat="cart in cartList">
					<td><a data-ng-href="/Cart/edit?cartId={{cart.id.id}}&status=">{{cart.id.id}}</a></td>

					<td data-ng-bind="cart.cartDetails.linesAmount | currency"></td>
					<td data-ng-bind="cart.cartDetails.shippingAmount"></td>
					<td data-ng-bind="cart.cartDetails.cartAmount | currency"></td>
					<td data-ng-bind="cart.cartDetails.shipTo.name"></td>
					<td data-ng-bind="cart.cartDetails.status.description"></td>
					<td data-ng-bind="cart.audit.createDate  | date:'medium'"></td>
					<td data-ng-bind="cart.audit.updateDate | date:'medium'"></td>
					<td data-ng-show="cart.cartDetails.status.id != 1300">Delete</td>
				</tr>

			</tbody>
		</table>
	</div>
</div>