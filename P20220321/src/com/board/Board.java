package com.board;

import java.io.Serializable;

public class Board implements Serializable {
	// 필요한 요소( 제목, 내용, 작성자, 작성일자, 게시글번호)
	private String BoardTitle;
	private String BoardContents;
	private String BoardDate;
	private int BoardNum;

	public Board() {

	}

	public Board(int boardNum, String boardTitle, String boardContents, String boardDate) {
		super();
		BoardTitle = boardTitle;
		BoardContents = boardContents;

		BoardDate = boardDate;
		BoardNum = boardNum;
	}

	@Override
	public String toString() {
		      
		return "게시글조회: [게시글제목= " + BoardTitle + " , 게시글내용= " + BoardContents + " , 작성일자= " + BoardDate.substring(0, 10) + " , 게시글번호= "
				+ BoardNum + "]";
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

	public String getBoardDate() {
		return BoardDate;
	}

	public void setBoardDate(String boardDate) {
		BoardDate = boardDate;
	}

}
