package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		/*
		 * 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1미만의숫자가 입력됐다면 "잘못 입력하셨습니다."를 출력하세요
		 */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice2() {
		
		/*
		 * practice1() 문제와 동일하나, 1미만의 숫자가 입력됐다면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		 */
		
		while(true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				
				for(int i=1; i<=num; i++) {
					System.out.print(i + " "); 
				}
				
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다."); 
			}
			
		}
		
	}
	
	public void practice3() {
	
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다
		 */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice4() {
		
		/*
		 * practice3() 문제와 동일하나, 1미만의 숫자가 입력됐다면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		 */
		
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
		
		/*
		 * 1부터 사용자에게 입력받은 수까지의 정수들의 합을 출력하세요
		 */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
//		for(int i=1; i<=num; i++) {
//			//System.out.print(i);
//			sum +=  i ;
//			
//			if(num == i) {
//				System.out.printf("%d = %d ", i, sum);
//			} else {
//				System.out.printf("%d + ", i);
//			}
//		}
		
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
		
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
		 * 만일 1미만의 숫자가 입력됐다면 "1이상의 숫자만을 입력해주세요"를 출력하세요
		 */
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			
			if(num2 > num1) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i + " ");
				}
			}
			
		} else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
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
		
		/*
		 * practice6() 문제와 동일하나, 1미만의 숫자가 입력됐다면
		 * "1이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요 
		 */
		
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
			/*  int min=0; int max=0;
			 *  if(num < num2) {
			 *  	min = num2;
			 * 		max = num1;
			 *  } else {
			 *  	min = num1;
			 * 		max = num2;
			 *  }
			 // 이 과정을 간단하게 하는 식 
			  int min = Math.min(num1, num2);	// 두 수 중 작은 값 담기
			  int max = Math.max(num1, num2); // 두 수 중 큰 값 담기
			 // min max 밑 빨간줄 컨트롤 누르고 보면 
				
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
		
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요
		 */
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
	
		System.out.println("===== " + num + "단 =====");
	
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
		
	}
	
	public void practice9() {
		
		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요
		 * 단, 2~9 사이의 숫자가 아닌 경우 "2~9 사이의 숫자만 입력해주세요"를 출력하세요
		 */
		
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
			System.out.println("2~9사이의 숫자만 입력해주세요.");
		}
		
	}
	
	public void practice10() {
		
		/*
		 * practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
		 * "2~9 사이의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		 */
		
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
		
		/*
		 * 사용자로부터 시작 숫자와 공차를 입력 받아
		 * 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요
		 * 단, 출력되는 숫자는 총 10개입니다
		 */
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
		
	}

	public void practice12() {
	
		/*
		 * 정수 두 개와 연산자(문자열로 입력 받고) 입력된 연산자에 따라 알맞은 결과를 출력
		 * 단, 해당 프로그램은 연산자 입력에 "exit"이라는 값이 들어올 때까지 무한 반복하며 exit가 들어오면 
		 * "프로그램을 종료합니다."를 출력하고 종료합니다
		 * 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 
		 * "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력하며, 없는 연산자가 들어올시 "없는 연산자입니다. 다시 입력해주세요."라고 출력하고
		 * 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요
		 */
		
		/* 반복 {
		 * 		1. 연산자 입력받기
		 * 		>> 사용자가 입력한 연산자가 "exit"일 경우 => "프로그램을 종료합니다." 출력 후 반복문 종료
		 * 		2. 정수 두 개 입력받기
		 * 		>> 연산자가 / 거나 % 일 때 두번째 정수값이 0일 경우 => "0으로 나눌 수 없습니다. 다시 입력해주세요." 출력 후 반복문 다시 시작
		 * 		3. 연산기호에 따라 해당 연산 결과 출력
		 * }	>> 연산기호가 잘못입력됐을 경우 => "없는 연산자입니다. 다시 입력해주세요." 출력 후 반복문 다시 시작
		 */
		
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break; // return;
			} 
				
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); // 버퍼 비워주기
			
			if((str.equals("/") && num1 == 0) || (str.equals("%") && num2 == 0)) {
				//if((op.equals("/") || op.equals("%")) && num2 == 0) {	효율적
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n"); continue;
			}
			
			int result = 0;
			switch(str) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			case "%" : result = num1 % num2; break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.\n"); continue;
			}
			
			System.out.printf("%d %s %d = %d", num1, str, num2, result); return;
				
		}
		
	}
	
}