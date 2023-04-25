package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}

	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) { // 초기화
			arr[i] = i + 1;
		}
		
		for(int i=0; i<arr.length; i++) { // 잘들어갔는지 출력
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {
		
		String[] FruitArr = new String[5];
		
		FruitArr[0] = "사과";
		FruitArr[1] = "귤";
		FruitArr[2] = "포도";
		FruitArr[3] = "복숭아";
		FruitArr[4] = "참외";
		
		for(int i=0; i<FruitArr.length; i++) {
			if(FruitArr[i].equals("귤")) {
				System.out.println(FruitArr[i]);
			}
		}
		
		//System.out.println(arr[1]);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {
				count++;
			}
		}
		
		System.out.print("i 개수 : " + count);
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] arr = new String[7];
		
		arr[0] = "월요일";
		arr[1] = "화요일";
		arr[2] = "수요일";
		arr[3] = "목요일";
		arr[4] = "금요일";
		arr[5] = "토요일";
		arr[6] = "일요일";
		
		//String[] arr = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		if(num>=0 && num<=6) {
			
			/*
			for(int i=0; i<arr.length; i++) {
				if(i == num) {
					System.out.print(arr[i]);
				}
			}
			*/
			System.out.println(arr[num]);
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		/*
		System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		arr[0] = sc.nextInt();
		
		System.out.print("배열 1번째 인덱스에 넣을 값 : ");
		arr[1] = sc.nextInt();
		
		System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		arr[2] = sc.nextInt();
		
		System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		arr[3] = sc.nextInt();
		
		System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		arr[4] = sc.nextInt();
		*/
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.print("\n총 합 : " +sum);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num % 2 == 1 && num >= 3) {
				
				int[] arr = new int[num]; // 배열 생성
				
				int num2 = 1;
				for(int i=0; i<arr.length; i++) { // 배열 대입
					arr[i] = num2;
					
					if(i<arr.length/2) {
						num2++;
					} else {
						num2--;
					}
					
				}
				
				for(int i=0; i<arr.length; i++) { // 배열값 출력
					
					if(i<arr.length-1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				
				}
				
				break;
				
			} else {
				System.out.println("다시 입력하세요");
			}
			
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] chickens = {"후라이드", "양념", "파닭", "뿌링클", "간장"}; // 배열 선언/초기화
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine(); 
		
		int count = 0;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				count++;
			}
		}
		
		for(int i=0; i<chickens.length; i++) {
			if(count == 1) {
				System.out.println(menu + "치킨 배달 가능"); break;
			} else {
				System.out.println(menu + "은 없는 메뉴입니다."); break;
			}
		}
		
	}
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice11() { // 배열 안써도 풀 수 있음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			if(i<8) {
				arr[i] = str.charAt(i);
			} else {
				arr[i] = '*';
			}
		}	
			
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
}
