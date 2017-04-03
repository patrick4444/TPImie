<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--lancer l'URL ci-dessous            -->
<!--http://localhost:8080/TP2bisSaisons/-->
Tableau : 
	<table>
	<tr>
       <th>Nombre</th>
       <th>Valeur</th>
    </tr>
    <%for (int i=0 ; i<10; i++) {%>
    <tr>
       <td>Nombre</td>
       <td><%=i%></td>
    </tr><%}%>
 </table>
	
	<br/> 
	<!--  method ="post" enleve les réponses dans l'URL 
	<form action="saison" method ="post">-->
</body>		