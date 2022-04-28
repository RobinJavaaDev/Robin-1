package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/addStudentServlet")
public class AddStudentServ extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String studentNo= req.getParameter("sno");
		String studentName = req.getParameter("sname");
		String eng = req.getParameter("eng");
		String kor = req.getParameter("kor");
		
		Student stud = new Student();
		stud.setStudentNo(Integer.parseInt(studentNo));
		stud.setStudentName(studentName);
		stud.setEngScore(Integer.parseInt(eng));
		stud.setKorScore(Integer.parseInt(kor));
		
		//db insert.
		StudentDAO dao = new StudentDAO();
		boolean success = dao.addStudent(stud);
		if(success) {
			// {"retCode": "Success", "studNo":studentNo, "studName":studentName, "engScore":eng, "korScore":kor }
			resp.getWriter().println("{\"retCode\": \"Success\", \"studNo\":"+studentNo+", \"studName\":\""+studentName+"\", \"engScore\":"+eng+", \"korScore\":"+kor+"}");
		} else {
			// {"retCode": "Fail}
			resp.getWriter().println("{\"retCode\": \"Fail}");
		}
		
		
	}
}
