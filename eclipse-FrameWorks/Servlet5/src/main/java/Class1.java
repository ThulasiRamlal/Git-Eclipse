

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Class1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)
	
	{
		try {
			PrintWriter pw=res.getWriter();
			pw.println("<!Doctype Html>"
					+ "<html> <head><title>Thulasi</title></head>"
					+ "<body>"
					+ "<h1>THIS IS MY FIRST PROGRAM IN SERVLET </h1>"
					+ "</body>"
					+ "</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
