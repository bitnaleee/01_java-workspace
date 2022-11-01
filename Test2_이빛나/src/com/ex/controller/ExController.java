package com.ex.controller;

import java.util.Scanner;

import com.ex.model.vo.Bread;

public class ExController {

	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
			if(num > 0) {
				if(num % 2 == 0) {
					System.out.println("짝수다.");
				} else {
					System.out.println("홀수다.");
				}
				
			} else {
				System.out.println("양수가 아니다.");
			}
			
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			
			if(num1 > num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i + " ");
				}
				
			} else {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}
			
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		
	}
	
	public void ex3() { // 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num3 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num4 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+, -, x, X, /, %): ");
		String str = sc.nextLine();
		
			if((str.equals("/") || str.equals("%")) && num4 == 0) {
				System.out.println("0으로 나눌수 없습니다. 다시입력해주세요.\n");
				
			} else {
				
				int result = 0;
				switch(str) {
				case "+": result = num3 + num4; break;
				case "-": result = num3 - num4; break;
				case "x": result = num3 * num4; break;
				case "X": result = num3 * num4; break;
				case "/": result = num3 / num4; break;
				case "%": result = num3 % num4; break;
				default : System.out.println("연산자를 잘못 입력하였습니다. 프로그램을 종료합니다.\n"); return; 
				} 
				System.out.printf("%d %s %d = %d\n\n", num3, str, num4, result);
			}
			
	}	
		
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int num2 = sc.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int num3 = sc.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int num4 = sc.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int num5 = sc.nextInt();
		
		int[] arr = new int[5];

		for(int i=0; i<arr.length; i++) {
			System.out.print(i + " ");
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += i;
		}
		
		System.out.print("\n총합계 : " + sum);
	}
	
	public void ex5() {
		
		Bread b = new Bread();
		
		b.setBreadName("포켓몬빵");
		b.setBrand("삼립");
		b.setPrice(1500);
		b.setStock(0);
		
		System.out.println(b.information());
		
		b.setStock(20);
		
		System.out.println(b.information());
		
	}
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빵이름 : ");
		String breadName = sc.nextLine();
		System.out.print("브랜드 : ");
		String brand = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("재고 : ");
		int stock = sc.nextInt();
		
		Bread b2 = new Bread(breadName, brand, price, stock);
		
		System.out.print(b2.information());
		
	}
	
}
