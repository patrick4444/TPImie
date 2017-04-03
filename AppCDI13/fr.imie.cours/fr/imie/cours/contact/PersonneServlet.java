package fr.imie.cours.contact;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.cours.contact.model.Personne;
import fr.imie.cours.contact.persistence.Factory;

/**
 * Servlet implementation class PersonneServlet
 */
@WebServlet("/person/*")
public class PersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String VIEW = "/person.jsp";
	
	private void select(Personne data, HttpServletRequest request) {
		data = Factory.getInstance().getPersonDAO().findOne(data);
		
//		data = new PersonDaoJDBC().findOne(data);
		request.setAttribute("data", data);
	}
		
	private void save(Personne data) {
		if (data.getId() == null) {
			Factory.getInstance().getPersonDAO().insert(data);
//			new PersonneDAO().insert(data);
		} else {
			Factory.getInstance().getPersonDAO().update(data);
//			new PersonneDAO().update(data);
		}
	}
	
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//List<Personne> listPersons = new PersonneDAO().findAll();
		//request.setAttribute("listPersons", listPersons);
		//request.getRequestDispatcher("/person.jsp").forward(request, response);
	//}

    //protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	doGet(request, response);
	//}
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		if (path == null) {
		} else if (path.matches("/save.*")) {
			save(data(request));
		} else if (path.matches("/delete.*")) {
			delete(data(request));
		} else if (path.matches("/select.*")) {
			select(data(request), request);
		}
		request.setAttribute("list", Factory.getInstance().getPersonDAO().findAll());
		request.getRequestDispatcher(VIEW).forward(request, response);
	}
    
    private void delete(Personne data) {
//		new PersonneDAO().delete(data);
    	Factory.getInstance().getPersonDAO().delete(data);
	}
    
    private Personne data(HttpServletRequest request) {
		Personne person = new Personne();
    	person.setFirstName(request.getParameter("firstName"));
		person.setLastName(request.getParameter("lastName"));
		if (request.getParameter("id") != null && request.getParameter("id").isEmpty() == false) {
			person.setId(Integer.parseInt(request.getParameter("id")));
		}
		return person;
	}

}
