package com.ex.controller;

import java.util.Scanner;

public class ExController {
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력 하시오 : ");
		int num2 = sc.nextInt();
	
		System.out.println("두 정수의 합 : " + (num1 + num2));
		System.out.println("두 정수의 차 : " + (num1 - num2));
		System.out.println("두 정수의 곱 : " + (num1 * num2));
		System.out.println("두 정수의 나누기한 몫 : " + (num1 / num2));
		
		System.out.print("\n");
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서명 : ");
		String book = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String name= sc.nextLine();
		
		System.out.print("\n");
		
		
		System.out.printf("구입하신 책의 이름은 %s입니다. 가격은 %d원이고, 출판사는 %s입니다." + "\n", book, price, name);
		
		System.out.print("\n");
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 하시오 : ");
		int num3 = sc.nextInt();
		System.out.print("실수를 입력 하시오 : ");
		double num4 = sc.nextDouble();
		
		int result = num3 + (int)num4 ;
		System.out.println("두 수의 합: " +(result));
		
		System.out.print("\n");
		
	
	}
	
	public void ex4() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력 하시오 : ");
		int grade1 = sc.nextInt();
		System.out.print("수학점수를 입력 하시오 : ");
		int grade2 = sc.nextInt();
		System.out.print("영어점수를 입력 하시오 : ");
		int grade3 = sc.nextInt();
		
		int sum = (grade1 + grade2 + grade3);
		double average = (sum / 3);
		
		System.out.println("세 점수의 합계 : " + sum);
		System.out.println("세 점수의 평균 : " + average);
		
		System.out.print("\n");
		
	}
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			System.out.print("프로그램을 종료합니다.");
		} else {
			System.out.print("프로그램을 계속 진행합니다.");
		} 
		return;
		
		
		
	}
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학원명 : ");
		String name = sc.nextLine();
		
		System.out.print("강의실 : ");
		int num5 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("이름 : ");
		String myName = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.printf("%s 학원 %d 강의실에서 수강중인 %d살 %c자 %s님 환영합니다~", name, num5, age, gender, myName);
		
		
		
	}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 하시오 : ");
		int num8 = sc.nextInt();
		System.out.print("정수를 입력 하시오 : ");
		int num9 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("+ 또는 - 또는 * 을 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = "";
		
		if(ch == '+' || ch == '-' || ch == '*') {
			
			if(ch == '+') {
				System.out.print("두 정수의 합 : " + (num8 + num9));
			} else if (ch == '-') {
				System.out.print("두 정수의 차 : " + (num8 - num9));
			} else if (ch == '*') {
				System.out.print("두 정수의 곱 : " + (num8 * num9));
			}
			
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		} return;
		
		
	}
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 하시오 : ");
		int num8 = sc.nextInt();
		System.out.print("정수를 입력 하시오 : ");
		int num9 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("+ 또는 - 또는 * 을 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = "";
		
		switch(ch) {
		case'+' : System.out.println("두 정수의 합 : " + (num8 + num9)); 
				 break;
		case'-' : System.out.println("두 정수의 차 : " + (num8 - num9)); 
				 break;
		case'*' : System.out.println("두 정수의 곱 : " + (num8 * num9)); 
				 break;
		default : System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
	}
	
}