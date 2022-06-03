package co.ljb.prj.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.ljb.prj.board.service.BoardMapper;
import co.ljb.prj.board.service.BoardService;
import co.ljb.prj.board.vo.BoardVO;

@Repository("boardDao")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper map;

	@Override
	public List<BoardVO> boardSelectList(int state, String key) {
		// TODO Auto-generated method stub
		return map.boardSelectList(state, key);
	}

	@Override
	public BoardVO boardSelect(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardSelect(vo);
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardInsert(vo);
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardUpdate(vo);
	}

	@Override
	public int boardDelete(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardDelete(vo);
	}

	@Override
	public int boardHitUpdate(int id) {
		// TODO Auto-generated method stub
		return map.boardHitUpdate(id);
	}
}
