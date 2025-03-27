import java.io.*;
import javax.servlet.*;
public class SecondServlet implements Servlet
{
	static
	{
		System.out.println("First Servlet .class file is loading...");
	}
	public SecondServlet()
	{
		System.out.println("First Servlet Object Is Instantiated...");
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
		response.setContentType("text/html");
		System.out.println("Servlet Request Processing...");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head><title>Welcome To Advance Java</title></head></html>");
		out.println("<body><ul>"
	+ "<h1><marquee>Welcome To Advance Java</marquee></h1>"
    + "<li><a href=\"https://en.wikipedia.org/wiki/Linus_Torvalds\">Wikipedia page on Linus Torvalds</a></li>"
    + "<li><a href=\"https://www.linustorvalds.com/\">Linus Torvalds's personal website</a></li>"
    + "<li><a href=\"https://www.kernel.org/\">The Linux Kernel Archives</a></li>"
    + "</ul></body>");

		out.close();
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
