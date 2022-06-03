package co.ljb.prj.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ljb.prj.board.service.BoardService;
import co.ljb.prj.board.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardDao;
	
	
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		model.addAttribute("boards", boardDao.boardSelectList(1, "전체리스트"));
		return "board/boardList";
	}
	
	@RequestMapping("/boardInsertForm.do")
	public String boardInsertForm() {
		return "board/boardInsertForm";
	}
	
	@PostMapping("/boardInsert.do")
	public String boardInsert(BoardVO vo) {
		return "redirect:boardList.do";
	}
}
