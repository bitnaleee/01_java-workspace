package com.br.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	
	/*
	 * * RuntimeException
	 * - 프로그램 실행시 주로 발생되는 예외들 (런타임 에러)
	 * 
	 * * RuntimeException의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스 제시시 발생되는 에러
	 * - NullPointerException : 레퍼런스가 null로 초기화된 상태에서 어딘가에 접근할 때 발생되는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 때 발생되는 예외
	 * - ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
	 * - NegativeArraySizeException : 배열 할당시 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 * ...
	 * => RuntimeException 관련된 예외들을 충분히 "예측가능함"
	 * => 애초에 예외 자체가 발생이 안되게끔 조건문으로 해결가능 (예외처리 아님)
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// ArithmeticException
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		//int result = num1 / num2; // 두번째 정수가 0일 경우 예외발생 => 비정상적으로 종료
		
		// 문제해결방법1. 애초에 예외 자체가 발생안되게끔 조건검사 => 예외처리 아님
		/*
		int result = 0;
		if(num2 !=0) {
			result = num1 / num2;
		}
		
		System.out.println("안녕하세요 반갑습니다. 당신의 결과를 알려드리겠습니다. ");
		System.out.println("result : " + result);
		*/
		
		// 문제해결방법2. 예외처리 구문을 작성하는 방법
		// * 예외처리 : 예외가 "발생했을 때" "처리"할 내용을 미리 작성해놓는 것
		/*
		 * try catch 방법
		 * 
		 * try { 
		 * 		예외가 발생될 수 있는 구문;
		 * } catch(발생될예외클래스 매개변수) {
		 * 		해당 예외가 발생됐을 경우 실행할 구문 미리 작성;
		 * }
		 * 
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();	// 현재 발생된 예외에 대한 이력을 강제로 보고자할 때
		}
		
		System.out.println("프로그램을 종료합니다.");
			
	}
	
	public void method2() {
		
		// NegativeArraySizeException
		// ArrayIndexOutOfBoundsException
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		//int[] arr = new int[size];
		//System.out.println("100번 인덱스 값 : " + arr[100]);
		
		// 문제해결방법1. 애초에 예외 자체가 발생이 안되게끔 조건검사
		if(size>0) {
			int[] arr = new int[size];
			
			if(size>100) {
				System.out.println("100번 인덱스 값: " + arr[100]);
			}
	
		}
		
		// 문제해결방법2. 예외처리 방법
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		} catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근할 수 없습니다.");
		}
		
		// 다중 catch블럭 작성 가능
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method3() {
		
		System.out.print("배열의 크기 : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		} catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근할 수 없습니다.");
		} catch(InputMismatchException e) {	// import 해줘야함 
			System.out.println("정수만을 입력해야됩니다.");
		}
		*/
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		} catch(NegativeArraySizeException e) {	// 다형성 적용해서 부모타입예외클래스 작성 가능
												// 모든 자식 예외 발생시 다 받아서 처리할 수 있음
												// 더 상위 무보 Exception 사용 가능
			System.out.println("음수가 아닌 양수로 배열의 크기지정해야됩니다.");
		} catch(RuntimeException e) {	
			System.out.println("예외가발생됐어.. 배열의 크기가 잘못됐거나, 부적절한 인덱스 제시했거나, 정수가 아닌값을 입력했을꺼야");
		} 
		
		// 부모예외클래스와 자식예외클래스를 가지고 catch 블록을 기술할 경우
		// 자식예외클래스 catch블록이 부모보다 위에 있어야됨 
		// NegativeArraySizeException e 과 RuntimeException e 자리를 바꾼다
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	/*
	 * * RuntimeException 관련 예외들은 UnCheckedException (예외처리구문이 필수는 아님)
	 *   if문(조건문) : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링하는 거 (예외처리구문 아님)
	 *   try-catch문 : 예외가 "발생됐을경우" 실행할 구문을 미리 작성해두는 거 (예외처리구문)
	 *   
	 *   예측가능한 상황은 if문과 같은 조건문으로 해결하는게 권장사항임
	 */
	
}
