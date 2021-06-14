package traitement;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.If;


@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int papier = 0;
	private static final int pierre = 1;
	private static final int ciseau = 2;
	
	
	/**
	 * méthode donnant le réultat d'un chifoumi
	 * @param le choix de l'user
	 * @return une String qui indique si égalité, échec ou victoire
	 */
	public String chifoumi (String choix) {
		 
		int nbalea =(int)(Math.random()*3);
		String resultat = "";
		if(choix.equals("papier")) {
			switch (nbalea) {
				// si papier
			case papier:
				resultat = "égalité";
				break;
				//si pierre
			case pierre:
				resultat = "Gagné";
				break;
				//si ciseau
			case ciseau:
				resultat = "Perdu";
			}
		}
		if (choix.equals("pierre")) {
			switch (nbalea) {
				// si papier
			case papier:
				resultat = "Perdu";
				break;
				//si pierre
			case pierre:
				resultat = "égalité";
				break;
				//si ciseau
			case ciseau:
				resultat = "Gagné";
			}
		}
		if (choix.equals("ciseau")) {
			switch (nbalea) {
				// si papier
			case papier:
				resultat = "Gagné";
				break;
				//si pierre
			case pierre:
				resultat = "Perdu";
				break;
				//si ciseau
			case ciseau:
				resultat = "égalité";
			}
		}
		return resultat;
	 }
	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/tentative.jsp");
		rd.forward(request, response);
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recupération du choix de l'user
		String choix = request.getParameter("choix");
		System.out.println(choix);
		//donne le résultat
		String resultat = chifoumi(choix);
		//mise dans un attribut 
		request.setAttribute("result", resultat);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/resultat.jsp");
		rd.forward(request, response);
		}
		 
		 
		
		//request.setAttribute(name, o);
		//RequestDispatcher rDispatcher = 
	}


