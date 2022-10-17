package com.br.practice.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.printf("키 %.1f인 %d살 %s자 %s님 반갑습니다^^", height, age, gender, name);
		
		System.out.println("\n");
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int number1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int number2 = sc.nextInt();
	
		System.out.print("더하기 결과 : ");
		System.out.println(number1 + number2);
		//System.out.println("더하기 결과 : " + (number1 + number2)); 괄호로 묶기
		
		System.out.print("빼기 결과 : ");
		System.out.println(number1 - number2);
		//System.out.println("빼기 결과 : " + (number1 - number2)); 괄호로 묶기
		
		System.out.print("곱하기 결과 : ");
		System.out.println(number1 * number2);
		//System.out.println("곱하기 결과 : " + number1 * number2); 
		
		System.out.print("나누기 몫 결과 : ");
		System.out.print(number1 / number2);
		//System.out.println("곱하기 결과 : " + number1 / number2); int/int = int 10/4 = 2
		
		System.out.println("\n");
		
	}
	
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double number3 = sc.nextDouble();
		
		System.out.print("세로 : ");
		double number4 = sc.nextDouble();
		
		System.out.print("\n");
		
		System.out.print("면적 : ");
		System.out.println(number3 * number4);
		
		System.out.print("둘레 : ");
		System.out.println((number3 + number4) * 2);
		
		// 면접과 둘레를 각각 구해 각 변수에 담아둔 후 출력하는 방법
		// double area = number3 * number4;
		// double perimeter = (number3 + number4);
		// System.out.println("면적 : " + area);
		// System.out.println("둘레 : " + perimeter);
		
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		System.out.print("첫 번째 문자 : ");
		System.out.println(fruit.charAt(0));
		
		System.out.print("두 번째 문자 : ");
		System.out.println(fruit.charAt(1));
		
		System.out.print("세 번째 문자 : ");
		System.out.print(fruit.charAt(2));
		// 문자열로 부터 각 문자값을 뽑아서 각 char 변수에 담아둔 후 출력하는 방법
		// char ch1 = str.charAt(0);
		// char ch2 = str.charAt(1);
		// char ch3 = str.charAt(2);
		
		// System.out.println("첫 번째 문자 : " + ch1);
		// System.out.println("두 번째 문자 : " + ch2);
		// System.out.println("세 번째 문자 : " + ch3);
		
	}
	

}
