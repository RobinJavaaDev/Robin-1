package com.board;

import java.util.List;

public interface BoardService {
	public void insertBoard(Board board); // 게시글 입력

	public Board getBoard(int bno); // 한건조회

	public List<Board> boardList(); // 게시판정보조회

	public void modifyBoard(Board board); // 게시글 정보 수정

	public void removeBoard(int bno); // 게시글 제거

	public List<Board> searchBoard(String user); // 유저로 조회
	
	public boolean loginBoard(int bno1, String bno2); // 로그인

	public boolean loginCheckBoard (int bnum1, String bnum2); // 회원가입
	
	public boolean removeUser(int uno1, String uno2);
	
	public boolean userCheck (String usercheck);
}
