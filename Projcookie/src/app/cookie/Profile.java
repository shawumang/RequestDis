package app.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Profile extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		Cookie[] ck=request.getCookies();
		if(ck!=null) {
			String n=ck[0].getValue();
		if(n!=null||!n.equals("")) {
			out.println("Welcome to the profile page");
			out.print("Hi "+n);
		}else {
			out.println("Please login first");
//			request.getRequestDispatcher("login.html").include(request, response);
			response.sendRedirect("login.html");
		}
		
		}
		
		
		
		
	}

}