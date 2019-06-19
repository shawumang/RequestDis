package form.hidden;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenData extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	 throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("hiddename");
		out.println("Welcome "+n);
		out.close();
    }

}
