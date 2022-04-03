package com.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	List<Board> list = new ArrayList<Board>();
	Scanner scn = new Scanner(System.in);

	abstract class BoardServiceImpl implements BoardService {

		@Override
		public void insertBoard(Board board) {
			list.add(board);
		}

		@Override
		public Board getBoard(int bno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBoardNum() == bno) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Board> boardList() {
			return list;
		}

		@Override
		public void modifyBoard(Board board) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBoardUser() == board.getBoardUser()) {
					list.get(i).setBoardTitle(board.getBoardTitle());
					list.get(i).setBoardContents(board.getBoardContents());
					list.get(i).setBoardNum(board.getBoardNum());

				}
			}

		}

		@Override
		public void removeBoard(int bno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBoardNum() == bno) {
					list.remove(i);
					System.out.println("게시글삭제완료");
				}
			}
		}

		@Override
		public List<Board> searchBoard(String user) {
			List<Board> searchList = new ArrayList<Board>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBoardUser().equals(user)) {
					searchList.add(list.get(i));
				}
			}

			return searchList;
		}




		

	} // end of BoardServiceImpl

	

}
