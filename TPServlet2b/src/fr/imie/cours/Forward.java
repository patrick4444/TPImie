package fr.imie.cours;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forward")
public class Forward extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<p>avant forward</p>");
		request.setAttribute("prenom", "tony");
		request.setAttribute("nom", "parker");
		request.getRequestDispatcher("/servletb").forward(request, response);
		out.println("<p>après forward</p>");
		
		// affiche uniquement les out de B mais conserve tout de même les valeurs initialisées Ici (tony PARKER)
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
