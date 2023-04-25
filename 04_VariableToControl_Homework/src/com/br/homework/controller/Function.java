package com.br.homework.controller;

import java.util.Scanner;

public class Function {

	public void calculator() {
		
		/*
		 * 정수 두 개와 연산자 하나를 키보드로 입력 받아 두 정수는 int변수에, 연산자는 char에 저장
		 * 연산문자가 +이면 두 정수의 합 계산, -이면 두 정수의 차 계산, x 또는 X이면 두 정수의 곱, /이면서 나누는 수(두번째 수)가 0이면 "0으로 나눌 수 없습니다." 
		 * 출력하고 결과 값은 0으로 처리
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+, -, x, /) : ");
		char ch = sc.nextLine().charAt(0);

		int result = 0; // 결과 보관할 변수
		switch (ch) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case 'x': case 'X': result = num1 * num2; break;
		case '/':
			if(num2 == 0) {
				System.out.print("0으로 나눌 수 없습니다.\n");
			} else {
				result = num1 / num2;
			}
		}
		
		System.out.printf("%d %c %d = %d\n\n", num1, ch, num2, result);
	
	}
	
	public void totalCalculator() {
		
		/*
		 * 키보드로 정수 두 개를 입력 받아 두 정수 중 작은 값을 시작 값으로 큰 값을 종료 값으로 사용
		 * 작은 값에서 큰 값까지 정수 합계를 구함
		 */
		
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
		
		System.out.printf("%d부터 %d까지 정수들의 합 : %d\n\n", min, max, sum);
	
	}
	
	public void printProfile() {
		
		/*
		 * 신상 정보들을 자료형에 맞춰 변수에 기록하고 변수에 기록된 값 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		System.out.print("성격 : ");
		String personality = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + personality + "\n");
		
	}
	
	public void printScore() {
		
		/*
		 * 키보드로 입력 받은 값들을 변수에 기록하여 변수 값을 화면에 출력
		 * 점수가 90점 이상이면 A학점, 80이상 90미만이면 B, 70점이상 80미만이면 C, 60이상 70미만 D, 60미만 F학점을 매김
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		char result = 'F';

		if (score >= 90) {
			result = 'A';
		} else if (score >= 80) {
			result = 'B';			
		} else if (score >= 70) {
			result = 'C';
		} else if (score >= 60) {
			result = 'D';
		} 
		
		String student = "";
		if (gender == 'M') {
			student = "남학생";
		} else {
			student = "여학생";
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c학점입니다.\n\n", 
				grade, classNum, num, student, name, score, result);

	}
	
	public void printStarNumber() {
		
		/*
		 * 정수를 하나 입력받아 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 아래와 같이 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
				
			for(int i=1; i<=num; i++) {
				for(int j=1; j<i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
			
		} else {
			System.out.println("양수가 아닙니다.");
		}
		
		System.out.println();
		
	}
	
	public void sumRandom() {
		
		/*
		 * 1부터 100사이의 정수 중 임의의 정수를 하나 발생시켜 1부터 랜덤 수까지의 합계 출력
		 */
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		for (int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합 : %d\n\n", random, sum);
		
	}
	
	public void exceptGugu() {
		
		/*
		 * 정수를 하나 입력 받아 그 수가 양수일 때만 그 수의 구구단 출력
		 * 단 곱하기 수가 입력 받은 단의 배수일 경우 출력 제외
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		
		if(dan > 0) {
			for(int su=1 ; su<=9 ; su++) {
				if(su % dan != 0) {
					System.out.println(dan + " * " + su + " = " + dan*su);
				}
			}
			
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
		System.out.println();
	
	}
	
	public void diceGame() {
		
		/*
		 * 두 개의 주사위가 만들어낼 수 있는 모든 경우의 수를 랜덤으로 정하고
		 * 랜덤으로 정해진 두 주사위 눈의 합이 입력된 수와 같은 경우 "맞췄습니다" 출력,
		 * 입력 값과 다르면 "틀렸습니다" 출력하여 맞출 때까지 반복
		 * 값을 맞추면 "계속 하시겠습니까(y/n): "가 출력되고
		 * 'y'또는'Y' 입력시 새로운 랜덤 수가 정해지고 처음부터 다시 시작, 'n' 또는 'N' 입력시 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int num1 = (int)(Math.random() * 6 + 1);
			int num2 = (int)(Math.random() * 6 + 1);
			int sum = num1 + num2;
			
			while(true) {
				System.out.print("주사위 두개의 합을 맞춰보세요(2~12입력) : ");
				int user = sc.nextInt();
				
				if(sum == user) {
					System.out.println("정답입니다.");
					break;
				}else {
					System.out.println("틀렸습니다.");
				}
			}
			
			sc.nextLine();
			System.out.println("주사위의 합 : " + sum);
			System.out.print("계속 하시겠습니까?(y/n) : ");
			
			if(sc.nextLine().equalsIgnoreCase("n")){ // equalsIgnoreCase() : 대소문자 가리지 않고 동등비교
				System.out.println("종료합니다.\n");
				break;
			}
			
		}
	}

}

