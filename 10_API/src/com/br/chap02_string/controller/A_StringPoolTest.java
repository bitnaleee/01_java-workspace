package com.br.chap02_string.controller;

public class A_StringPoolTest {

	public void method1() {
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1); // hello
		System.out.println(str2/*.toString()*/); // hello
		// String클래스에 toString 메소드 이미 오버라이딩 되어있음 (실제 담긴 문자열 반환하도록)
		
		System.out.println(str1 == str2);	// false(주소값 비교라서)
		System.out.println(str1.equals(str2)); // true
		// String클래스에 equals메소드 이미 오버라이딩 되어있음 (주소값이 아닌 실제 담긴 문자열간 비교)
		
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		// String클래스에 hashCode메소드 이미 오버라이딩 되어있음 (주소값이 아닌 실제 담긴 문자열가지고 만듦)
		
		// 찐 주소값을 알고자 할 경우 System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1)); // 123961122
		System.out.println(System.identityHashCode(str2)); // 1227229563
		
	}
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. 문자열을 리터럴값을 생성
		String str1 = "hello"; 
		String str2 = "hello";
		// 리터럴 제시시 상수풀(StringPool) 영역에 올라감 
		// String Pool 특징 : 동일한 문자열을 가질 수 없음
		
		System.out.println(str1); // hello
		System.out.println(str2); // hello
		
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		
		System.out.println(str1 == str2); // true (주소값이 일치)
		
		System.out.println(System.identityHashCode(str1)); // 123961122
		System.out.println(System.identityHashCode(str2)); // 123961122
		System.out.println(System.identityHashCode(str)); // 1227229563
		
	}
	
	public void method3() {
		
		String str = "hello";
		System.out.println(System.identityHashCode(str)); // 123961122
		
		str = "hi"; // 값 변경 (새로운 값 대입)	// 원래 값은 Heap영역에서 필요없게 되고 자바 Garbage Collection에 의해 삭제
		System.out.println(System.identityHashCode(str)); // 1227229563
		
		str += "!";	// 값 변경 (기존의 값에 연이어지게끔)	// 새로운 주소값 참조 // 원래 값은 Heap영역에서 필요없게 되고 자바 Garbage Collection에 의해 삭제
		System.out.println(System.identityHashCode(str)); // 1982791261
		
		/*
		 * String 클래스 == 불변클래스
		 * 변경이 가능하긴 하나 그 자리에서 수정되는 개념 아님
		 * 변경하는 순간 새로운 곳을 참조하도록 주소값 바뀜
		 * 
		 * 빈번하게 값을 변경해야 될 경우 GC가 계속 기존의 값들을 지워져야되는 단점
		 * 변경이 적고 한번 값을 담은 후에 단지 조회만 할 경우 String 클래스가 용이
		 */
		
	}
	
}
