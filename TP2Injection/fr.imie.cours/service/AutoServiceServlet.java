package service;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.cours.tp.AutoService;

/**
 * Servlet implementation class AutoServiceServlet
 */
@WebServlet("/test")
public class AutoServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    @Inject
    @Named("mercedesAutoService")
	private AutoService mercedesAutoService;

    @Inject
    @Named("fiatAutoService")
	private AutoService fiatAutoService;
    
    @Inject
    @Named("hondaAutoService")
	private AutoService hondaAutoService;

    public void callAutoService(){
    	mercedesAutoService.getService();
    	fiatAutoService.getService();
    	hondaAutoService.getService();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		callAutoService();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
