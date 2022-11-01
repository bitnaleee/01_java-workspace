package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {
	
	public static void main(String[] args) {
		
		// 초기식, 조건식, 증감식으로 이뤄져있는 for문 => for loop문
		
		// 배열 또는 컬렉션과 함께 사용되는 for문
		// 0번부터 마지막까지 순차적으로 접근할 목적 => 향상된 for문(for each문)
		// 단, 자바 5버전이상부터 사용가능
		/*
		 * for(순차적으로 접근한 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션) { // 반복횟수 == 배열 또는 컬렉션의 크기
		 * 	   반복적으로 실행할 내용
		 * }
		 * 
		 */
		
		int[] arr = {10, 20, 30};
		// int : int[]
		for(int i=0; i<arr.length; i++) {	// for loop문
			System.out.println(arr[i]);
		}
	
		for(int value : arr) { // value = arr[0];	=>	 value = arr[1]	  =>   value = arr[2]; 
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("아이폰", "애플", 1400000, "14프로");
		phones[1] = new Phone("갤럭시", "삼성", 1200000, "노트20");
		phones[2] = new Phone("벨벳폰", "엘지", 900000, "1");
		phones[2].setSeries("없음");
		
		int total = 0;
		// Phone : Phone[]
		for(Phone p : phones) { // 변수 = phones[0]	  =>   변수 = phones[1]   =>   변수 = phones[2]
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		System.out.println("총가격 : " + total + "원");
		System.out.println("평균가 : " + total / phones.length + "원");
		
	// ====================================================================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		int count = 0;
		for(Phone p : phones) {
			if(p.getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 " + buy + "핸드폰 가격은 " + p.getPrice() + "원입니다.");
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("저희 가게에서 판매하는 핸드폰이 아닙니다.");
		}
		
		// index를 활용할 수 없다 ex) i+1 번째 핸드폰
		// int i = 0; (i++ +1)번째 핸드폰 이렇게 만들 수도 있지만 for loop문으로 쓰는게 낫다 
	}

}
