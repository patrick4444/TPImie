package fr.imie.cours;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LivreServlet
 */
@WebServlet("/livre/*")
public class LivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
//    public LivreServlet() {
//        super();
//        
//    }
//
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		doGet(request, response);
//	}
private static final String VIEW = "/index.jsp";
	
	private void select(Livre data, HttpServletRequest request) {
		data = new LivreDAO().findOne(data);
		request.setAttribute("data", data);
	}
		
	private void save(Livre data) {
		if (data.getId_livre() == null) {
			new LivreDAO().insert(data);
		} else {
			new LivreDAO().update(data);
		}
	}
	
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//List<Livre> listPersons = new LivreDAO().findAll();
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
		request.setAttribute("list", new LivreDAO().findAll());
		request.getRequestDispatcher(VIEW).forward(request, response);
	}
    
    private void delete(Livre data) {
		new LivreDAO().delete(data);
	}
    
    private Livre data(HttpServletRequest request) {
		Livre person = new Livre();
		person.setNom_livre(request.getParameter("nom_livre"));
		person.setAuteur(request.getParameter("lastName")); 
		if (request.getParameter("id") != null && request.getParameter("id").isEmpty() == false) {
			person.setId(Integer.parseInt(request.getParameter("id")));
		}
		return person;
	}
}
