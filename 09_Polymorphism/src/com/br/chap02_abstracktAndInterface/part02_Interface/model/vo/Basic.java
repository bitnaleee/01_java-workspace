package com.br.chap02_abstracktAndInterface.part02_Interface.model.vo;

public interface Basic {

	// 추상클래스 : 일반멤버변수 + 일반메소드 + 추상메소드
	// 인터페이스 : only 상수필드 + only 추상메소드
	
	//private int a; 인터페이스에서는 상수로
	//public static final int NUM = 10; 
	int NUM = 10;
	/* 완성된 메소드 안됨 추상메소드만 가능
	public void test() {
		
	}
	*/
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
}
