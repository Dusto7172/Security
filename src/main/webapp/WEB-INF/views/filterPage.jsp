<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Host Management System-> Filter Management</h1>

<form name='Save' action="<c:url value='/save.jsp' />" method='POST'>
</form>
<!-- <select class="form-select" aria-label="Default select example">
	<option selected>Open this to select filter</option>
	<option value="1">Team</option>
	<option value="2">Application</option>
	<option value="3">Environment</option>
	<option value="4">IsActive</option>
</select> -->


<select class="form-select" aria-label="Default select example">
	<option selected>Environment</option>
	<option value="1">Development</option>
	<option value="2">SIT</option>
	<option value="3">UAT</option>
	<option value="4">PROD</option>
</select>

<select class="form-select" aria-label="Default select example">
	<option selected>Team</option>
	<option value="1">Team A</option>
	<option value="2">Team B</option>
	<option value="3">Team C</option>
	<option value="4">Team D</option>
</select>

<select class="form-select" aria-label="Default select example">
	<option selected>Operating System</option>
	<option value="1">Windows</option>
	<option value="2">Mac</option>
	<option value="3">Android</option>
	<option value="4">Linux</option>
</select>

<select class="form-select" aria-label="Default select example">
	<option selected>Departments</option>
	<option value="1">HR</option>
	<option value="2">IT</option>
	<option value="3">Account & Finance</option>
	<option value="4">R&D</option>
	<option value="5">Production</option>
</select>

<select class="form-select" aria-label="Default select example">
	<option selected>Client</option>
	<option value="1">Credit Suisse</option>
	<option value="2">Bloomberg Media</option>
	<option value="3">Dow Jones</option>
	<option value="4">Siemens</option>
	<option value="5">Deutsche Bank</option>
</select>

<select class="form-select" aria-label="Default select example">
	<option selected>Status</option>
	<option value="1">Active</option>
	<option value="2">Expired</option>
</select>
<tr>

</tr>
<c:url value="/logout" var="logoutUrl" />
<form id="logout" action="${logoutUrl}" method="post">
	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />


<td colspan="2"><input type="submit" value="Submit" /></td>

<c:if test="${pageContext.request.userPrincipal.name != null}">
	<a href="javascript:document.getElementById('logout').submit()">Logout</a>
</c:if>