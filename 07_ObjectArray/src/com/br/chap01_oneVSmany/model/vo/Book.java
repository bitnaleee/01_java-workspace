package com.br.chap01_oneVSmany.model.vo;

public class Book {
	
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 기본생성자
	public Book() {
		
	}
	
	// 매개변수생성자 (모든 필드 다 초기화 할 수 있는 매개변수 4개짜리)
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	// 각 필드에 대한 setter메소드
	// 각 필드에 대한 getter메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 모든 필드의 값을 하나의 문자열로 합쳐 반환해주는 메소드(information)
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}

}
