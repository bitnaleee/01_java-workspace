	package com.br.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 간단하게 파일 만드는거
		// java.io.File 클래스 가지고
		
		
		try {
			// 1. 경로지정을 하지않은 상태로 파일 생성 => 현재 project폴더 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			// 2. 경로지정한 상태로 
			File f2 = new File("C:\\folder\\test.txt");
			f2.createNewFile();
		
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 하기
			File folder1 = new File("C:\\folder2");
			folder1.mkdir();
			
			File f3 = new File("C:\\folder2\\test.txt");
			f3.createNewFile();
		
			// --------------------------------------------------
		
			File folder = new File("parent");
			folder.mkdir();
		
			File file = new File("parent\\person.txt");
			file.createNewFile();
		
			System.out.println(folder.isFile());
			System.out.println(file.isFile());
		
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
		
		
		} catch (IOException e) {
			e.printStackTrace();	// 예외추적
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	/*
	 * 프로그램 상의 데이터를 외부매체로 출력을 한다거나 반대로 입력을 받아올꺼임
	 * 반드시 그 외부매체와의 통로를 만들어야됨 == 스트림(Stream)
	 * 
	 * * 스트림
	 * - 단방향 :	출력이면 출력용스트림 / 입력이면 입력용스트림 
	 * - 선입선출(FIFO) :  먼저 들어간 데이터가 먼저 나가게 됨
	 * 		=> 시간지연(delay)이 발생될 수 있음
	 * 
	 * * 스트림구분
	 * > 통로의 사이즈 (1byte / 2byte)
	 * - 바이트 스트림 : 1byte짜리 데이터만 왔다갔다 할 수 있는 좁은 통로 => 입력(InputStream) / 출력(OutputStream)
	 * - 문자 스트림 : 2byte짜리 데이터도 왔다갔다 할 수 있는 넓은 통로 => 입력(Reader)/ 출력(Writer)
	 * 
	 * > 외부매체와 직접 연결하는 유무
	 * - 기반(기본) 스트림 : 외부 매체와 직접적으로 연결되는 통로(필수)
	 * - 보조 스트림 : 보조 역할만 하는 통로 (속도 향상 도움, 그 외에 유용한 기능들 제공..)
	 * 				보조스트림 단독으로는 사용 불가! 기반스트림 반드시 있어야됨
	 * 
	 */
	
}
