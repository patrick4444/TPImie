package fr.imie.cours;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaisonServlet
 */
@WebServlet("/saison")
public class SaisonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaisonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//if (value.equals("1")) request.getRequestDispatcher("/hiver.html").forward(request, response);
		
		//for (Integer i=0 ; i<10; i++) {	System.out.println(i);};
		
		
		
		//choix de la saison
		// permet de récupérer la saison
		
		String value = request.getParameter("choixsaison");
				
			// affiche le résultat dans une nouvelle page
			switch (value) {
			case "hiver":request.getRequestDispatcher("hiver.html").forward(request, response);
				break;
			case "printemps":request.getRequestDispatcher("printemps.html").forward(request, response);
				break;
			case "ete":request.getRequestDispatcher("ete.html").forward(request, response);
				break;
			default:request.getRequestDispatcher("automne.html").forward(request, response);
				break;
			}
			
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
