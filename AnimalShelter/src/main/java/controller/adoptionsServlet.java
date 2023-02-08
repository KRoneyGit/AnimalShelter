package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AdoptionModel;

/**
 * Servlet implementation class adoptionsServlet
 */
@WebServlet("/adoptionsServlet")
public class adoptionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adoptionsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("petName");
		String species = request.getParameter("petSpecies");
		String supplies = request.getParameter("supplies");
		
		AdoptionModel pet = new AdoptionModel(name,species,supplies);
		
		request.setAttribute("pet", pet);
		getServletContext().getRequestDispatcher("/adoptionResult.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(pet.toString());
//		writer.close();
	}

}
