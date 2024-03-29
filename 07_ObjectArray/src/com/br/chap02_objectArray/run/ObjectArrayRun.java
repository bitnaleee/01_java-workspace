package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Phone[] phones = new Phone[3]; // 배열 생성
		
		//phones[0].setName("아이폰");
		System.out.println(phones[0]); // 객체 아니고 배열이기 때문에 null
		System.out.println(phones);
		// [Lcom.br.chap02_objectArray.model.vo.Phone;@4926097b
		
		// 0 인덱스는 기본생성자로 생성한 후 setter로 값을 담음
		phones[0] = new Phone(); // Phone 객체 생성 인덱스x 필드값
		phones[0].setName("아이뽄");
		phones[0].setBrand("사과");
		phones[0].setPrice(1400000);
		phones[0].setSeries("14pro");
		
		// 1,2 인덱스는 매개변수생성자를 이용하여 생성과 동시에 대입
		phones[1] = new Phone("은하수", "샘송", 1200000, "s20");
		phones[2] = new Phone("벨벳폰", "헬지", 900000, "없음");
		
		int total = 0;
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		}
		 
		// 총 가격, 평균가 출력
		System.out.println("총 가격 : " + total + "원");
		System.out.println("평균가 : " + total / phones.length + "원");
				
		// 사용자에게 구매하고자하는 핸드폰명 입력받기
		// 해당 핸드폰을 검색한 후 그 가격을 알려주도록
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		
		int count = 0;
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 "+ buy + "핸드폰의 가격은 " 
				+ phones[i].getPrice() + "원입니다.");
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("저희 가게에서 판매하는 핸드폰이 아닙니다.");
		}
		
		
		
	}
	
}
