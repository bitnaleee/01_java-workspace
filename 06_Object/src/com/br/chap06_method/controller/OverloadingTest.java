package com.br.chap06_method.controller;

public class OverloadingTest {

	// 오버로딩 : 한 클래스 내에 동일한 이름의 메소드명으로 정의할 수 있는 것
	public void test() {
		
	}
	
	/* 하나만 정의 되어야함
	public void test() {
	
	}
	*/
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a ) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/* "매개변수명과는 상관없이" 매개변수의 자료형의 갯수와 순서가 다르게 작성되어야함
	public void test(int c, int d) {
		
	}
	*/
	
	public void test(String str) {
		
	}
	
	/* 반환형도 상관없음 x
	public int test(String str) {
		return 0;
	}
	*/
	
	/* 접근제한자도 상관없음 x
	protected void test(String str) {
		
	}
	*/
	
	/*
	 * * 결론
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드들
	 *          단, 매개변수명/접근제한자/반환형을 다 떠나서
	 *          매개변수의 자료형과 갯수, 순서가 다르게 작성되어있어야함
	 *          
	 * 
	 */
	
}
