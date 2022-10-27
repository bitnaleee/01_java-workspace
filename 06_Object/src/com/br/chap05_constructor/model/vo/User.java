package com.br.chap05_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * * 생성자
	 * public 클래스명([매개변수, 매개변수, ...]) {
	 * 
	 * }
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 객체 생성과 동시에 각 필드에 값을 대입할 목적
	 * 
	 * * 생성자 작성시 주의사항
	 * 1. 반환형이 존재하지 않음 void > method가 되어버림
	 * 2. 반드시 생성자명은 클래스명과 동일해야됨
	 * 3. 매개변수 생성자를 명시적으로 작성할 경우 기본생성자를 JVM이 자동으로 만들어주지 않음
	 * 	  => 어찌됐던 간에 기본생성자는 작성하는 습관들이기!
	 * 
	 */
	
	public User() {
		// 기본생성자(매개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 함
		//System.out.println("이게 실행되나?");
		// 기본생성자를 생략했을 경우 => "JVM"이 자동으로 만들어 줬기때문에 항상 객체 생성가능!
	}
	
	// 매개변수 생성자
	// 객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		// 나머지 필드는 JVM의 초기값으로 되어있음
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		this(userId, userPwd, userName);
		// 또 다른 생성자를 호출할 때 this() 생성자 활용 가능
		// 유의사항 : 반드시 첫줄에 작성해야됨
		this.age = age;
		this.gender = gender;
	
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return "userId : " + userPwd + " userPwd : " + userPwd + " userName : " + userName 
				+ " age : " + age + " gender : " + gender;
	}
	
	
}
