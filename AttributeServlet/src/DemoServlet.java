import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet
{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		ServletContext context=getServletContext();
		context.setAttribute("company","IBM");
		
		pw.print("Welcome to DemoServlet Class");
		pw.print("<a href='servlet2'> Visit DemoServlet2 Class </a>");
		
		pw.close();
		
	}
}
