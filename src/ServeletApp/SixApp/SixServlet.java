import javax.servlet.*;
import java.io.*;
import java.util.Arrays;
import javax.servlet.annotation.*;
import  javax.servlet.http.HttpServlet; 
import javax.servlet.http.*;
@WebServlet(urlPatterns={"/test"},loadOnStartup=10)
public class SixServlet extends HttpServlet
{
	static
	{
		System.out.println("First Servlet .class file is loading...");
	}
	public SixServlet()
	{
		System.out.println("First Servlet Object Is Instantiated...");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			doProcess(request,response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			doProcess(request,response);
	}
	public void doProcess(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException
	{
			System.out.println("Request Method Type : "+req.getMethod());
			PrintWriter out = res.getWriter();	
			out.println("Your Name : "+req.getParameter("Name"));	
			out.println("Your Telephone : "+req.getParameter("Telephone"));	
			out.println("Your Email : "+req.getParameter("Email"));	
			out.println("Your Age : "+req.getParameter("Age"));
			out.println("Your Gender : "+req.getParameter("Gender"));	
			  String[] ani = req.getParameterValues("animals");

			if (ani != null) {
				out.println("Your Selected Animals:");
				
				for (String anmls : ani) {
					out.print(anmls +"|");
				}
			} 
			else
			{
				out.println("Your Selected Animals: None");
			}
	  }
}
