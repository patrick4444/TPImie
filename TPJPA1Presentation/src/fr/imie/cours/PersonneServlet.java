package fr.imie.cours;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Personne;
import servicesCRUD.PersonneService;

/**
 * Servlet implementation class PersonneServlet
 */
@WebServlet("/personne")
public class PersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @EJB
    private PersonneService ps;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public PersonneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//INSERTION //
		//ps.insertPersonne("Yohan","LANDRY2");
		
		//Update //
		//Personne personne1 = ps.findPersonneByName("DROUIN");
		//personne1.setFirstname("Tata");
		//ps.updatePersonne(personne1);
		
		//Delete
//		Personne personne2 = ps.findPersonneById(22);
//		ps.deletePersonne(personne2);
	// OU	
//		Personne personne2 = new Personne();
//		personne2.setId(20);
///		ps.deletePersonne(personne2);
		
		List<Personne> list = ps.findAll();
		request.setAttribute("ListePersonnes", list);
		//request.getRequestDispatcher("/WEB-INF/Index.jsp").forward(request, response);
		
		Personne personne = ps.findPersonneByName("STENDHAL");
		request.setAttribute("UnePersonneParNom", personne);
		request.getRequestDispatcher("/WEB-INF/Index.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
