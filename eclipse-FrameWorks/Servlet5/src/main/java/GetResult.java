

import java.beans.Statement;
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

/**
 * Servlet implementation class GetResult
 */
@WebServlet("/GetResult")
public class GetResult extends HttpServlet {
	
	String path="com.mysql.cj.jdbc.Driver";
	Connection con=null;
	java.sql.Statement st;
	ResultSet rs=null;
	PreparedStatement psmt=null;
	String url="jdbc:mysql://localhost:3306/servlet";
	String user="root";
	String pass="Ramlal@123";
	PrintWriter pw=null;
	String sql="select*from servlet where id=4";
	
	
public void init()
{
	try {
		//Register the Driver
		Class.forName(path);
		//Create Connection
		con=DriverManager.getConnection(url, user, pass);
		st= con.createStatement();
		
		
		
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void service(HttpServletRequest req,HttpServletResponse res)
{
	try {
		pw=res.getWriter();
		rs=st.executeQuery(sql);
		pw.println("<!DOCTYPE Html>");
		pw.println("<head><title>First</title></head>");
		pw.println("<body><h1>This is my First JDBC in Servlet....</h1>");
		pw.println("<br/>");
		pw.println("<table> <tr><th>ID</th><th>Name</th><th>Marks</th><th>Age</th></tr>");
		
		
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int marks=rs.getInt(3);
			int age=rs.getInt(4);
			
	pw.println("<tr><td>"+id+"</td><td>"+name+" </td><td>"+marks+"</td><td>"+age+"</td></tr>");
		
		}
		
		pw.println("</table></body></html>");
		
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void destroy()
{
	
	try
	{
	con.close();
	rs.close();
	pw.close();
	System.out.println("Succefully closed And Destroyed...");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}


}
