

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	
	public void init()
	{
		System.out.println("Executed in init method.......");
		
	}
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("Executed in Service method.....");
	}
	
	public void destroy()
	{
		System.out.println("Excute Destroy method....");
	}
}
