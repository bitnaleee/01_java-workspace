package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc =  new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				} 
				
				break;
			
			} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	public void practice3() {
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			
			for(int i=num; i > 0; i--) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	
	}
	
	public void practice4() {
		
		Scanner sc =  new Scanner(System.in);
		
		
		while(true) { 
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
		
			if(num>=1) {
			
				for(int i=num; i > 0; i--) {
					System.out.print(i + " ");
				}
			
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		
		}
		
	}
	
	public void practice5() {
		
		/*Scanner sc =  new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0; 
		for(int i=1; i<=num; i++) {
				
			
				
			System.out.print(i+1);
			
			if (i + 1 == num) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
			
			System.out.println(sum);
			
		}
		*/
	}
	
	public void practice6() {
	
		/*
		Scanner sc =  new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num >= 1 ) {
			
			if(num < num2) {
				for(int i=num; i<=num2; i++) {
					System.out.print(i + " ");
				}	
			} else {
				for(int i=num2; i<=num; i++) {
					System.out.print(i + " ");
			}
			
		} else {
			System.out.print("1이상의 숫자만을 입력해주세요");
		}
		*/
		
	}
	
	public void practice8() {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {
	
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
			
		} else {
			System.out.println("다시 입력해주세요");
		}
		
	}
	
	public void practice9() {
		/*
		Scanner sc =  new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {
			
			for (int j=num; j<=9; j++) > num~9단까지 반복
			
			for(int num=2; num<=9; num++) {
				System.out.println("=== " + num + "단 ===");  > num 이름 출력 
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d\n", num, i, num*i); > num 구구단 X i
			}  
				
			}
			
		} else {
			System.out.println("2~9사이의 숫자만 입력해주세요");
		}
		*/
		
	}
	
	public void practice11() {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		
	}
	
}
