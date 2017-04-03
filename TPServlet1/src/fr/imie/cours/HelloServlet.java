package fr.imie.cours;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		
		// tp2 du TPServlet1.pdf
		response.setContentType("text/html");
		response.getWriter()
				.append("Protocole: ").append(request.getProtocol() + "<br>").append("Adresse IP du client: ")
				.append(request.getRemoteAddr() + "<br>").append("Hôte: ").append(request.getRemoteHost() + "<br>")
				.append("User: ").append(request.getRemoteUser() + "<br>").append("Port: ")
				.append(request.getRemotePort() + "<br>").append("Adr: ").append(request.getLocalAddr() + "<br>")
				.append(request.getLocalPort() + "<br>").append("Name: ").append(request.getLocalName() + "<br>")
				.append("Scheme: ").append(request.getScheme() + "<br>")
				// modifier l'URL:	// http://localhost:8080/TutoJEECDI13/hello?prenom=tony&nom=parker
				//.append("prenom:" + request.getParameter("prenom") + "<br>")
				//.append("nom:" + request.getParameter("nom") + "<br>");
				;
		
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getParameter(name);
			response.getWriter().append(name + " : " + value + "<br/>");
		}
			
	

		// .append("­Schema: ").request.getRemotePort());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
