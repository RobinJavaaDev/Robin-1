package co.micol.prj.notice.web;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.autotag.core.runtime.annotation.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.vo.NoticeVO;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeDao;
	@Autowired
	private String saveDir; // IoC에 저장된 것을 가져옴.

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
	public String noticeInsert(NoticeVO vo, MultipartFile file) {
		
		String fileName = file.getOriginalFilename();
		
		
		if (fileName != null && !fileName.isEmpty() && fileName.length() !=0) {
			
			// uuid 사용해서 파일명 변경
			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName.substring(fileName.indexOf("."));
			
			// uuid로 만든 파일명 넣기
			File target = new File(saveDir, saveFileName);
			
			vo.setNoticeAttech(fileName); //파일명
			vo.setNoticeDir(saveFileName); // 실제 저장경로를 담는다
			
			try {
				FileCopyUtils.copy(file.getBytes(), target); // 실제파일을 저장
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		noticeDao.noticeInsert(vo); // 파일 있을경우에 파일 먼저 업로드 후 db저장
		return "redirect:noticeList.do";
	}

	@PostMapping("/getContent.do")
	// public String getContent(@RequestParam int noticeId) { @RequestParam은 get방식일때
	// 사용 가능
	public String getContent(NoticeVO vo, Model model) {
		noticeDao.noticeHitUpdate(vo.getNoticeId());
		model.addAttribute("content", noticeDao.noticeSelect(vo));
		return "notice/noticeContent";
	}

	@RequestMapping("/downLoad.do")
	public void downLoad(@RequestParam("saveName") String saveName, HttpServletResponse resp, @RequestParam("fileName") String fileName) {
		// file을 배열로 전환
		try {
			byte fileByte[] = org.apache.commons.io.FileUtils.readFileToByteArray(new File(saveDir+File.separator+saveName));
			resp.reset(); // response 초기화
			// 모든 타입의 데이터를 전송할때 사용\
			resp.setContentType("application/octet-stream");
			// 파일길이만큼 사이즈 설정
			resp.setContentLength(fileByte.length);
			// 파일다운 위해서 설정
			resp.setHeader("Content-Disposition","attachment; filename=\"" 
			+ URLEncoder.encode(fileName, "utf-8") + "\"");
			
			resp.getOutputStream().write(fileByte); // 파일저장
			resp.getOutputStream().flush();
			resp.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//게시글 삭제
	@RequestMapping("/noticeDelete.do")
	public String noticeDelete(NoticeVO vo){
		noticeDao.noticeDelete(vo);
		return "redirect:noticeList.do";
	}
	
	//게시글수정
	@RequestMapping("/noticeModifyForm.do")
	public String noticeModifyForm(NoticeVO vo, Model model) {
		model.addAttribute("notice", noticeDao.noticeSelect(vo));
		return "notice/noticeModifyForm";
	}
	
	@RequestMapping("/noticeModify.do")
	public String noticeModify(NoticeVO vo, MultipartFile file) {
		
        String fileName = file.getOriginalFilename();
		
		
		if (fileName != null && !fileName.isEmpty() && fileName.length() !=0) {
			
			// uuid 사용해서 파일명 변경
			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName.substring(fileName.indexOf("."));
			
			// uuid로 만든 파일명 넣기
			File target = new File(saveDir, saveFileName);
			
			vo.setNoticeAttech(fileName); //파일명
			vo.setNoticeDir(saveFileName); // 실제 저장경로를 담는다
			
			try {
				FileCopyUtils.copy(file.getBytes(), target); // 실제파일을 저장
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		noticeDao.noticeUpdate(vo);
		return "redirect:noticeList.do";
	}
	@PostMapping("ajaxSearchList.do")
	@ResponseBody
	public List<NoticeVO> ajaxSearchList(@RequestParam("state") int state, @RequestParam("key") String key) {
		//List
		return noticeDao.noticeSelectList(state, key);
	}
}
