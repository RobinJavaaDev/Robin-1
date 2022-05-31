package co.micol.prj.notice.web;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.vo.NoticeVO;

@Controller
public class NoticeController {
	@Autowired private NoticeService noticeDao;
	@Autowired private String saveDir; // IoC에 저장된 것을 가져옴.
	
	@RequestMapping("/noticeList.do")
	public String noticeList(Model model) {
		model.addAttribute("notices", noticeDao.noticeSelectList(1, "전체리스트"));
		return "notice/noticeList";
	}
	@RequestMapping("/noticeInsertForm.do")
	public String noticeInsertForm() {
		return "notice/noticeInsertForm";
	}
	@PostMapping("/noticeInsert.do")
	public String noticeInsert(NoticeVO vo, MultipartFile file, Model model) {
		String fileName = file.getOriginalFilename();
		if(fileName != null) {
			File target = new File(saveDir,fileName);
			vo.setNoticeAttech(fileName);
			vo.setNoticeDir(target.toString()); // 실제 저장경로를 담는다
			try {
				FileCopyUtils.copy(file.getBytes(),target); // 실제파일을 저장
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		noticeDao.noticeInsert(vo); // 파일 있을경우에 파일 먼저 업로드 후 db저장
		return "redirect:noticeList.do";
	}
}
