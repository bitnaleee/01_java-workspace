package com.hw2.model.vo;

public class Book {

	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String information() {
		return title + " " + price + " " + discountRate + " " + author;
	}
	
	public void sum(int price, double discountRate) {
		int result = (int)(price - (price * discountRate));
		System.out.println("할인된 가격 = " + result + "원");
	}
	
	
	
	
	
	
}
