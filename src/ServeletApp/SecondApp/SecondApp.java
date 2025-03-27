import java.io.*;
import javax.servlet.*;
public class SecondApp implements Servlet
{
	static
	{
		System.out.println("Second Servlet .class file is loading...");
	}
	public FirstServlet()
	{
		System.out.println("Second Servlet Object Is Instantiated...");
	}
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("Servlet Initialization...");
	}
	public ServletConfig getServletConfig()
	{
		return null;
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException
	{
		System.out.println("Servlet Request Processing...");
	}
	public String getServletInfo()	
	{
		return null;
	}	
	public void destroy()
	{
		System.out.println("Servlet De-Instantiated...");
	}
}
