package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b = new Book();
		System.out.println(b.information());
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(b2.information());
		
		System.out.println("=============================");
		
		b2.setTitle("C언어");
		b2.setPrice(30000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("홍길동");
		System.out.println("수정된 결과 확인\n" + b2.information());
		
		System.out.println("=============================");
		
		System.out.println("도서명 = " + b2.getTitle());
		b2.sum(30000, 0.1);
		System.out.println("도서명 = 자바의 정석");
		b2.sum(20000, 0.2);
	}
	
	
}
