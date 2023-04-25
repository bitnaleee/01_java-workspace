package com.br.chap01_oneVSmany.run;

import java.util.Scanner;

import com.br.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[3];
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	
	Book[] books = new Book[3];
	
	for(int i=0; i<books.length; i++) {
		// 1. i=0, 2. i=1, 3. i=2
		
		System.out.println(i + 1 + "번째 도서 정보 입력");
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		books[i] = new Book(title, author, price, publisher);
		
	}
	
	// 전체 도서 정보들 조회하기
	/*
	for(int i=0; i<books.length; i++) {
		System.out.println(books[i].information());
	}
	*/
	// 향상된 for문으로 
	for(Book bk : books) { // bk = books[0]; => bk = books[1]; ...
	//	if(bk.getTitle().equals(search)) {
			System.out.println(bk.information());
		
		}
	}
	
	// 도서 제목으로 검색하는 서비스
	//System.out.print("검색할 책 제목 : ");
	//String search = sc.nextLine();
	
	/*
	boolean flag = true;
	for(int i=0; i<books.length; i++) {
		if(books[i].getTitle().equals(search)) {
			System.out.println(books[i].information());
			flag = false;
		} 
	}
	
	// 만일 일치하는 도서를 찾지 못했을 경우 => "검색된 도서가 없습니다." 출력
	
	//   else { // for문안에 넣으면 3번 출력 flag 변수이용 아래 if문 씀
	//		System.out.println("검색된 도서가 없습니다.");
	//	} break;
	
	if(flag) {
		 System.out.println("검색된 도서가 없습니다.");
	}
	*/
	
	
	

}
