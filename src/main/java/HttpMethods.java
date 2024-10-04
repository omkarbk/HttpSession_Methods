

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpMethods
 */
public class HttpMethods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpMethods() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		HttpSession hs=request.getSession();
		PrintWriter pw=response.getWriter();
		pw.print("<html><body style=background-color:yellow; color:red; text-align:center>");
		pw.println("Session ID :"+hs.getId()+"<br>");
		pw.println("Session Creation Time :"+new Date(hs.getCreationTime())+"<br>");
		pw.println("Last access time :"+new Date(hs.getLastAccessedTime())+"<br>");
		pw.println("Inactive interval"+hs.getMaxInactiveInterval()+"<br>");
		pw.println("Session is new :"+hs.isNew());
		pw.print("</body></html>");
	}

}
