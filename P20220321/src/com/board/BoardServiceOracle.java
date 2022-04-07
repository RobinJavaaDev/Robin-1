package com.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardServiceOracle extends DAO implements BoardService {

	@Override
	// 입력
	public void insertBoard(Board board) {
		conn = getConnect();
		String sql = " INSERT INTO board_info(board_num, board_title, board_contents, board_date) "
				+ " VALUES((SELECT MAX (board_num +1) from board_info), ?,?, default) ";
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, board.getBoardTitle());
			psmt.setString(2, board.getBoardContents());
			
		
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Board getBoard(int bno) {
		conn = getConnect();
		Board brd = null;
		try {
			psmt = conn.prepareStatement("SELECT * FROM board_info " + "where board_num = ? " + "ORDER BY board_num DESC");
			psmt.setInt(1, bno);
			rs = psmt.executeQuery();
			while (rs.next()) {
				brd = new Board();
				brd.setBoardNum(rs.getInt("board_num"));
				brd.setBoardTitle(rs.getString("board_title"));
				brd.setBoardContents(rs.getString("board_contents"));
				brd.setBoardDate(rs.getString("board_date"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return brd;
	}

	@Override
	// 리스트
	public List<Board> boardList() {

		List<Board> boards = new ArrayList<Board>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from board_info");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board brd = new Board();
				brd.setBoardNum(rs.getInt("board_num"));
				brd.setBoardTitle(rs.getString("board_title"));
				brd.setBoardContents(rs.getString("board_contents"));
				brd.setBoardDate(rs.getString("board_date")); // .substring(0, 10)
				boards.add(brd);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return boards;
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
		conn = getConnect();
		String sql = "delete from board_info " + "where board_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bno);
			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 삭제완료.");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	// 한건조회
	public List<Board> searchBoard(String user) {
		return null;

	}

	@Override
	// 로그인
	public boolean loginBoard(int bno1, String bno2) {
		conn = getConnect();
		String brd = "SELECT user_id, user_pwd  " + "FROM user_info " + "WHERE  user_pwd=? AND user_id = ?";

		try {
			psmt = conn.prepareStatement(brd);
			psmt.setInt(1, bno1);
			psmt.setString(2, bno2);
           
			//psmt.execute();
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return false;
	}

	@Override
	//회원가입,
	public boolean loginCheckBoard(int bnum1, String bnum2) {
		
		conn = getConnect();
		String brd = "INSERT INTO user_info(user_id, user_pwd) "
				+ "VALUES(?, ?)";

		try {
			psmt = conn.prepareStatement(brd);
			
			psmt.setString(1, bnum2);
			psmt.setInt(2, bnum1);
			//psmt.execute();
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return false;
		
		
		
	}

	@Override
	//회원탈퇴
	public boolean removeUser(int uno, String uno2) {
		conn = getConnect();
		String sql = "delete from user_info "
				+ "where user_id = ? and user_pwd = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, uno2);
			psmt.setInt(2, uno);
			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 회원탈퇴 완료.");
			if (r > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	@Override
	//회원중복확인
	public boolean userCheck(String usercheck) {
		conn = getConnect();
		String sql = "SELECT * FROM user_info WHERE user_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usercheck);
			int r = psmt.executeUpdate();
			if (r > 0) {
				
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

}
