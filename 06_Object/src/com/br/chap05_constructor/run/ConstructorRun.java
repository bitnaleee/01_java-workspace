package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Cosmetic;
import com.br.chap05_constructor.model.vo.User;

public class ConstructorRun {
	
	public static void main(String[] args) {
		
		User u1 = new User();
		System.out.println(u1.information()); // 초기값 넣어져있음
		
		// 1. 기본생성자로 생성 후 setter메소드를 이용하여 값 초기화
		/*
		User u2 = new User();
		u2.setUserId("user01");
		u2.setUserPwd("pass01");
		u2.setUserName("홍길동");
		*/
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성과 동시에 초기화
		User u2 = new User("user01", "pass01", "홍길동");
		System.out.println(u2.information());
		
		// 3. 매개변수 5개짜리 생성자로 객체 생성과 동시에 초기화
		User u3 = new User("user02", "pass02", "김말똥", 21,'남');
		System.out.println(u3.information());
		
		u3.setUserName("김말동"); // 수정하기 위해 setter 있어야함 
		System.out.println(u3.information());
	
	// ==============================================================
		System.out.println("===========================================");
	
		
		//String[] arr = {"색소", "알코올"};
		//String[] arr = new String[]{"색소", "알코올"};
		Cosmetic c = new Cosmetic("펜라이너", 15000, "클리오", "아이메이크업", new String[]{"색소", "알코올"});
		System.out.println(c.information());
	
	}

}
