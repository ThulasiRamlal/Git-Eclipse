

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Teja extends HttpServlet {
	
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/raju";
	String user="root";
	String password="Ramlal@123";
	String sql="select*from marks where id=?";
	PrintWriter pw;
	
	@Override
	public void init() 
	{
		try
		{
		Class.forName(path);
		con=DriverManager.getConnection(url, user, password);
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
		String id=req.getParameter("text");
		int num=Integer.parseInt(id);
		 pw=res.getWriter();
		pstmt.setInt(1, num);
		rs=pstmt.executeQuery();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head><title>results</title></head>");
		pw.println("<body>");
		pw.println("<h1 style='color:red'>Welcome To RGUKTN Official Website Result..</h1><br/>");
		pw.println("<table><tr style='color: red'><th>ID</th><th>NAME</th><th>M1</th><th>M2</th><th>M3</th></tr>");
		if(rs.next()==true)
		{
			int id1=rs.getInt(1);
			String name=rs.getString(2);
			int m1=rs.getInt(3);
			int m2=rs.getInt(4);
			int m3=rs.getInt(5);
			pw.println("<tr><td>"+id1+"</td><td>"+name+"</td><td>"+m1+"</td><td>"+m2+"</td><td>"+m3+"</td></tr>");
			pw.println("</table>"
					+ "<h3>Successfully Fetched Result</h3>"
					+ "</body></html>");
		}
		else
		{
			res.sendRedirect("/TejaS5/Invalid.html");
		}
		
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void destroy()
	{
		try
		{
		con.close();
		pstmt.close();
		pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
