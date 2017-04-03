<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

<c:url var="url" value="/livre" />

	<form method="post" action="${url}/save" >
		Titre : <input name="titre" value="${data.nom_livre}" /><br/>
		Auteur: &nbsp;&nbsp;<input name="Auteur"  value="${data.auteur}"  /><br/>
		<input name="id" value="${data.id}" type="hidden" />
		<input type="submit" value="${ empty data.id ? 'Insert' : 'Update' }" />
	</form>	
	</br>
	</br>
	</br>
	
	
	
	<table>
	<tr>
		<td align="center">update</td>
		<td align="center">delete</td>
		<td align="center">id_livre</td>
		<td>nom_livre</td>
		<td>auteur</td>
	</tr>
	<tr>
		<td align="center"><a href="${url}/">${ empty data.id ? '&#x2611;' : '&#x2610;' }</a></td>
		<td align="center"></td>
		<td align="center"><a href="${url}/">new</a></td>
	</tr>
	<c:forEach items="${list}" var="item" >
		<tr>
			<td align="center"><a href="${url}/select?id_livre=${item.id}">${ item.id eq data.id ? '&#x2611;' : '&#x2610;' }</a></td>
			<td align="center"><a href="${url}/delete?id_livre=${item.id}">&#x2612;</a></td>
			<td align="center"><a href="${url}/select?id_livre=${item.id}">${item.id}</a></td>
			<td>${item.nom_livre}</td>
			<td>${item.auteur}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>