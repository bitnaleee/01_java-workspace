package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		
		String result = num1 > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
		
		//--------------------------------------------------
		//System.out.print(num1 > 0 ? "양수다" : "양수가 아니다");
		
		System.out.print("\n");
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num2 = sc.nextInt();
		
		String result = (num2 > 0 ? "양수다" : (num2 < 0 ? "음수다" : "0이다"));
		System.out.println(result);
		//-----------------------------------------------------------------
		//System.out.print(num2 > 0 ? "양수다" : (num2 < 0 ? "음수다" : "0이다"));
		
		System.out.print("\n");
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num3 = sc.nextInt();
		
		String result = num3 % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
		
		//---------------------------------------------------
		//System.out.print(num3 % 2 == 0 ? "짝수다" : "홀수다");
		
		System.out.print("\n");
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : " );
		int candy = sc.nextInt();
		
		System.out.print("\n");
		
		int result1 = (candy / people);
		int result2 = (candy % people);
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남은 사탕 개수 : " + result2);
		
		// System.out.println("1인당 사탕 개수 : " + candy / people);
		//System.out.println("남는 사탕 개수 : " + candy % people);
		
		System.out.print("\n");
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double result = sc.nextDouble();
		
		System.out.println(grade + "학년 " + gradeClass + "반 " + num + "번 " + name + " " 
		+ (gender == 'M' ? "남학생" : "여학생") + "의 성적은 " + result + "이다.");
		
		
		//맞는지 모르겠다 System.out.printf("%d학년 %d반 %d번 %s %c의 성적은 %.2f이다.",
				//grade, gradeClass, num, name, gender, result);
		
		//답
		//String student = (gender == 'M'|| gender == 'm') ? "남학생" : "여학생";
		
		//System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", grade, classNum, num, name, student, score);
	
		System.out.print("\n");
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19 ? "청소년" : "성인");
		// String result = (age > 19) ? "성인" : (age > 13) ? "청소년" : "어린이");
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();	
				
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		System.out.print("\n");
		
		int sum = num1 + num2 + num3;
		double average = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		
		String result = ((num1 >= 40 && num2 >= 40 && num3 >= 40 && average >= 60) ? "합격" : "불합격");
		System.out.println(result);
		
		System.out.print("\n");
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : "); // 숫자와 문자 헷갈리지만 엄연히 문자
		char idCardNumber = sc.nextLine().charAt(7);
		
		System.out.print("\n");
		
		System.out.println(idCardNumber % 2 == 0 ? "여자" : "남자");
		
		// System.out.print("주민번호를 입력하세요(-포함) : ");
		// String str = sc.nextLine();
		// Char gender = str.charAt(7);
		// String result = (gender == '1' || gender == '3') ? "남자" : "여자";
		// System.out.println(result);
		
	}

}
