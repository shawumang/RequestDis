package form.hidden;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hidden extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	 throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("name");
		out.println("Welcome "+n);
		
		out.print("<form action='def'>");
		out.println("<input type='hidden' name='hiddename' value='"+n+"'>");
		out.println("<input type='submit' value='send'/>");
		
		out.close();
		}
}


