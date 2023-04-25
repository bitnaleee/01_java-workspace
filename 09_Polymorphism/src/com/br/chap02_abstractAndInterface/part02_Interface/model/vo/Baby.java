package com.br.chap02_abstractAndInterface.part02_Interface.model.vo;

public class Baby extends Person implements Basic {
	
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby[" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 몸무게 3증가 / 건강도 1증가
		setWeight(getWeight() + 3);	// super.생략가능 부모클래스로 
		setHealth(getHealth() + 1);
	}

	@Override
	public void sleep() {
		// 건강도 3증가
		setHealth(getHealth() + 3);		
	}
	
	
}
