package com.br.array;

import java.util.Scanner;

public class A_Array {

	/* 
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음
	 * 		 단, "같은 자료형의 값"으로만 담을 수 있음
	 */
	
	public void method1() {
		
		// * 배열을 안썼을 경우
		// 변수라는 것만 이용하게 되면 => 대량의 데이터들을 보관하고자 할 경우 각각의 변수를 만들어서 따로 관리
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(numi(x) num + i (x));
		}
		
		// 출력시에도 일일히 출력해야됨 (반복문 활용 불가)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		 총 합을 구할 때도 일일히 더해줘야됨 (반복문 활용 불가)
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		/* 
		 * 1. 배열 선언
		 * 	  자료형 배열명[];
		 *    자료형[] 배열명;
		 */
		
		// int a; // 변수 선언
		//int arr[];
		//int[] arr; // 선생님이 주로 쓰시는 방법
		
		/*
		 * 2. 배열 할당 (몇 개의 값들을 보관할껀지 크기 지정하는 과정 => 그 갯수만큼의 방이 만들어짐)
		 * 	  배열명 = new 자료형[배열크기]
		 */
		
		//arr = new int[5]
		
		// ** 배열 선언과 동시에 할당 **
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입 (배열의 특정위치의 방에 값을 대입)	
		 *    배열명[인덱스] = 값;	
		 */
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// 배열 장점 : 반복문을 활용 할 수 있음
		for(int i=0; i<5; i++) {
			arr[i] = i;	
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		...
		*/
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		//System.out.println(arr); // 실제 arr에는 "주소값"이라는게 담겨있음
	
	}
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		System.out.println(i);
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		
		System.out.println(dArr);
		//  배열의 자료형 + @ + 주소값의 16진수형태
		
		/*
		 *  실제 리터럴값을 곧바로 담을 수 있는 변수를 일반 변수라고 얘기하고
		 *  주소값을 담고있는 변수를 참조 변수(레퍼런스 변수)라고 표현
		 *  
		 *  기본자료형(boolean, char, byte, short, int, long, float, double)으로 선언된 변수
		 *  => 실제 리터럴값을 바로 담는 변수 => 일반 변수
		 *  
		 *  그 외 자료형(int[], double[], char[], short[], ... String, Scanner, ...)으로 선언된 변수
		 *  => 주소값을 담는 변수 => 참조 변수(레퍼런스 변수)
		 */
		
		// 배열 선언 및 크기지정까지만 한 상태
		for(int j=0; j<5; j++) {
			System.out.println(iArr[j]);
		}
		
		for(int j=0; j<3; j++) {
			System.out.println(dArr[j]);
		}
		
		// 각 인덱스에 직접 값 대입하지 않아도
		// 초기화 되어있음! 왜?
		// => Heap에는 빈공간이 존재할 수 없음
		// => JVM이 기본값을 초기화(대입)해줌
		
	}
	
	public void method3() {
		
		int[] arr = new int[30]; // 숫자를 바꿀때마다 바꿔야되는 번거로움 > arr.length 
		
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		
		for(int i=0; i<5; i++) {
			arr[i] = i + 1;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println(arr); // 배열의 자료형 + @ + 주소값의 16진수형태
		System.out.println(arr.hashCode()); // 주소값의 10진수형태
		
	}
	
	public void method4() {
		
		int result = 0;
		double d = 0.0;
		
		int[] arr = null; // 참조변수의 기본값 null : 아무것도 참조하고 있지 않음
		// 주소값을 담는 레퍼런스 변수의 기본값은 null
		
		System.out.println(arr);
		
		// null인 상태로 메소드를 호출한다거나 어딘가에 접근하고자 할 경우
		// 오류발생 => "NullPointerException"
		//System.out.println(arr.hashCode()); 
		//System.out.println(arr.length); 
		//System.out.println(arr[0]);
		
	}
	
	public void method5() {
		int[] arr = new int[5];
		
		/*
		 *  arr[0] = 2;		2 * (0 + 1)
		 *  arr[1] = 4; 	2 * (1 + 1)
		 *  arr[2] = 6; 	2 * (2 + 1)
		 *  arr[3] = 8; 	2 * (3 + 1)
		 *  arr[4] = 10; 	2 * (4 + 1)
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2 * (i + 1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		/*
		 * ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스 제시시 발생
		 * 
		 * arr[5] = 12;
		 * arr[6] = 14;
		 * 
		 */
		
		// * 배열의 가장 큰 단점
		// 한번 지정된 배열의 크기는 변경이 불가
		// => 새로운 크기의 배열을 다시 만들어야됨
		arr = new int[7];
		
		System.out.println("변경 후의 arr의 해쉬코드값 : " + arr.hashCode());
		
		/*
		 *  연결이 끊긴 기존 배열은
		 *  그 어디에도 참조되고 있지 않은
		 *  필요없는 존재가 됨 (Heap영역에 둥둥떠다님)
		 *  => 일정 시간이 지나면 "가비지컬렉터(GC)"가 알아서 지워줌
		 *  => 자바에서의 "자동메모리 관리" 특징!
		 */
		
		// 배열을 강제로 삭제시키고자 할 경우
		// => 연결고리를 끊으면 됨
		arr = null;
		
	}
	
	public void method6() {
		
		// 배열 선언, 할당, 초기화 다 동시에 하기
		int[] arr1 = new int[] {1, 2, 3, 4}; // 표현법1
		int[] arr2 = {1, 2, 3, 4}; // 표현법2
		
		System.out.println(arr1 == arr2);
		// 각 변수에 담긴 주소값을 비교하기 때문에 false
		System.out.println(arr1[1] == arr2[1]);
		// true
		
	}
	
	public void method7() {
		
		// 1. 크기 10짜리 정수 배열 생성
		int[] arr = new int[10];
		// 2. 반복문을 활용해서 0번~마지막인덱스까지 순차적으로 접근하면서 값을 대입
		//    매번 1~100사이에 발생되는 랜덤값
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 +1);
		}
		// 3. 반복문을 활용해서 0번~마지막인덱스까지 담겨있는 값 출력
		//    arr[x] : xx 형식대로 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
	}
	
	public void method8() {
		
		// 1. 사용자에게 배열의 길이 입력받은 후
		//    해당 그 크기만큼의 문자열 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		// 2. 반복문을 활용해서 매번 사용자에게 과일명 입력받아 그 값을 
		//    매 인덱스자리에 대입 (0번~마지막인덱스)
		for(int i=0; i<arr.length; i++) {
			System.out.print("좋아하는 과일명 입력 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복문을 활용해서 각 인덱스에 담긴 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method9() {
		
		// 사용자에게 문자열 하나 입력받은 후
		// 각각의 인덱스의 문자들을 char배열에 옮겨담기
		
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 문자열의 길이 : str.length()
		
		// 2. char배열 생성해두기 (배열의 크기 == 문자열의 길이)
		char[] arr = new char[str.length()];
		
		// 3. 문자열의 각 인덱스별 문자를 char배열의 각 인덱스자리에 대입
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * ...
		 * arr[마지막] = str.charAt(마지막);
		 */
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		// 4. 반복문을 활용해서 0~마지막인덱스까지 담긴 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method10() { // 왜 안되지
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 크기 3짜리 실수형배열 만들기
		double[] arr = new double[3];
		
		// 2. 각 인덱스에 사용자가 입력한 키 값 대입
		for(int i=0; i<arr.length; i++) {
			System.out.print("키 입력 : ");
			arr[i] = sc.nextDouble();
		}
		// 3. 각 인덱스에 담겨있는 값 출력
		// 	  1번 학생의 키 : xx.xcm
		//	  2번 학생의 키 : xx.xcm
 		// 	  3번 학생의 키 : xx.xcm
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번 학생의 키 : %.1fcm\n", i+1, arr[i]);
			sum +=arr[i];
		}
		// 4. 평균키 출력
			System.out.printf("평균키 : %.2fcm", sum / arr.length);	
	}
	
	public void method11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		
		// 1. 사용자에게 배열의 길이 입력 받은 후 
		//    해당 크기만큼의 정수 배열 생성
		// int size = sc.nextInt();
		// int[] arr = new int[size];
		int[] arr = new int[sc.nextInt()];
		
		// 2. 0번~마지막인덱스까지 매번 1~100사이의 랜덤값 발생시켜 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		// 3. 0번~마지막인덱스까지 담긴 값을 출력과 동시에
		//    해당 그 인덱스에 담긴 값이 홀수인 값들의 총 합 구하기
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); // + " " 띄어쓰기
			
			if(arr[i] % 2 == 1) {
				sum +=arr[i];
			}
		}
		// 4. 홀수의 총합 출력
		System.out.println("\n홀수들의 총 합 : " + sum);
	}
	
	public void remind() {
		
		int[] ages = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
			for(int i=0; i<ages.length; i++) {
				System.out.print("나이 입력 : ");
				ages[i]=sc.nextInt();
			
			}
		int sum = 0;
		for(int i=0; i<ages.length; i++) {
			System.out.print(ages[i] + " ");
			sum +=ages[i];
		}
		
		System.out.println("\n총 합 : " + sum);
		System.out.println("평균나이 : " + (double)sum / ages.length);
	
	}
	
}
