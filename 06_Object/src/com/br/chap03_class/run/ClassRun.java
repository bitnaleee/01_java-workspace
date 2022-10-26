package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		// 생성만 했을때 각 필드에 기본값이 초기화 되어있음
		/*
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("강보람");
		p.setAge(34);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("teacherboram@gmail.com");
		*/
		/*
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		*/
		//System.out.println(p.information());
		
		System.out.println("==============================");
		
		Product pro = new Product();
		
		pro.setpName("아이폰14");
		pro.setPrice(1300000);
		pro.setBrand("애플");
		
		System.out.println(pro.getpName());
		System.out.println(pro.getPrice());
		System.out.println(pro.getBrand());
		
		System.out.println(pro.information());
		
		
		
		
		
	}
	
}
