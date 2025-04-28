

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greet
 */

public class Greet extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) 
	{	
	    try {
			 PrintWriter pw=resp.getWriter();
			 pw.println("<!DOCTYPE Html>");
			 pw.println("<Html>");
			 pw.println("<head><title>Greeting</title></head>");
			 pw.println("<body> <h1>My first Servelet project </h1></body>");
			 pw.println("</Html>");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}


