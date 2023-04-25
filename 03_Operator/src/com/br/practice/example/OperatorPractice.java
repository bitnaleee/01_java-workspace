package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		//String result = num > 0 ? "양수다" : "양수가 아니다";
		//System.out.println("\n" + result);
		
		System.out.println("\n" + (num > 0 ? "양수다" : "양수가 아니다"));
		
	}
	
	public void practice2() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println("\n" + (num > 0 ? "양수다" : (num < 0 ? "음수다" : "0이다")));
		
	}
	
	public void practice3() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println("\n" + (num % 2 == 0 ? "짝수다" : "홀수다" ));
		
	}
	
	public void practice4() {
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("\n1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
		
	}
	
	public void practice5() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int gradeClass = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String student = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double result = sc.nextDouble();
		
		System.out.printf("\n%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, gradeClass, num, name, student, result);
		
	}
	
	public void practice6() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age > 19 ? "성인" : "청소년");
		System.out.println("\n" + result);
		
	}
	
	public void practice7() {
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();	
				
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double average = sum / 3.0;
		
		System.out.println("\n합계 : " + sum);
		System.out.println("평균 : " + average);
		
		String result = ((num1 >= 40 && num2 >= 40 && num3 >= 40 && average >= 60) ? "합격" : "불합격");
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		
		System.out.println("\n" + ((num == '2' || num == '4') ? "여자" : "남자"));
		
	}
	
}
