package com.ex.controller;

import java.util.Scanner;

public class ExController {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		/*
		 * 사용자에게 두 개의 정수를 입력받아 해당 두 정수의 합, 차, 곱, 나누기한 몫을 출력하는 기능을 구현하시오
		 */
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
	
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		System.out.println("나누기한 몫 : " + (num1 / num2));
		
	}
	
	public void ex2() {
		
		/*
		 * 사용자에게 도서명(String), 가격(int), 출판사(String)에 대한 정보를
		 * 순서대로 입력받아 변수에 대입한 후 출력하는 기능을 구현하시오
		 */
		System.out.print("도서명 : ");
		String bookName = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		System.out.printf("\n입력하신 도서명은 %s이며, 가격은 %d원이며, 출판사는 %s입니다.", bookName, price, publisher);
		
	}
	
	public void ex3() {
		
		/*
		 * 사용자에게 한 개의 정수와 한 개의 실수을 입력 받아 각 변수에 기록한 후 
		 * 두 수의 합을 새로운 "int형 변수"에 대입하여  출력하시오
		 */
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.print("실수 : ");
		double num2 = sc.nextDouble();
		
		int sum = num + (int)num2;
		
		System.out.println("합 : " + sum);
		
	}
	
	public void ex4() {
		
		/*
		 * 사용자에게 국어점수(int), 수학점수(int), 영어점수(int)를 입력받은 후 세 점수의 합계(정수형식)과 평균(실수형식)을 출력하는 기능을 구현하시오
		 */
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		System.out.println("\n세 점수의 합계 : " + sum);
		System.out.println("세 점수의 평균 : " + avg);
				
	}
	
	public void ex5() {
		
		/*
		 * 사용자에게 "종료하시려면 y를 입력해주세요 : "를 먼저 출력하여 종료의사여부를 입력받은 후 
		 * 이때 입력 받은 값이 영문 y 또는 Y일 경우 "프로그램을 종료합니다." 가 출력되고
		 * 만일 그게 아닐 경우 "프로그램을 계속 진행합니다." 출력이 될 수 있도록 기능을 구현하시오
		 */
		
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		// System.out.println(ch == 'y' || ch == 'Y' ? "프로그램을 종료합니다." : "프로그램을 계속 진행합니다.");
		
		if(ch == 'y' || ch == 'Y') {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("프로그램을 계속 진행합니다.");
		}
		
	}
	
	public void ex6() {
		
		/*
		 * 사용자에게 학원명(String), 강의실(int), 이름(String), 나이(int), 성별(char, 남/여)을 순서대로 입력받아 변수에 대입한 후 아래의 형식대로 출력하는 기능을 구현하시오
		 * ex) 구디아카데미 학원 9 강의실에서 수강중인 28살 여자 홍길녀님 환영합니다~  
		 * 이 때, 마지막 출력문은 System.out.printf 구문을 이용하여 반드시 작성하시오
		 */
		
		System.out.print("학원명 : ");
		String academy = sc.nextLine();
		
		System.out.print("강의실 : ");
		int acClass = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.printf("\n%s 학원 %d 강의실에서 수강중인 %d살 %s자 %s님 환영합니다~", academy, acClass, age, gender, name);
		
	}
	
	public void ex7() {
		
		/*
		 * 사용자에게 두 개의 정수, 한 개의 연산자(+ 또는 - 또는 *)을 입력 받아 변수에 대입한 후 
		 * 연산자가 + 일 경우 두 정수의 합, - 일 경우 두 정수의 차, * 일 경우 두 정수의 곱 한 결과를 출력하시오 
		 * 만일 연산자가 +,-,* 이 아닐 경우 "연산자를 잘못 입력하셨습니다." 라고 출력하시오
		 * 이 때 if문을 이용하여 푸시오
		 */
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자(+/-/*) : ");
		char ch = sc.nextLine().charAt(0);
		
		/*
		if(ch == '+') {
			System.out.println("두 정수의 합 : " + (num1 + num2));
		} else if(ch == '-') {
			System.out.println("두 정수의 차 : " + (num1 - num2));
		} else if(ch == '*') {
			System.out.println("두 정수의 곱 : " + (num1 * num2));
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		*/
		
		if(ch == '+' || ch == '-' || ch == '*') {
			
			if(ch == '+') {
				System.out.print("두 정수의 합 : " + (num1 + num2));
			} else if (ch == '-') {
				System.out.print("두 정수의 차 : " + (num1 - num2));
			} else if (ch == '*') {
				System.out.print("두 정수의 곱 : " + (num1 * num2));
			}
			
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		} return;
		
	}
	
	public void ex8() {
		
		/*
		 * 위의 문제7의 내용을 if문이 아닌 switch문을 이용하여 푸시오
		 */
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자(+/-/*) : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = "";
		switch(ch) {
		case '+': System.out.println("\n두 정수의 합 : " + (num1 + num2)); break;
		case '-': System.out.println("\n두 정수의 차 : " + (num1 - num2)); break;
		case '*': System.out.println("\n두 정수의 곱 : " + (num1 * num2)); break;
		default : System.out.println("연산자를 잘못입력하셨습니다.");
		}
		
	}
	
}