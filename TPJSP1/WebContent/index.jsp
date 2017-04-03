<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--lancer l'URL ci-dessous            -->
<!--http://localhost:8080/TP2bisSaisons/-->
Hello patoche, choisir une saison :<br/>
1- Hiver<br/>
2- Printemps<br/>
3- Eté<br/>
4- Automne<br/>
	<!-- <%=System.getProperty("user.name")%><br/> -->
	<!--  method ="post" enleve les réponses dans l'URL -->
	<form action="saison" method ="post">
		saison sélectionnée : 
		
		<!-- <input name="choixsaison" /><br/>
			         <input type="submit"><br/>
		 -->
			         <select name="choixsaison">
			         	<option value="hiver">Hiver</option>
			         	<option value="printemps">Printemps</option>
			         	<option value="ete">Eté</option>
			         	<option value="automne">Automne</option>
			         </select>
			         <input type="submit" /><br/>
	</form>
<!--l'URL change             -->	
<!--http://localhost:8080/TutoJEECDI13/hello?prenom=Pat&nom=doudou-->
	
</body>
</html>