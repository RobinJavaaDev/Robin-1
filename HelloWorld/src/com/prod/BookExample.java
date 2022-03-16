package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책 (제목, 저자, 출판사, 가격)
		Book b1 = new Book();
		b1.bookName = "혼공자";
		b1.bookWriter = "신용권";
		b1.bookPub = "한빛미디어";
		b1.bookPrice = 24000;

		Book b2 = new Book();
		b2.bookName = "powerJava";
		b2.bookWriter = "천인국";
		b2.bookPub = "인피니티";
		b2.bookPrice = 35000;

		Book b3 = new Book();
		b3.bookName = "재미있는 Java";
		b3.bookWriter = "이호준";
		b3.bookPub = "인피니티";
		b3.bookPrice = 20000;

		Book[] books = { b1, b2, b3 };

		for (int i = 0; i < books.length; i++) {
			if (books[i].bookPub == "인피니티") {
				System.out.println("검색조건: 출판사 => 인피니티");
				System.out.println("제목: " + books[i].bookName);
				System.out.println("저자: " + books[i].bookWriter);
				System.out.println("가격: " + books[i].bookPrice);
				System.out.println("==================================");

			}
			if (books[i].bookWriter == "신용권") {
				System.out.println("검색조건: 저자 => 신용권");
				System.out.println("제목: " + books[i].bookName);
				System.out.println("저자: " + books[i].bookWriter);
				System.out.println("가격: " + books[i].bookPrice);
				System.out.println("==================================");
			}
		}
	}
}