package com.br.chap02_abstractAndInterface.part02_Interface.run;

import com.br.chap02_abstractAndInterface.part02_Interface.model.vo.Baby;
import com.br.chap02_abstractAndInterface.part02_Interface.model.vo.Basic;
import com.br.chap02_abstractAndInterface.part02_Interface.model.vo.Mother;
import com.br.chap02_abstractAndInterface.part02_Interface.model.vo.Person;

public class InterfaceRun {

	public static void main(String[] args) {
		
		/*
		Person mom = new Mother("김엄마", 50, 70, "출산");
		Person baby = new Baby("강아기", 4.2, 70);

		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();	// 몸무게+10 / 건강도-10
		baby.eat();	// 몸무게+3 / 건강도+1
		
		mom.sleep();	// 건강도+20
		baby.sleep();	// 건강도+3
		
		System.out.println("====== 다음날 ======");
		System.out.println(mom);
		System.out.println(baby);
		*/
		
		//Basic b = new Basic();	// 인터페이스도 객체 생성불가(레퍼런스로는 가능)
		Basic mom = new Mother("김엄마", 50, 70, "출산");
		Basic baby = new Baby("강아기", 4.2, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		mom.sleep();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		 * 클래스에서 클래스를 상속받을 때 : 클래스 extends 클래스 (단일상속만 가능)
		 * : 화살표 "실선"
		 * 클래스에서 인터페이스를 구현할 때 : 클래스 implements 인터페이스, 인터페이스, .. (다중상속 가능)
		 * : 화살표 "점선"
		 * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스, 인터페이스, .. (다중상속 가능)
		 * : 화살표 "실선"
		 * 					|			추상클래스			|			인터페이스
		 * ============================================================================
		 * 상속갯수			|			단일 상속			|			인터페이스
		 * ----------------------------------------------------------------------------
		 * 키워드				|			extends			|			implements
		 * ----------------------------------------------------------------------------
		 * 추상메소드			|		추상메소드 0개이상		|		모든 메소드가 추상메소드
		 * 표현법/갯수			|	  명시적으로 abstract 기술	|		 abstract 생략 가능
		 * ----------------------------------------------------------------------------
		 * 일반메소드여부 		|			  O				|				X
		 *-----------------------------------------------------------------------------
		 * 필드				|		일반필드 가질 수 있음	    |  상수필드만 가질 수 있음(묵시적으로 public static final) 
		 * 
		 * extends 일반클래스			-->			extends 추상클래스			--> 		implements 인터페이스
		 * 	--------------------------------------------------------------------------------------------
		 * 								강제성이 더 짙어짐 (규약이 더 쎄짐)
		 * 
		 * 
		 */
		
	}

}
