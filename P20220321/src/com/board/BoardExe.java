package com.board;

import java.util.List;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		// BoardApp app = new BoardApp();
		Scanner scn = new Scanner(System.in);
		BoardServiceOracle BSO = new BoardServiceOracle();

		while (true) {
			System.out.println("============================================================================");
			System.out.println("=                1.로그인 2.회원가입 3.회원탈퇴 4.중복확인 5.종료                   =");
			System.out.println("============================================================================");
			System.out.print("선택>>>>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("아이디 입력>>");
				String um1 = scn.next();
				System.out.println("비밀번호 입력>>");
				int um2 = scn.nextInt();
				boolean tOrF = BSO.loginBoard(um2, um1);
				if (tOrF == true) {
					System.out.println("정상처리");
				} else {
					System.out.println("오류");
					continue;
				}
			} else if (menu == 2) {
				System.out.println("새로 만들 아이디 입력>>");
				String um1 = scn.next();
				System.out.println("새로 만들 비밀번호 입력>>");
				int um2 = scn.nextInt();
				boolean tOrF = BSO.loginCheckBoard(um2, um1);
				if (tOrF == true) {
					System.out.println("회원가입 완료");
					continue;
				} else {
					System.out.println("중복된 계정입니다");
					continue;
				}

			} else if (menu == 3) {
				System.out.println("탈퇴할 아이디 입력>>");
				String um1 = scn.next();
				System.out.println("탈퇴할 비밀번호 입력>>");
				int um2 = scn.nextInt();
				boolean tOrF = BSO.removeUser(um2, um1);
				if (tOrF == true) {
					System.out.println("탈퇴 완료");
					continue;
				} else {
					System.out.println("잘못된 입력입니다");
					continue;
				}
			} else if (menu == 4) {
				System.out.println("확인할 아이디 입력>>>");
				String um = scn.next();
				boolean tOrF = BSO.userCheck(um);
				if (tOrF == true) {
					System.out.println("중복된 아이디 입니다");
					continue;
				} else {
					System.out.println("사용 가능한 아이디입니다");
					continue;
				}
			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}

			while (true) {
				System.out.println("============================================================================");
				System.out.println("= 1.게시글 목록 2.게시글 등록 3.게시글 한건조회 4.게시글 수정 5.게시글 삭제   ~~  9.종료 =");
				System.out.println("============================================================================");

				System.out.print("선택>>>>");
				int menu2 = scn.nextInt();
				if (menu2 == 1) {
					List<Board> list = BSO.boardList();
					for (Board brd : list) {
						System.out.println(brd.toString());
					}

				} else if (menu2 == 2) {
					Board bd = new Board();
					System.out.println("게시글 제목 입력");
					bd.setBoardTitle(scn.next());
					System.out.println("게시글 내용 입력");
					bd.setBoardContents(scn.next());

					BSO.insertBoard(bd);

				} else if (menu2 == 3) {
					System.out.println("조회할 게시글 번호 입력>>");
					int bNo = scn.nextInt();
					Board board = BSO.getBoard(bNo);
					if (board == null) {
						System.out.println("조회결과없음");
						continue;
					} else {
						System.out.println(board.toString());
					}
					// System.out.println(\r\n(임시이름)ansboard.toString());\
					System.out.println("          ㄴ> 댓글위치테슽트 ");
					System.out.println("1.댓글 달기 2.메뉴화면가기");
					int ansmenu = scn.nextInt();
					if (ansmenu == 1) {
						System.out.println("미완");
					} else if (ansmenu == 2) {

					}

				} else if (menu2 == 4) {
					System.out.println("수정할 게시글 번호 입력");
					int num = scn.nextInt();
					System.out.println("수정할 게시글 제목 입력");
					String title = scn.next();
					System.out.println("수정할 게시글 내용 입력");
					String contents = scn.next();

					Board b1 = new Board(num, title, contents, null);
					BSO.modifyBoard(b1);
					System.out.println("게시글 수정 완료");
				} else if (menu2 == 5) {
					System.out.println("제거할 게시글 번호 입력");
					int bNum = scn.nextInt();
					BSO.removeBoard(bNum);
				} else if (menu2 == 9) {
					System.out.println("프로그램 종료.");
					break;

				}

			}
			System.out.println("end of prog");
			break;
		}

	}
}
