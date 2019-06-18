package dispatcher.req;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Log1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	String n=request.getParameter("username");
	String p=request.getParameter("password");
	
	if(p.equals("umang")) {
	 RequestDispatcher rd=request.getRequestDispatcher("servlet2");
	 rd.include(request, response);
	}else {
		pw.println("The password is umang");

		 RequestDispatcher rd=request.getRequestDispatcher("/Index.html");
		 rd.include(request, response);
		
	 
	}
		
	}

}
