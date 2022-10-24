package com.br.homework.controller;

import java.util.Scanner;

public class Function {

	public void calculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자(+, -, x, /) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(sc.nextLine().equals('/') && num2 == 0) {
			System.out.println("0으로 나눌수 없습니다. 다시입력해주세요.\n");
		}// break;
		
		int result = 0;
		switch(ch) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
	//	case ('x' || 'X'): result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		default : System.out.println("없는 연산자입니다. 다시입력해주세요.\n");
	}		
		System.out.printf("%d %s %d = %d\n\n", num1, ch, num2, result);
	}
	
	public void totalCalculator() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		
		int min = Math.min(num1, num2);
		int max	= Math.max(num1, num2);
		
		int sum = 0;
		for(int i=min; i<=max; i++) {
			sum +=i;
		} 
		
		System.out.printf("%d부터 %d까지 정수들의 합 : %d", min, max, sum);
	
	}
	
	public void printProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		System.out.print("성격 : ");
		String nature = sc.nextLine();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + nature);
		
	}
	
	public void printScore() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반 : ");
		int group = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
		double grade = sc.nextDouble();
		
		if(grade>=90) {
			System.out.print("A");
		} else if (grade>=80) {
			System.out.print("B");
		} else if (grade>=70) {
			System.out.print("C");
		} else if (grade>=60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
		
		System.out.printf("%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f이고 학점입니다.", year, group, num, gender, name, grade);
		
	}
	
	public void printStarNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		while(true) {
			if(num>0) {
				for(int i=1; i<=num; i++) {
					for(int j=1; j<=num; j++) {
						
						if(j==num) {
							System.out.print(num);
						} else {
							System.out.print("*");
						}
					}
				}
			} else {
				System.out.print("양수가 아닙니다.");
			}
		
		}
		
	}
	
	public void sumRandom() {
		
		int sum = 0;
		while(true) {
			int random = (int)(Math.random() * 100 + 1);
			sum +=random;
			System.out.print("1부터 " + random + "까지의 합 : " + sum);
			break;
		} 
	}
	
	public void exceptGugu() {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			
			for(int i=num; i<=num; i++) {
				break;
				for(int j=1; j<=9; j++) {
					
					if(j % num == 0) {
						break;
					} else {
						System.out.printf("%d * %d = %d", i, j, i*j);
					}	
				}	
			}
	}
	*/
	
	}
	
	public void diceGame() {
		
		
		
		
	}
	
	
	
}
