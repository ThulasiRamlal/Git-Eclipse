

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FirstServlet extends HttpServlet {
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	PrintWriter pw=null;
	
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/raju";
	String user="root";
	String pass="Ramlal@123";
	
	String sql="select*from marks where id=?";
	
	@Override
	public void init()
	{
		try
		{
		Class.forName(path);
		con=DriverManager.getConnection(url, user, pass);
		pstmt=con.prepareStatement(sql);
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
		String text=req.getParameter("text");
		int id=Integer.parseInt(text);
		
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();
		
		pw=res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head><title>results</title></head>");
		pw.println("<body>");
		pw.println("<h1 style='color:red'>Welcome To Login Your ACCOUNT..</h1><br/>");
		pw.println("<table border='1'>");
		while(rs.next()==true)
		{
			int id1=rs.getInt(1);
			String name=rs.getString(2);
			int m1=rs.getInt(3);
			int m2=rs.getInt(4);
			int m3=rs.getInt(5);
			
		
		
		//Create Seesion Object
	HttpSession hs=req.getSession();
	hs.setAttribute("id2",id1);
	hs.setAttribute("name", name);
	hs.setAttribute("m1", m1);
	hs.setAttribute("m2", m2);
	hs.setAttribute("m3", m3);
	pw.println("<tr><td>Id</td><td>Name</td><td>M1</td><td>M2</td><td>M3</td></tr>");
	pw.println("<tr><td>"+id+"</td><td>"+name+"</td><td>"+m1+"</td><td>"+m2+"</td><td>"+m3+"</td></tr>");
	pw.println("</table></body></html>");
	
		
		}
		
		//Servlet Chaining Steps
		ServletContext sc=req.getServletContext();
		RequestDispatcher rd=sc.getRequestDispatcher("/SecondServlet");
		rd.include(req, res);
		
		
	}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
