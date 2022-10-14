package com.br.variable;

import java.util.Scanner;

public class B_KeyboardInput {

	public void inputScanner1() {
		
		/*
		 *  자바에서 제공하고 있는 java.util.Scanner 클래스의 메소드를 호출해서
		 *  사용자가 키보드로 입력한 값을 읽어들일 수 있음
		 *  
		 *  다른 클래스에 있는 메소드 호출시에는
		 *  1) 클래스 생성
		 *  2) 메소드 호출
		 */
		Scanner sc = new Scanner(System.in);	// Scanner라는 클래스가 없어서 처음에는 빨간줄, System in 사용자가 입력한 값을 바이트로 입력받겠다
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// 사용자가 입력한 값을 문자열로 읽어들이는 메소드 (next(), nextLine())
		//String name = sc.next();	// sc.next(공백이전) 사용자가 입력하기를 기다리는중..
		String name = sc.nextLine();	// 사용자가 입력한 한 줄 다 읽어들임
		
		System.out.print("당신의 나이는 몇살입니까(숫자만) : ");
		int age = sc.nextInt();	// 사용자가 입력한 값을 정수값으로 읽어들임
		
		System.out.print("당신의 키는 몇입니까(cm단위, 소수점 첫째 자리까지만) : ");
		double height = sc.nextDouble();	// 사용자가 입력한 값을 실수값으로 읽어들임
		
		// xxx님은 xx살이며, 키는 xxx.xcm입니다.
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm입니다.");

		
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();	// 버퍼에 남아있는 엔터를 지우기 위함
	
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는 곳은 xxxxxx이고, 키는 xxx.xcm입니다.
		System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " 
		+ address + "이고, 키는 " + height + "cm입니다.");
		
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm입니다.", name, age, address, height);
		
		
		/*
		 * sc.nextLine() : 값을 가져온 후에 '엔터'를 비워주는 역할
		 * 그 외의 메소드(next, nextInt, ...) : 값을 가져온 후 '엔터'를 비워주지 않음
		 * 
		 * 그 외의 메소드 뒤에 nextLine()이 오게 될 경우
		 * 버퍼에 남아있는 '엔터'를 nextLine()이 인식해서 사용자가 값을 입력했다고 인지
		 * => 곧바로 읽어들임
		 * 
		 * 해결방법 : 그 외의 메소드 뒤에 sc.nextLine()이 오게될 경우 
		 *          버퍼에 남아있는 '엔터'를 비워줘야됨
		 *          => sc.nextLine()메소드를 한 번 더 써주자
		 */
		
		}
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력받을 때 => sc.nextLine()
		// 정수값 입력받을 때 => sc.nextInt()
		// 실수값 입력받을 때 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextChar();
		
		// 문자값을 읽어들이고자 할 경우
		// 먼저 문자열로 읽어들인 후 특정인덱스의 문자 하나만 추출
		char gender = sc.nextLine().charAt(0);
		// 문자열.charAt(뽑고자하는인덱스); => 해당 문자열로부터 해당인덱스의 문자 하나를 추출
		
		// 나이, 키
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age + "살");
		System.out.println("키 : " + height + "cm");
		
	}
	
	public void charAtTest() {
		
		String fruit = "apple";	// 5글자 (0~4)
		char ch = fruit.charAt(0); // 'a'
		System.out.println(ch);
		System.out.println(fruit.charAt(1));
		// 문자열의 부적절한 인덱스 접근시
		// ==> StringIndexOutofBoundsException
		
	}
	
	public void pratice() {
		
		// 사용자에게 상품명(String), 브랜드명(String), 가격(int)
		// 제조국(String), 할인율(double), 등급(A~D)(char)
		// 순으로 입력받은 후 출력해보기 (출력형식은 자유)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 상품등록화면 =====");
		System.out.println("등록하고자 하는 상품의 정보를 입력하시오.");
		
		
		System.out.print("상품명 : ");
		String productName = sc.nextLine();
		
		System.out.print("브랜드명 : ");
		String brand = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();	// 버퍼에 남아있는 엔터 비우기
		
		System.out.print("제조국 : ");
		String country = sc.nextLine();
		
		System.out.print("할인율 : ");
		double discountRate = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("등급(A~D) : ");
		char grade = sc.nextLine().charAt(0);

		System.out.println("\n상품명 : " + productName);
		System.out.println("\n브랜드명 : " + brand);
		System.out.println("\n가격 : " + price + "원");
		System.out.println("\n제조국 : made in " + country);
		System.out.println("\n할인율 : " + (int)(discountRate * 100) + "%");
		System.out.println("\n등급(A~D) : " + grade + "급");
		
		
		
	}
	
	
	
	
	
	
	
}
