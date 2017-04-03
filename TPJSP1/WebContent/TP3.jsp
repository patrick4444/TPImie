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
Date du jour : 
	<%	String format = "dd/MM/yy H:mm:ss";
		SimpleDateFormat formater = new SimpleDateFormat(format);
	  	Date date = new Date(); %>
	<%=formater.format(date)%>
	
	<br/> 
	<!--  method ="post" enleve les réponses dans l'URL 
	<form action="saison" method ="post">-->
		

	</form>
<!--l'URL change             -->	
<!--http://localhost:8080/TutoJEECDI13/hello?prenom=Pat&nom=doudou-->
	
</body>
</html>