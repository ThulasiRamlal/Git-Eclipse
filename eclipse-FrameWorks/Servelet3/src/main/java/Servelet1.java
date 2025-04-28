

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servelet1
 */
@WebServlet("/Servelet1")
public class Servelet1 extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) 
	
	{
		
		 try {
			PrintWriter pw=resp.getWriter();
			pw.println("<!Doctype html><html><head><title>Servelt</title>"
					+ "</head><body><h1>This is my first servelt Program</h1></body></html>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
