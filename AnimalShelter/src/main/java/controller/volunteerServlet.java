package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VolunteerModel;

/**
 * Servlet implementation class volunteerServlet
 */
@WebServlet("/volunteerServlet")
public class volunteerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public volunteerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("volunteerName");
		double totalHours = Double.parseDouble(request.getParameter("totalHours"));
		String days = request.getParameter("volunteerDays");
		
		VolunteerModel volunteer = new VolunteerModel(name,totalHours,days);
		
		request.setAttribute("volunteer", volunteer);
		getServletContext().getRequestDispatcher("/volunteerResult.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(volunteer.toString());
//		writer.close();
	}

}
