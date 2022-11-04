package com.br.chap02_string.controller;

public class C_StringMethodTest {
	
	public void method() {
		
		String str1 = "Hello World";
		
		// 1. 문자열 charAt(int index) : char
		//    문자열에서 전달받은 index위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//    문자열과 전달된 또 다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		System.out.println("str2와 str3가 일치합니까(==) : " + (str2 == str3));
		
		// 3. 문자열.equals(Object obj) : boolean
		// 	  실제 문자열값을 가지고 동등비교 해줌
		System.out.println("str2와 str3가 일치합니까(equals) : " + str2.equals(str3));
		
		// 4. 문자열.contains(CharSequence s) : boolean
		//    문자열에 전달된 문자열이 포함되어있으면 true 아니면 false 반환
		//    * CharSequence는 String 부모 인터페이스(다형성적용)
		System.out.println("str1에 Hell문자열이 포함되어있습니까 : " + str1.contains("Hell"));
		
		// 5. 문자열.length() : int
		//    해당 문자열의 길이(글자수) 반환
		System.out.println("str1의 길이 : " + str1.length());
		
		// 6. 문자열.substring(int beginIndex) : String => beginIndex위치에서부터 끝까지 다 추출해서 반환
		//	  문자열.substring(int beginIndex, int endIndex) : String
		// 				=> 문자열의 beginIndex에서부터 endIndex "이전"까지 문자열을 추출해서 반환
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,4));
		
		// 7. 문자열.replace(char oldChar, char newChar) :
		//    문자열에서 oldChar를 newChar로 변환한 새 문자열 리턴
		str1.replace('1', 'c');	// str1자체가 변경된 건 아님 원본은 그대로 있음
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		System.out.println("str1이 변경됐나 : " + str1);
		
		// 8. 문자열.toUpperCase() : String => 문자열을 다 대문자로 변경한 새문자열 리턴
		//    문자열.toLowerCase() : String =>	"	   소문자로		"
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("lower : " + str1.toLowerCase());
		/*
		System.out.println("계속하시겠습니까 (y/n) : ");
		char flag = sc.nextLine().toUpperCase().charAt(0);
		
		if(flag == 'N') {
			// 프로그램종료
		}
		*/
		
		// 9. 문자열.trim() : String
		//    문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
		String str6 = "   JA  VA   ";	// 가운데 공백은 제거x
		System.out.println("trim : " + str6.trim());
		
	}
	
}
