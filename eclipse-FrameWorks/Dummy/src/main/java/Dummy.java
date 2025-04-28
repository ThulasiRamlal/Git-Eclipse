

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Dummy extends HttpServlet {
	PrintWriter pw;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
	{
		try
		{
		
		pw=res.getWriter();
	res.sendRedirect("h.html");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	

}
