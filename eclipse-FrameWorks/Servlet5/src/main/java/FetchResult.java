

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Result;

/**
 * Servlet implementation class FetchResult
 */
@WebServlet("/FetchResult")
public class FetchResult extends HttpServlet {
	
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/servlet";
	String user="root";
	String pass="Ramlal@123";
	String sql="select*From result where id=?";
	PrintWriter pw=null;
	
	public void init()
	{
		//Initialization logic
		try
		{
		Class.forName(path);
		con=DriverManager.getConnection(url, user, pass);
		stmt=con.prepareStatement(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
		//Business logic
		String id=req.getParameter("id"); 
		int number=Integer.parseInt(id);
		stmt.setInt(1, number);
		rs=stmt.executeQuery();
		pw=res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html><head><title>Results</title></head>");
		pw.println("<body>");
		pw.println("<h1>WELCOME TO CHECK YOUR RESULTS</h1>");
		pw.println("<table Border>");
		pw.println("<tr><th>ID</th><th>Name</th><th>Maths</th><th>Physics</th><th>Chemistry</th></tr>");
	
		
		if(rs.next())
		{
			
			int id1=rs.getInt(1);
			String name=rs.getString(2);
			int maths=rs.getInt(3);
			int physics=rs.getInt(4);
			int chemistry=rs.getInt(5);
			pw.println("<tr><th>"+id1+"</th><th>"+name+"</th><th>"+maths+"</th><th>"+physics+"</th><th>"+chemistry+"</th></tr>");
		}
				
		else
		{
			res.sendRedirect("InvalidLogin.html");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	public void destroy()

	{
		//Server resource clean up Logic
		try
		{
		con.close();
		stmt.close();
		rs.close();
		pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
