package mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;

public class LibraryMenu {

	LibraryManager Im = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.println("=== Book Library ===");
		
		while(true) {
			
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : Im.myPage();
			case 2 : selectAll();
			case 3 : searchBook();
			case 4 : rentBook();
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못입력하였습니다. 다시 입력해주세요"); break;
			
			}
			
		}
		
	}
	
	public void selectAll() {
		
		ArrayList<Book> bList = Im.selectAll();
		
		for(int i=0; i<bList.size(); i++) {
			System.out.println(i + "번도서 : " + bList.get(i));
		}
		
	}
	
	public void searchBook() {
		
		System.out.print("검색할 제목 키워드 : ");
		String keyword= sc.nextLine();
		
		ArrayList<Book> searchList = Im.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book b : searchList) {
				System.out.println(searchList.get(i));
			}
		}
		
	}
	
	public void rentBook() {
		
		ArrayList<Book> bList = Im.selectAll();
		
		while(true) {
			
			int result=0;
			System.out.println("대여할 도서 번호 선택 : ")
			int num = sc.nextInt();
			for(int i=0; i<bookList.size(); i++) {
				result++;
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		 
		
	}
	
}
