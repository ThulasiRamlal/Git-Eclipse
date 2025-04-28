

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TejaSev1 extends HttpServlet {


	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) 
	{
		try
		{
           PrintWriter pw=res.getWriter();
           pw.println("<!Doctype html>");
           pw.println("<html>");
           pw.println("<head><title>Servlet</title></head>");
           pw.println("<body>"
           		+ "<h1>This is my servlet program</h1></body>"
           		+ "</html>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
