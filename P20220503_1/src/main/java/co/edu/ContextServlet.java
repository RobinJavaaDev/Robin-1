package co.edu;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ContextServlet")
public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	ServletContext sc = null;
	
    public ContextServlet() {
        super();
    }
@Override
public void init(ServletConfig config) throws ServletException {
	sc = config.getServletContext(); // 서블릿 정보를 불러옴, sc(servlet) (원래는)->application(jsp)
	sc.setAttribute("name", "Hong");
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("name: " + sc.getAttribute("name"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
