package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		System.out.println(p1.information());
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		System.out.println(p2.information());
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		System.out.println(p3.information());
	
		System.out.println("=====================================================");
		
		p1.setPrice(1200000);
		p1.setTax(0.05);
		System.out.println(p1.information());
		
		p2.setPrice(1200000);
		p2.setTax(0.05);
		System.out.println(p2.information());
		
		p3.setPrice(1200000);
		p3.setTax(0.05);
		System.out.println(p3.information());
		
		System.out.println("=====================================================");
		
		System.out.println("상품명 = " + p1.getProductName());
		p1.sum(1200000, 0.05);
		System.out.println("상품명 = " + p2.getProductName());
		p2.sum(1200000, 0.05);
		System.out.println("상품명 = " + p3.getProductName());
		p3.sum(1200000, 0.05);		
				
				
				
	}
}
