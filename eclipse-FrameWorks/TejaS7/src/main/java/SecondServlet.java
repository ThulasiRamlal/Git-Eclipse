

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */

public class SecondServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		
		try
		{
		HttpSession hs=req.getSession();
		int m1=(int) hs.getAttribute("m1");
		int m2=(int) hs.getAttribute("m2");
		int m3=(int) hs.getAttribute("m3");
		
		PrintWriter pw=resp.getWriter();
		
		float percentage=((float)(m1+m2+m3)/300)*100;
		pw.println("Percentage: "+percentage);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
