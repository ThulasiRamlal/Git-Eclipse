

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Teja extends HttpServlet {
	
	@Override
	public void init()
	{
		
		System.out.println("init method would be executed....");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) 
	{
		System.out.println("Service method woul be executed....");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy method would be executed....");
	}
	}


