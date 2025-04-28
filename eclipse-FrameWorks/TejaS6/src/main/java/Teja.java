

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
	PrintWriter pw;
	
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/raju";
	String user="root";
	String pass="Ramlal@123";
	
	String sql="Select*from account where id=? and psw=?";
	
	
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
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	{
		try
		{
		String us=req.getParameter("userid");
		String pd=req.getParameter("userpwd");
		
		int us1=Integer.parseInt(us);
		int pd1=Integer.parseInt(pd);
		pstmt.setInt(1, us1);
		pstmt.setInt(2, pd1);
		rs=pstmt.executeQuery();
		pw=res.getWriter();
		//====================================================================
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head><title>results</title></head>");
		pw.println("<body>");
		pw.println("<h1 style='color:red'>Welcome To Login Your ACCOUNT..</h1><br/>");
		pw.println("<table>");
		//=================================================================
		if(rs.next()==true)
		{
			pw.println("+<h1>"+us1+"  AND  "+pd1+" SUCCEFULLY LOGIN ACCOUNT......</h1>" );
			pw.println("</table></html>");
		}
		else
		{
			res.sendRedirect("/TejaS6/Invalididpwd.html");
		}
		}
		catch(Exception e)
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
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
