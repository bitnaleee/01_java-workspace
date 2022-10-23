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
			
			for(int i=num; i>=1; i--) {
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
			
				for(int i=num; i>=1; i--) {
					System.out.print(i + " ");
				}
			
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		
		}
		
	}
	
	public void practice5() {
		
		Scanner sc =  new Scanner(System.in);
		 
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0; 
		
		for(int i=1; i<=num; i++) { // i값이 1에서부터 사용자가 입력한 수까지 1씩 증가하는 동안 반복
		
			sum +=i; // 매번 sum 변수에 누적해서 더해줌 (총 합계구하는 구문)
			
			if(i<num) { // 출력하고자 하는 i 값이 num보다 작을 때 까지는 해당 숫자 뒤에 '+' 붙여가면서 출력
				System.out.print(i + " + ");
			} else { 	  // 그게 아닐 경우(즉, 출력하고자 하는 i값이 num이 될 경우) 그땐 마지막으로 '=' 붙여서 출력
				System.out.print(i + " = ");
			}
		}
		
		System.out.println(sum);
		
	}
	
	public void practice6() {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num>=1 && num2>=1) {
			
			if(num < num2) {
				for(int i=num; i<=num2; i++) {
					System.out.print(i + " ");
				}	
			} else {
				for(int i=num2; i<=num; i++)
					System.out.print(i + " ");
			}
			
		} else {
			System.out.print("1이상의 숫자만을 입력해주세요");
		}

	}
	/*
	   1) 두 수를 가지고 최소값, 최대값을 알아내야됨!!
	   int min = 0; // 두 수중에 작은 값을 기록하기 위한 변수
			int max = 0; // 두 수중에 큰 값을 기록하기 위한 변수
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
	   int min = Math.min(num1, num2);
	   int max = Math.max(num1, num2);
	 
	   2) 최소값에서부터 최대값까지 매번 1씩증가하는 값을 출력
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
	 */
	
	public void practice7() {
		
		Scanner sc =  new Scanner(System.in);
		
		while(true) {
			
		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num>=1 && num2>=1) {
			
			if(num < num2) {
				for(int i=num; i<=num2; i++) {
					System.out.print(i + " ");
				}	
			} else {
				for(int i=num2; i<=num; i++)
					System.out.print(i + " ");
			}
			
			/* 
			  int min = Math.min(num1, num2);	// 두 수 중 작은 값 담기
			  int max = Math.max(num1, num2); // 두 수 중 큰 값 담기
				
			  for(int i = min; i <= max; i++) {
			  	System.out.print(i + " ");
			  }	
			*/
			break;
				
			} else {
				System.out.print("1이상의 숫자만을 입력해주세요\n");
			}
		}
	}
	
	public void practice8() {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
			System.out.println("===== " + num + "단 =====");
			for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
			
	}
	
	public void practice9() {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
	
		if(num >= 2 && num <= 9) {
				
			for(int i=num; num<=9; num++) {
				System.out.println("===== " + num + "단 =====");
				for(int j=1;j<=9;j++) {
					System.out.printf("%d * %d = %d\n", num, j, num*j);
				}
			} 
			
		} else {
			System.out.println("2~9사이의 숫자만 입력해주세요");
		}
		
	}
	
	public void practice10() {
		
		Scanner sc =  new Scanner(System.in);
		
		while(true) {
			
		System.out.print("숫자 : ");
		int num = sc.nextInt();

			if(num >= 2 && num <= 9) {
				
				for(int i=num; num<=9; num++) {
					System.out.println("===== " + num + "단 =====");
					for(int j=1;j<=9;j++) {
						System.out.printf("%d * %d = %d\n", num, j, num*j);
					}
				} 
				
				break;
				
			} else {
				System.out.println("2~9사이의 숫자만 입력해주세요");
			}
		}
	}
	
	public void practice11() {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		// start값에서부터 매번 num씩 증가되는 값을 출력 (10번만!!)
		for(int i=1; i<=10; i++) { // 단지 반복문을 총 10회 반복시키고자 해서
			System.out.print(start + " ");
			start += num;
		}
	
	}

	public void practice12() {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine(); //"+""-"...exit
			// >> 사용자가 입력한 연산자가 "exit"일 경우 => "프로그램을 종료합니다." 출력 후 반복문 종료
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("첫 번째 정수 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); // 버퍼를 깔끔하게 비워줌 
		
			// 연산자가 "/" 거나 "%" 일때 두번째 정수값이 0일 경우 => "0으로 나눌수 없습니다. 다시입력해주세요." 출력 후 반복문 다시 시작
			if((op.equals("/") || op.equals("%")) && num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 다시입력해주세요.\n");
			continue;
			}
			
			int result = 0;
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			default : System.out.println("없는 연산자입니다. 다시입력해주세요.\n"); continue;
			}
				System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
			
		}
		
		
	}
	
}