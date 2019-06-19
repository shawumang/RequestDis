package brainsjava;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Passingpar extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String u=request.getParameter("username");
		String f=request.getParameter("fullname");
//		out.print("hello "+u+" your fullname is "+f);
//		String p=request.getParameter("profession");
//		out.println("You are a "+p);
//		
//		String loc[]=request.getParameterValues("location");
//		out.println("You Are at "+loc.length+" places");
//		for(int i=0;i<loc.length;i++) {
//		out.println(loc[i]);
		
		ServletContext context=request.getServletContext();
		HttpSession session=request.getSession();
		if(u!=null && u!="") {
			session.setAttribute("sun",u);
			context.setAttribute("sun",u);
		}
		out.println("request param has username as"+ u);
		out.println("session param has username as"+ (String)session.getAttribute("sun"));
		out.println("context param has username as"+ (String)context.getAttribute("sun"));
		
		
		
    }

}