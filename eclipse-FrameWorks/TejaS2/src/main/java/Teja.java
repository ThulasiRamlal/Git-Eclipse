

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Teja
 */

public class Teja extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
		res.sendRedirect("/TejaS2/dashboard.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
