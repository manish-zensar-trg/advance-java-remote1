package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

// This is a demo servlet
public class HelloController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("userName");
		String city = request.getParameter("city");
		System.out.println("Name:"+name);
		System.out.println("city:"+city);
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		request.setAttribute("name", name);
		request.setAttribute("city", city);
		
		try {
		rd.forward(request, response);
		}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
		}
	}
	
}
