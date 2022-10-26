package com.br.chap03_class.model.vo;

public class Product {

	// 클래스 선언구문에 작성가능한 접근제한자 (public, default(아무것도안쓸때))
	// public으로 하면 같은 패키지내에서든 다른패키지에서든 해당 이클래스 사용 가능 
	// default으로 하면 같은 패키지내에서만 사용가능 (다른패키지에서는 사용 불가)
	
	
	private String pName;
	private int price;
	private String brand;
	
	/*
	public void setPName(String pName) {
		this.pName = pName;
	}
	*/
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return pName + ", " + price + ", " + brand;
	}
	
}
