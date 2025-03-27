import java.io.*;
import javax.servlet.*;
import javax.servlet.GenericServlet;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns={"/demo1"},loadOnStartup=10)
public class FourthServlet extends GenericServlet
{
	static
	{
		System.out.println("First Servlet .class file is loading...");
	}
	public ThirdServlet()
	{
		System.out.println("First Servlet Object Is Instantiated...");
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException{
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
	
}
