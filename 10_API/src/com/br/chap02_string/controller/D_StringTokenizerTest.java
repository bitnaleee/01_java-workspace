package com.br.chap02_string.controller;

import java.util.StringTokenizer;

public class D_StringTokenizerTest {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로 해서 문자열을 분리시키는 방법
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		//		 String 클래스에서 제공하는 split메소드
				 
		String[] arr = str.split(",");
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		for(String s : arr) {
			System.out.println(s);
		}
		
		// 방법2. 분리된 문자열들을 각각 토큰 객체로 관리하고자 할 때 
		//       java.util.StringTokenizer 클래스 이용
		//       StringTokenizer stn = new StringTokenizer(분리시키고자하는문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());
		/*
		System.out.println(stn.nextToken());	// Java 무조건 담겨있는 순서대로 나옴(단점)
		System.out.println(stn.nextToken());	// Oracle
		System.out.println(stn.nextToken());	// JDBC
		System.out.println(stn.nextToken());	// HTML
		System.out.println(stn.nextToken());	// CSS
		System.out.println(stn.nextToken());	// Spring
		//System.out.println(stn.nextToken());	// java.util.NoSuchElementException 오류 뜸
		System.out.println(stn.countTokens());	// 0 다뽑아서 없음
		*/
		
		/*
		int count = stn.countTokens();// 6
		for(int i=0; i<count; i++) {	// i<stn.countTokens(); 로 설정하면 출력되면서 줄어들어 3개만 출력됨 i=0 => 6, i=1 => 5, i=2 => 4, i=3 => 3 
			System.out.println(stn.nextToken());
		}
		*/
		
		while(stn.hasMoreTokens()) {	// (반복이수행될조건 == stn공간으로부터뽑을만한토큰이남아있을경우)
			System.out.println(stn.nextToken());
		}
		
	}

}
