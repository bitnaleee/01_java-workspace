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
		
		for(int i=0; i<arr.length; i++) { // 1부터 입력받은 값까지 배열에 초기화
			arr[i] = i + 1;
		}
		
		for(int i=0; i<arr.length; i++) { // 잘들어갔는지 출력
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {
		
		String[] arr = new String[5];
		
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		System.out.println(arr[1]);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;	// 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
						// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가 시켜줄꺼임
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우 
				count++;	// 그리고 count 1증가
			}
		}
		
		System.out.println(ch + "개수 : " + count);
		
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
		arr[6] = "일요일";		// 간단하게 String[] arr = {"월", "화", "수", "목", "금", "토", "일"}; 하고 출력할 때 +요일 해도 됨 
		
		if(num>=0 && num<=6) {
			
			System.out.println(arr[num]);
			
		} else {
			
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];	// 사용자에게 값 받고 그 값만큼 배열 선언 및 할당
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}	// 배열 크기만큼 사용자가 직접 값을 입력하여 인덱스 값을 초기화 
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println("\n총합 : " + sum);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
			if(num>=3 && num % 2 == 1) {
			
				int[] arr = new int[num];
				
				int num2 = 1;
				for(int i=0; i<arr.length; i++) {
					arr[i] = num2;
					
					if(i<arr.length/2) {
						num2++;
					} else {
						num2--;
					}
					
				}
				
				for(int i=0; i<arr.length; i++) {
					
					if(i<arr.length-1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				
				}
				
				break;
				
			} else {
				System.out.println("다시 입력하세요.");
			}
		
		}
		
		// Scanner~
		// 반복할 부분 while(true)처리
		// 정수받기 num
		// if문 크게 => 3이상 홀수 (잘입력한경우) > break; 미리써놔도 됨
		// else => (잘못입력한경우) 다시입력해주세요 출력 후 반복문 다시 시작
		//------------------------------------------------------
		// 가운데로 와서 
		
		// 배열 생성 > int[] arr = new int[num];
		
		// 배열 값 대입 > int value = 1 ;
		//				for(int i=0; i<arr.length; i++) {
		//				arr[i] = value;
		//					if(i<arr.length/2) {
		//						value++;
		//					} else {
		//						value--;
		//				}
		
		// 배열 값 출력 > for(int i=0; i<arr.length; i++) {
		//					if(i<arr.length-1) {
		//						System.out.print(arr[i] + ", ");
		//					} else {
		//						System.out.print(arr[i]);
		//					}	
		
		//				break;
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] chickens = {"후라이드", "양념", "파닭", "뿌링클", "간장"};
		
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
				System.out.println(menu + "치킨은 없는 메뉴입니다."); break;
			}
		} 
		
		// 치킨 메뉴들이 들어있는 String 배열선언 & 초기화 => 내가 설정
		// String[] chickens = {"후라이드", "양념", "파닭", "뿌링클", "간장");
		// 치킨명 받기 Scanner~System~String menu~
		
		// 입력한 메뉴가 해당 배열에 존재하는지 판단
		// boolean flag = false;
		// for(int i=0; i<chickens.length; i++) {
		//		if(menu.equals(chickens[i])) {
		//		flag = true; // int count=0; 초기화하고 count++; if(count == 0)
		//		break;
		// ※ 여기서 System.out.println(menu + "치킨 배달 가능");
		//	      System.out.println(menu + "치킨은 없는 메뉴입니다."); 
		//   넣으면 계속 출력됨
		
		// 판별한 결과 출력
		// if(flag) {
		//		System.out.println(menu + "치킨 배달 가능");
		// } else {
		//		System.out.println(menu + "치킨은 없는 메뉴입니다.");
		// }
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
