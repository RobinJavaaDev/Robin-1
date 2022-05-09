package co.edu.full;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeworkServlet.do")
public class HomeworkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeworkServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String job = request.getParameter("job");
		HomeworkDAO dao = new HomeworkDAO();
		if(job.equals("insert")) {
			String todo =  request.getParameter("todo");
			HomeworkVO vo = new HomeworkVO(todo);
			dao.insertToDo(vo);
		} else if(job.equals("delete")) {
			String todo =  request.getParameter("todo");
			dao.deleteToDo(todo);
		}
	}

}
