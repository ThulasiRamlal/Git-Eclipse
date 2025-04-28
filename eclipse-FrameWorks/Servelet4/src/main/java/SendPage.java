

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendPage
 */
@WebServlet("/SendPage")
public class SendPage extends HttpServlet {
	
	public void service(HttpServletResponse resp,HttpServletRequest req)
	{
		try
		{
			resp.sendRedirect("/Servelet4/Dashboard.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	}


