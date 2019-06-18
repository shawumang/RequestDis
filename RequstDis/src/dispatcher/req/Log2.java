package dispatcher.req;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Log2 extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	String n=request.getParameter("username");
	pw.println("Welcome " + n);
	}

}