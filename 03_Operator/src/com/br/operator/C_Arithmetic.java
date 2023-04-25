package com.br.operator;

public class C_Arithmetic {	
	
	/*
	 * * 산술연산자 (이항연산자 == 두개의 값을 가지고 연산)
	 *   + - *  / % 
	 *    
	 *   *  / %   >  + -
	 *   
	 */
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 X num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));	// 오류 > 분모가 0일 수 없음 
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		// 값 % 2 == 0 라는 건 짝수란 소리
		// 값 % 2 == 1 라는 건 홀수란 소리
		
		// 값 % 5 == 0 라는 건 5의 배수란 소리
		
	}
	
	public void quiz() { 
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;	// a=6, b=10, c=16
		int d = c / a; // a=6, b=10, c=16, d=2
		int e = c % a; // a=6, b=10, c=16, d=2, e=4
		int f = e++; // a=6, b=10, c=16, d=2, e=4(5), f=4
		int g = (--b) + (d--); // a=6, b=9, c=16, d=2(1), e=5, f=4, g=11
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		
		// a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
		
		// a=6(7), b=9, c=15, d=1, e=6, f=4, g=11(10), h=2 
		
		// 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		// 6 + 9 / 3 * 10 % 8
		// 6 + 3 * 10 % 8
		// 6 + 6 => 12
		
		System.out.println("a : " + a); // 7
		System.out.println("b : " + b); // 9
		System.out.println("c : " + c); // 15
		System.out.println("d : " + d); // 1
		System.out.println("e : " + e); // 6
		System.out.println("f : " + f); // 4
		System.out.println("g : " + g); // 10
		System.out.println("h : " + h); // 2
		System.out.println("i : " + i); // 12
		
		
		
	}

}
