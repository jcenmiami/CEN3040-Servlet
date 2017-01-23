package com.ezitaps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HW02Servlet
 */
@WebServlet("/HW02Servlet")
public class HW02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HW02Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>");
		out.println("Ounces Result from Pounds");
		out.println("</title></head><body>");
		
		try {
			String poundsString = request.getParameter("pounds");
			if ((poundsString != null) && (poundsString.length() > 0)){
				double pounds = Double.parseDouble(poundsString);
				double ounces = pounds * 16;
				out.println("<h3><p>The result is:</p></h3>");
				out.println(pounds + " pounds are " + ounces + " ounces.");
			} else {
				out.println("<p>Enter a Value to convert from Pounds to Ounces.</p>");
				out.println("<form action=\"HW02Servlet\" method=\"get\">");
				out.println("<p><label>Pounds:</label>");
				out.println("<input type=\"text\" name=\"pounds\" /></p>");
				out.println("<p><input type=\"submit\" value=\"Submit\" />");
				out.println("<input type=\"reset\" value=\"Reset\" /></p>");
				out.println("</form>");
				//out.println();
				//out.println();
			}
		}
		

		
		finally {
			out.println("</body></html>");
			out.close();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
