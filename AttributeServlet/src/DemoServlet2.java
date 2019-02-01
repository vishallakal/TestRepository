import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet2 extends HttpServlet
{
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	ServletContext context=getServletContext();
	String name=(String)context.getAttribute("company");
	
	pw.print("Welcome to:- "+name);
	pw.close();
	
	
}
	
}
