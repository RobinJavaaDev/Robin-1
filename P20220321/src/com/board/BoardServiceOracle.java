package com.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardServiceOracle extends DAO implements BoardService {

	@Override
	// 입력
	public boolean insertBoard(Board board) {
		conn = getConnect();
		String sql = " INSERT INTO board_info (board_num, board_title, board_contents, board_user, board_date) "
				+ "VALUES (?, ?, ?, ?, ?);";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, board.getBoardNum());
			psmt.setString(2, board.getBoardTitle());
			psmt.setString(3, board.getBoardContents());
			psmt.setString(4, board.getBoardUser());
			psmt.setString(5, board.getBoardDate());
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력완료");
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;

	}

	@Override
	public Board getBoard(int bno) {
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("SELECT * FROM board_info " + "where board_user like '?';");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Board> boardList() {

		return null;
	}

	@Override
	// 수정
	public void modifyBoard(Board board) {
		conn = getConnect();
		String sql = "UPDATE board_info " + "SET board_title = ?, board_contents = ? " + "WHERE board_num = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getBoardTitle());
			psmt.setString(2, board.getBoardContents());
			psmt.setInt(3, board.getBoardNum());
			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 수정완료.");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	// 제거
	public void removeBoard(int bno) {

	}

	@Override
	// 리스트조회
	public List<Board> searchBoard(String user) {
		List<Board> boards = new ArrayList<Board>();
		
		
		
		
		
		
		return null;
	}

}
