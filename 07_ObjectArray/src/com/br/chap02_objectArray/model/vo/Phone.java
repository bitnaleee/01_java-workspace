package com.br.chap02_objectArray.model.vo;

public class Phone {
	
	private String name;		// 이름
	private String brand;		// 브랜드명
	private int price;			// 가격
	private String series;		// 시리즈

	// 기본생성자, 매개변수생성자
	public Phone() { // 언제 호출 될지 모르니 작성 
		
	}
	
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}

	// getter/setter메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	// information메소드
	public String information() {
		return name + ", " + brand + ", " + price + ", " + series;
	}
	
}
