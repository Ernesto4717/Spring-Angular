
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


 
<ol class="breadcrumb">
  <li><a href="<c:url value="/User/home"/>">Home</a></li>
  <li><a href="<c:url value="/User/List"/>">List</a></li>
  <li class="active">Bootstrap 3</li>
</ol>
 

	<div class="container-center ">
		<form:form method="post" action="/jpaproject/User/update"
			modelAttribute="user" class="form-horizontal">
	
			<div class="form-group">
				<div class="col-sm-4">
					<label for="Username" class="sr-only">Username</label> <input type="text"
						class="form-control input-group-lg reg_name" name="username"
						value="${map.users.username}" readonly="readonly">
				</div>
				<div class="col-sm-4">
					<label for="password" class="sr-only"></label> <input
						type="password" class="form-control input-group-lg"
						name="password"
						placeholder="Password:*">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-8">
					<label for="name" class="sr-only">Name:*</label> <input type="text"
						class="form-control input-group-lg reg_name" name="name"
						value="${map.users.name}" >
				</div>
			</div>
	
	
	
			<div class="form-group">
				<div class="col-sm-8">
					<label for="Status" class="sr-only">Status:*</label> <select name="Status"
						class="form-control">
						<option value="0">- Select -</option>
						<c:forEach var="listStatus" items="${map.listStatus}">
							<option value="${listStatus}"
								<c:if test="${listStatus eq map.users.status}">selected</c:if>>${listStatus}</option>
						</c:forEach>
					</select>
				</div>
	
			</div>
			<div class="form-group">
				<div class="col-sm-8">
					<label for="userRole" class="sr-only">Name:*</label> <select
						name="userRole" class="form-control">
						<option value="0">- Select -</option>
						<c:forEach var="role" items="${map.userRole}">
							<option value="${role.user_roleid}"
								<c:if test="${role.description eq map.users.role.description}">selected</c:if>>${role.description}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6 container-button">
					<input type="submit" name="update" value="Update"
						class="btn btn-info">
				</div>
	
			</div>
	
		
		  </form:form>
	
	
	</div>
	
	
	
	
