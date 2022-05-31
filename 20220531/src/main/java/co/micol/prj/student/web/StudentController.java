package co.micol.prj.student.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.micol.prj.student.service.StudentService;
import co.micol.prj.student.vo.StudentVO;

@Controller // + @ResponseBody..... + 밑에있는 request,postmapp,getmapp
public class StudentController {
	@Autowired
	private StudentService studentDao;
	
	@RequestMapping("/studentList.do") // 전체회원 목록
	public String studentList(Model model) {	
		model.addAttribute("students", studentDao.studentSelectList());
		return "student/studentList";
	}
	@RequestMapping("/studentJoinform.do")
	public String studentJoinform() {
		return "student/studentJoinform";
	}
		
	@PostMapping("/studentJoin.do")
	public String studentJoin(StudentVO vo, Model model) {
		int n = studentDao.studentInsert(vo);
		if(n !=0) {
			model.addAttribute("message", "회원가입 완료.");
		} else {
			model.addAttribute("message", "회원가입 실패.");
		}
		return "student/studentJoin";
	}
	@GetMapping("/ajaxIdCheck.do")
	@ResponseBody
	public String ajaxIdCheck(String id) {
		boolean b = studentDao.idCheck(id);
		String data = "N"; // 중복 되는 아이디
		if(!b) {
			data = "Y"; // 사용할 수 있는 아이디
		} 
		return data;
	}
	
	@RequestMapping("/studentLoginForm.do")
	public String studentLoginForm(StudentVO vo, Model model) {
		return "student/studentLoginForm";
	}
	@PostMapping("/studentLogin.do")
	public String studentLogin(HttpServletRequest request,StudentVO vo, Model model, HttpSession session) {
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("name"));
		System.out.println("============================");
		vo = studentDao.studentSelect(vo);
		if(vo != null) {
			session.setAttribute("id", vo.getId());
			session.setAttribute("name", vo.getName());
			model.addAttribute("message", "님 환영합니다.");
		} else {
			model.addAttribute("message", "아이디 또는 패스워드 틀림");
		}
		return "student/studentLogin";
	}
	@RequestMapping("/studentLogout.do")
	public String studentLogout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("message", "로그아웃되었습니다.");
		return "student/studentLogout";
	}
}