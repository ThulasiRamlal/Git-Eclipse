

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
 * Servlet implementation class GETPOST
 */
@WebServlet(name = "POSTGET", urlPatterns = { "/POSTGET" })
public class GETPOST extends HttpServlet {

	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	PrintWriter pw=null;
	
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/servlet";
	String user="root";
	String pass="Ramlal@123";
	String sql="Select*from result where id=?";
	
	@Override
	public void init()  {
		try
		{
		Class.forName(path);
		con=DriverManager.getConnection(url, user, pass);
		pstmt=con.prepareStatement(sql);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		try {
			String id=req.getParameter("id");
			int numb=Integer.parseInt(id);
			pstmt.setInt(1, numb);
			pw=resp.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html><head><title>First</title></head>");
			pw.println("<body><h1>WELCOME TO CHECK THE RESULT</h1>");
			pw.println("<h1>ARE YOU ENJOY FOR YOUR RESULT.......</h1>");
			if(rs.next())
			{
				
				int id1=rs.getInt(1);
				String name=rs.getString(2);
				int maths=rs.getInt(3);
				int physics=rs.getInt(4);
				int chemistry=rs.getInt(5);
				pw.println("<table><tr><th>ID</th><th>NAME</th><th>MATHS</th><th>PHYSICS</th><th>CHEMISTRY</th></tr>");
				pw.println("<tr><td>"+id1+"</td><td>"+name+"</td><td>"+maths+"</td><td>"+physics+"</td><td>"+chemistry+"</td><tr>");
			    
			}
			else
			{
			resp.sendRedirect("GETPOSTINVALIDLOGIN.html");	
			}
			
			pw.println("</body></html>");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try
		{
		con.close();
		pstmt.close();
		rs.close();
		pw.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	

	

}
