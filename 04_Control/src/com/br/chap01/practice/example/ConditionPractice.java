package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		/*
		 * 아래와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "oo메뉴입니다"를 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요
		 */
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
//		String menu = ("1. 입력\n" + "2. 수정\n" + "3. 조회\n"
//				+ "4. 삭제\n" + "9. 종료\n" + "메뉴 번호를 입력하세요 : ");
//		System.out.print(menu);
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 9 : System.out.println("프로그램이 종료됩니다."); return;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
		
//		String str = "";
//		case 1 : str = ("입력"); break;
//		case 2 : str = ("수정"); break;
//		case 3 : str = ("조회"); break;
//		case 4 : str = ("삭제"); break;
//		case 9 : System.out.println("프로그램이 종료됩니다."); return;
//		default : System.out.println("잘못입력하셨습니다."); return;
//		}
//		
//		System.out.println(str + " 메뉴입니다.");
		
	}
	
	public void practice2() {
		
		/*
		 * 키보드로 정수를 입력받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
		 * 짝수가 아니면 "홀수다"를 출력하세요
		 * 양수가 아니면 "양수만 입력해주세요."를 출력하세요
		 */
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			String result = "";
			if(num % 2 == 0) {
				result = "짝수다";
			} else {
				result = "홀수다";
			} 
			
			System.out.println(result);
			
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요
		 * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		 * 합격 했을 경우 과목별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력하고
		 * 불합격인 경우에는 "불합격입니다."를 출력하세요
		 */
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor + "\n수학 : " + math + "\n영어 : " + eng + "\n합계 : " + sum + "\n평균 : " + avg + "\n축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		
		/*
		 * 수업자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요
		 */
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		String season = "";
		
		switch(num) {
		case 12: case 1: case 2: season = "겨울"; break;
		case 3: case 4: case 5: season = "봄"; break;
		case 6: case 7: case 8: season = "여름"; break;
		case 9: case 10: case 11: season = "가을"; break;
		default : season = "잘못 입력된 달"; break;
		}
		
		System.out.println(num + "월은 " + season + "입니다.");
		
	}
	
	public void practice5() {
		
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요
		 * 로그인 성공 시 "로그인 성공", 아이디가 틀렸을 시 "아이디가 틀렸습니다.", 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요
		 */
		
		String id = "boram";
		int pwd = 1234;
		
		System.out.print("아이디 : ");
		String loginId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		int loginPwd = sc.nextInt();
		
		if(loginId.equals(id)) {
			
			if(loginPwd == pwd) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		/*
		if(id.equals(loginId) && pwd == loginPwd) {
			System.out.print("로그인 성공");
		} else if(pwd == loginPwd) {
			System.out.print("아이디가 틀렸습니다.");
		} else if(id.equals(loginId)) {
			System.out.print("비밀번호가 틀렸습니다.");
		} else {
			System.out.print("둘 다 틀렸습니다.");
		}
		*/
		
	}
	
	public void practice6() {
		
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한을 출력하세요
		 * 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 비회원은 게시글 조회만 가능합니다
		 * (단, 잘못 입력하였을 경우 "잘못 입력했습니다."라는 출력문이 출력되도록)
		 */
		
		System.out.print("권한을 확인하고자 하는 회원 등급(관리자,회원,비회원 중 하나) : ");
		//String grade = sc.nextLine();
		
		switch(sc.nextLine()) {
		case "관리자" : System.out.println("회원관리, 게시글 관리");
		case "회원" : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break;
		default : System.out.println("잘못 입력했습니다."); return;
		}
		
	}
	
	public void practice7() {
		
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 
		 * 저체중 / 정상체중 / 과체중 / 비만을 출력하세요
		 * BMI = 몸무게 / (키(m) * 키(m))
		 * BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중 / 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만 / 30이상일 경우 고도비만
		 */
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println(bmi);
		
		String result = "";
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		/*
		 * 키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요
		 * (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력했을시 "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력)
		 */
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(num1 > 0 && num2 > 0) {
			
			int result=0; 
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return; // 메소드 빠져나갈수있도록
			}
			
			System.out.printf("%d %c %d = %d", num1, ch, num2, result);
			
		}else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); 
		}
		
	}
	
	public void practice9() {
		
		/*
		 * 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요
		 */
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		default : System.out.println("잘못입력하셨습니다.");
		}
		
	}
	
}
