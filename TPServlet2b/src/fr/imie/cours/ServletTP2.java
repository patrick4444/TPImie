package fr.imie.cours;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlettp2")
public class ServletTP2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		response.setContentType("text/html");
		
		Integer nbVisite = (Integer) session.getAttribute("nbVisite");
		if (nbVisite == null) {
			nbVisite = 1;
		} else {
			nbVisite++;
		}
		session.setAttribute("nbVisite", nbVisite);
			
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String format = "dd/MM/yy H:mm:ss";
		SimpleDateFormat formaterCreationTime = new SimpleDateFormat(format);
	  			
		response.getWriter().append("Session: ").append(session.getId() + "<br>");
		response.getWriter().append("Date de Création: ").append(formaterCreationTime.format(session.getCreationTime()) + "<br>");
		
		SimpleDateFormat formaterLAT = new SimpleDateFormat(format);
		
		response.getWriter().append("Date dernier accès: ").append(formaterLAT.format(session.getLastAccessedTime()) + "<br>");
		response.getWriter().append("Nombre de visites: ").append(nbVisite + "<br>");

		/*
		 * id Date de création Date du dernier accès ID de l'utilisateur Nombre
		 * de visites
		 */

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
