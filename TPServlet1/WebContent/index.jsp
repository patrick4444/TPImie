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
	<%=System.getProperty("user.name")%><br/>
	<!--  method ="post" enleve les réponses dans l'URL -->
	<form action="hello" method ="post">
		prenom : <input name="prenom" /><br/>
		nom :    <input name="nom" /><br/>
		         <input type="submit"><br/>
	</form>
<!--l'URL change             -->	
<!--http://localhost:8080/TPServlet1/hello?prenom=Pat&nom=doudou-->
	
</body>
</html>