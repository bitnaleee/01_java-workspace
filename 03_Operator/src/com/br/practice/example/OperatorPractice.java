package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		
		String result = num1 > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
		
		System.out.print("\n");
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num2 = sc.nextInt();
		
		String result = (num2 > 0 ? "양수다" : (num2 < 0 ? "음수다" : "0이다"));
		System.out.println(result);
		
		System.out.print("\n");
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num3 = sc.nextInt();
		
		String result = num3 % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
		
		System.out.print("\n");
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num4 = sc.nextInt();
		System.out.print("사탕 개수 : " );
		int num5 = sc.nextInt();
		

		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남은 사탕 개수 : " + result2);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.println("반(숫자만) : ");
		int c = sc.nextInt();
		
		System.out.println("번호(숫자만) : ");
		int number = sc.nextInt();
		
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double grade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f이다.", group, c, number, grade);
		
		
		
		
		
		
		
		
	}
	
	
	
}
