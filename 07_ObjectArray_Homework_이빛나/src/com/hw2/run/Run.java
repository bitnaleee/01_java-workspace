package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다
		Student[] stu = new Student[10];
		
		int count = 0;	// 학생 수를 나타내는 변수 > 한 명 추가시 1씩 증가시켜줄꺼임
		
		// while(true)을 사용하여 학생들의 정보를 계속 입력받고
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체생성
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			// 한명씩 추가 되었기 때문에 count 1증가
			stu[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			while(true) {	
					// 계속 추가할 것인지 물어보고 'n'입력시 반복문 빠져나감
				System.out.print("계속 추가할겁니까? (y/n) : ");
				String str = sc.nextLine().toUpperCase();  // // 문자열.toUpperCase() : 무조건 대문자로 바꿔주는 메소드!!!
					
				if(!str.equals("N") && !str.equals("Y"))	{
					System.out.println("다시입력해주세요.(y/n)");
					continue;
				} if(str.equals("N")) {
					// 현재 배열에 담겨있는 학생들의 정보를 모두 출력
					
					//for(int i=0; i<stu.length; i++) {}
					// 이렇게 되면 무조건 10번 반복 --> NullPointerException 발생 여지가 있음
							for(int i=0; i<count; i++) {
								// 학생 수만큼만 반복하도록
								int sum = stu[i].getKor() + stu[i].getMath() + stu[i].getEng();
						
								System.out.println(stu[i].information() + ", 평균= " + sum/3);
						
							} break;
				
				} else {
					return;
				}
					
			} 
				
		
				
				
		}
		
	}
}
