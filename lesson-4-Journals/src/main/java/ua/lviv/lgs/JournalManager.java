package ua.lviv.lgs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JournalManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JournalRegister listOfJournals = new JournalRegister();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Journals> list=listOfJournals.getListOfJournals();
		request.setAttribute("journal", list);
		request.getRequestDispatcher("cabinet.jsp").forward(request, response);
	}

}
