import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;
import  javax.servlet.http.HttpServlet; 
import javax.servlet.http.*;
@WebServlet(urlPatterns={"/test"},loadOnStartup=10)
public class FifthServlet extends HttpServlet
{
	static
	{
		System.out.println("First Servlet .class file is loading...");
	}
	public FifthServlet()
	{
		System.out.println("First Servlet Object Is Instantiated...");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			System.out.println("Request Method Type : GET ");
			PrintWriter out = response.getWriter();		
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			System.out.println("Request Method Type : Post ");
			
			PrintWriter out = response.getWriter();	
			out.println(request.getParameter("name"));	
	}
}
