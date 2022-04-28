package co.edu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.student.Student;
import co.edu.student.StudentDAO;


@WebServlet("/ajax/modStudentServlet")
public class ModStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ModStudentServlet() {
        super();
      
    }

	 @Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String sNo = req.getParameter("sno");
		String sName = req.getParameter("sname");
		String eng = req.getParameter("eng");
		String kor = req.getParameter("kor");
		
		Student std = new Student();
		std.setStudentNo(Integer.parseInt(sNo));
		std.setEngScore(Integer.parseInt(eng));
		std.setKorScore(Integer.parseInt(kor));
		std.setStudentName(sName);
		
		StudentDAO dao = new StudentDAO();
		boolean success = dao.modifyStudent(std);//{"retCode": "Success", "studNo": ?,"engScore": ?, "korScore": ?, "studName": studName }
		if (success) {
			resp.getWriter().println("{\"retCode\": \"OK\", \"studNo\":"+sNo+", \"studName\":\""+sName+"\", \"engScore\":"+eng+", \"korScore\":"+kor+"}");
		}else {
			resp.getWriter().println("{\"retCode\": \"Fail}");
		}
		}
}


