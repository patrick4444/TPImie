<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--lancer l'URL ci-dessous            -->
<!--http://localhost:8080/TPServlet1/-->
Hello patoche
	
<!--l'URL change             -->	
<!--http://localhost:8080/TPServlet1/hello?prenom=Pat&nom=doudou-->
<table>
	
	<c:forEach items="${ListePersonnes}" var="item" >
		<tr>
			<!-- <td align="center"><a href="${url}/select?id=${item.id}">${ item.id eq data.id ? '&#x2611;' : '&#x2610;' }</a></td>
			<td align="center"><a href="${url}/delete?id=${item.id}">&#x2612;</a></td>
			<td align="center"><a href="${url}/select?id=${item.id}">${item.id}</a></td>   -->
			<td>${item.id}</td>
			<td>${item.firstname}</td>
			<td>${item.lastname}</td>
		</tr>
	</c:forEach>
	
	<tr>
		<td>------------------</td>
	</tr>
	<tr>
		<td>${UnePersonneParNom.id}</td>
		<td>${UnePersonneParNom.firstname}</td>
		<td>${UnePersonneParNom.lastname}</td>
	</tr>
</table>	
</body>
</html>