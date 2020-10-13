package handleliste;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class handleliste
 */

public class handleliste extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public handleliste() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @return 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private String content(ArrayList<String> hll) {
		for (String e : hll) {
			return "out.println(" + "<li>" + e + "</li><br>" + ");";
		}
		return "";
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hardcodedPass = getServletConfig().getInitParameter("hardcodedPassword");
		String inputPass = request.getParameter("password");
		ArrayList<String> handlelisteItems = new ArrayList<String>();
		System.out.println(handlelisteItems);
		String Item = request.getParameter("Item");
		handlelisteItems.add(Item);

	
				
		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='ISO-8859-1'>");
		out.println("<link rel='stylesheet' href='style.css'>");
		out.println("<title>Kvittering</title>");
		out.println("</head>");
		out.println("<body>");
		
		//if(inputPass.equals(hardcodedPass)) {
		if(true) {

		out.println("<h1>Handleliste</h1>");
		out.println("<form action='handleliste' method='POST'>");
		out.println("<input type='text' id='Item' name='Item'");
		out.println("<input type='submit' value='submit'>");
		out.println("<ul>");
		content(handlelisteItems); //Get items
		out.println("</ul>");
		out.println("</form>");
		
		} else {
		out.println("<p>Passordet du skrev inn, var feil</p>");
		out.println("<label for='password'>Passord</label>");
		out.println("<form action='handleliste' method='POST'>");
		out.println("<input type='password' id='password' name='password'>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");

	}
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		doGet(request, response);

		
}
}
