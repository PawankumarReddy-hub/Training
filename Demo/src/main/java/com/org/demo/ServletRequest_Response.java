package com.org.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequest_Response
 */
@WebServlet("/ServletRequest_Response")
public class ServletRequest_Response extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out=response.getWriter();
		try
		{
			String user1=request.getParameter("user");
			out.println("<h2> Welcome "+ user1 +"</h2>");
		}
		finally
		{
			out.close();
		}
	}
	

}
