package com.br.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * * Date (java.util)
		 * - 날씨 및 시간에 대한 값을 담을 수 있는 객체
		 * 
		 */
		
		// 기본생성자를 이용해서 생성
		Date date1 = new Date();
		System.out.println(date1);
		
		// 내가 원하는 날짜(2023년 03월 27일)로 셋팅
		// 1) 매개변수 생성자를 이용해서 생성
		Date date2 = new Date(2023-1900, 3-1, 27);
		System.out.println(date2);
		
		// 2) 기본생성자로 생성한 후 setter메소드로 값 변경
		date1.setYear(2023-1900);
		date1.setMonth(3-1);
		date1.setDate(27);
		
		System.out.println(date1);
		
		// 2023년 03월 27일 16시 11분 05초
		// 2023/03/27
		
		// 내 입맛대로 포맷을 적용해서 출력 가능
		// java.text.SimpleDateFormat 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E) HH시 mm분 ss초");	// 월은 대문자MM으로 분은 소문자mm
		
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		// String에서 제공하는 메소드들 > 자주쓰이니 외워두는게 좋음
		// Parsing 파싱하는거 
		// SimpleDateFormat 포맷지정
		
	}

}
