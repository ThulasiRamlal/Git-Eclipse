

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Class2 extends HttpServlet {
	
public void service(HttpServletRequest req,HttpServletResponse res)
{
	try
	{
	 res.sendRedirect("/Servlet5/Class1.html");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
