package app.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		
		String n=request.getParameter("username");
		String p=request.getParameter("password");
		
		if(p.equals("umang")) {
			out.println("You are successfully logedin "+n);
			
			Cookie ck=new Cookie("username",n);
			response.addCookie(ck);
			
			
		}else {
			out.println("Password is umang, please try again");
			request.getRequestDispatcher("login.html").include(request, response);
			
		}
		
	out.close();
		
		
		
	}

}
