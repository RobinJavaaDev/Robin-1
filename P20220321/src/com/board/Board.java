package com.board;

import java.io.Serializable;

public class Board implements Serializable{
	// 필요한 요소( 제목, 내용, 작성자, 작성일자, 게시글번호)
	private String BoardTitle;
	private String BoardContents;
	private String BoardUser;
	private String BoardDate;
	private int BoardNum;

	public Board() {

	}

	
	
	
	
	public Board( int boardNum, String boardTitle, String boardContents, String boardUser, String boardDate) {
		super();
		BoardTitle = boardTitle;
		BoardContents = boardContents;
		BoardUser = boardUser;
		BoardDate = boardDate;
		BoardNum = boardNum;
	}

	@Override
	public String toString() {
		return "게시판관리정보 [게시글제목= " + BoardTitle + " , 게시글내용= " + BoardContents + " , 게시판글작성자= " + BoardUser + " , 작성일자= "
				+ BoardDate + " , 게시글번호= " + BoardNum + "]";
	}

	public int getBoardNum() {
		return BoardNum;
	}

	public void setBoardNum(int boardNum) {
		BoardNum = boardNum;
	}

	public String getBoardTitle() {
		return BoardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		BoardTitle = boardTitle;
	}

	public String getBoardContents() {
		return BoardContents;
	}

	public void setBoardContents(String boardContents) {
		BoardContents = boardContents;
	}

	public String getBoardUser() {
		return BoardUser;
	}

	public void setBoardUser(String boardUser) {
		BoardUser = boardUser;
	}

	public String getBoardDate() {
		return BoardDate;
	}

	public void setBoardDate(String boardDate) {
		BoardDate = boardDate;
	}

}
