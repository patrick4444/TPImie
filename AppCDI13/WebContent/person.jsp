<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:url var="url" value="/person" />

	<form method="post" action="${url}/save" >
		prenom : <input name="firstName" value="${data.firstName}" /><br/>
		nom: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="lastName"  value="${data.lastName}"  /><br/>
		<input name="id" value="${data.id}" type="hidden" />
		<input type="submit" value="${ empty data.id ? 'Insert' : 'Update' }" />
	</form>	
	</br>
	</br>
	</br>
	
	<!--<form action="person" method ="get">
		prenom : <input name="prenom" /><br/>
		nom :    <input name="nom" /><br/>
		         <input type="submit"><br/>
	</form>-->

	<!--<c:forEach var="person" items="${listPersons}">
		<c:out value='${person.firstName}'></c:out>
		<c:out value='${person.lastName}'></c:out>
		<br/>
	</c:forEach>-->
	<table>
	<tr>
		<td align="center">update</td>
		<td align="center">delete</td>
		<td align="center">id</td>
		<td>first name</td>
		<td>last name</td>
	</tr>
	<tr>
		<td align="center"><a href="${url}/">${ empty data.id ? '&#x2611;' : '&#x2610;' }</a></td>
		<td align="center"></td>
		<td align="center"><a href="${url}/">new</a></td>
	</tr>
	<c:forEach items="${list}" var="item" >
		<tr>
			<td align="center"><a href="${url}/select?id=${item.id}">${ item.id eq data.id ? '&#x2611;' : '&#x2610;' }</a></td>
			<td align="center"><a href="${url}/delete?id=${item.id}">&#x2612;</a></td>
			<td align="center"><a href="${url}/select?id=${item.id}">${item.id}</a></td>
			<td>${item.firstName}</td>
			<td>${item.lastName}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>