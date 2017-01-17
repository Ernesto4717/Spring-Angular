<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div data-ng-controller="homeController">
<nav class="navbar navbar-inverse ">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Academy</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="<c:url value="/User/home"/>" >Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">List<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="<c:url value="/Cart/List"/>">Cart</a></li>
          <li><a  href="<c:url value="/User/List"/>">User</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
</div>
  
