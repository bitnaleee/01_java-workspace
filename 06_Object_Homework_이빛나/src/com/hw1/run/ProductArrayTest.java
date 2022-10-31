package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductArrayTest {
	
	public static void main(String[] args) {
		
		// ProductTest 객체배열로 바꿔보기
		
		Product[] arr = new Product[3];
		
		arr[0] = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		arr[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		arr[2] = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
			
		System.out.println("==============================================================");
		
		for(int i=0; i<arr.length; i++) {
			arr[i].setPrice(12000000);
			arr[i].setTax(0.05);
			System.out.println(arr[i].information());
		}
		
		System.out.println("==============================================================");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("상품명은 = " + arr[i].getProductName());
			System.out.println("부가세 포함 가격 = " + (int)(arr[i].getPrice() + (arr[i].getPrice() * arr[i].getTax())) + "원");
			
		}
		
		
		
		
		
		
			
	}

}
