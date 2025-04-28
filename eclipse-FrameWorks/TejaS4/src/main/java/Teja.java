

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Teja
 */

public class Teja extends HttpServlet {
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/raju";
	String user="root";
	String password="Ramlal@123";
	String sql="Select*from marks";
	PrintWriter pw;
	
	public void init() 
	{
		try
		{
		Class.forName(path);
		con=DriverManager.getConnection(url, user, password);
		stmt=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Override
		public void service(HttpServletRequest req, HttpServletResponse res) 
	{
		
		try
		{
			PrintWriter pw=res.getWriter();
			rs=stmt.executeQuery(sql);
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head><title>Result</title></head>");
		pw.println("<body><h1 style='color:red'>WELCOME USER CHECK YOUR RESULTS</h1></br>");
		pw.println("<table><tr><th>ID</th><th>NAME</th><th>M1</th><th>M2</th><th>M3</th></tr>");
//			res.sendRedirect("/TejaS4/dashboard.html");
		
		while(rs.next()==true)
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int m1=rs.getInt(3);
			int m2=rs.getInt(4);
			int m3=rs.getInt(5);
			pw.println("<tr><td>"+id+"</td><td>"+name+"</td><td>"+m1+"</td><td>"+m2+"</td><td>"+m3+"</td></tr>");
		}
		pw.println("</table></body></html>");
		pw.println("<h1>Succefully fetched Result</h1>");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
		public void destroy() {
		try
		{
		
		con.close();
		stmt.close();
		pw.close();
		System.out.println("Destroyed......");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
