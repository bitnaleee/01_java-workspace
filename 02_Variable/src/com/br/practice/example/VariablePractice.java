package com.br.practice.example;

import java.util.Scanner;

public class VariablePractice {

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이을 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, ch, name);
		
	}
	
	public void method2() {
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("\n더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + num1 * num2);
		System.out.println("나누기 몫 결과 : " + num1 / num2);
	
	}
	
	public void method3() {
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("\n면적 : " + (width * height));
		System.out.println("둘레 : " + (width + height) * 2);
	
	}
	
	public void method4() {
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("\n첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		
	}
	
}
