package com.board;

import java.util.List;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		//BoardApp app = new BoardApp();
		Scanner scn = new Scanner(System.in);
		BoardServiceOracle BSO = new BoardServiceOracle();
		System.out.println("1.로그인 2.회원가입(미구현)");
		System.out.print("선택>>>>");
		
		
		
		while (true) {
			System.out.println("1.게시글 목록 2.게시글 등록 3.게시글 한건조회 4.게시글 수정 5.게시글 삭제   ~~   9.종료");
			System.out.print("선택>>>>");
			int menu = scn.nextInt();
			if (menu == 1) {
				List<Board> list = BSO.boardList();
				System.out.println("====유저리스트====");
				for (Board brd : list) {
					System.out.println(brd.toString());
				}
			} else if (menu == 2) {
				Board bd = new Board();
				System.out.println("게시글 번호 입력");
				bd.setBoardNum(scn.nextInt());
				System.out.println("게시글 제목 입력");
				bd.setBoardTitle(scn.next()); 
				System.out.println("게시글 내용 입력");
				bd.setBoardContents(scn.next());
				System.out.println("게시글 사용자 입력");
				bd.setBoardUser(scn.next());
				System.out.println("게시글 작성일자 입력");
				bd.setBoardDate(scn.next());
				

				BSO.insertBoard(bd);
				
			} else if (menu == 3) {
				System.out.println("조회할 게시글 번호 입력>>");
				int bNo = scn.nextInt();
				Board board = BSO.getBoard(bNo);
				if (board == null) {
					System.out.println("조회결과없음");
				} else {
					System.out.println(board.toString());
				}

			} else if (menu == 4) {
				System.out.println("수정할 게시글 제목 입력");
				String title = scn.next();
				System.out.println("수정할 게시글 내용 입력");
				String contents = scn.next();
				System.out.println("수정할 게시글 번호 입력");
				int num = scn.nextInt();

				Board b1 = new Board(num,title, contents, null, null);
				BSO.modifyBoard(b1);
				System.out.println("게시글 수정 완료");
			} else if (menu == 5) {
				System.out.println("제거할 게시글 번호 입력");
				int bNum = scn.nextInt();
				BSO.removeBoard(bNum);
			} else if (menu == 9) {
				System.out.println("프로그램 종료.");
				break;

			}

		}
		System.out.println("end of program");
	}
}
