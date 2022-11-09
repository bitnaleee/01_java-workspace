package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		/*
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("뽀삐", "말티즈", 5);
		arr[1] = new Cat("잘생김", "페르시안", "서울", "흰색");
		arr[2] = new Cat("이쁨", "러시안블루", "집", "회색");
		arr[3] = new Dog("개", "시베리안", 30);
		arr[4] = new Dog("큰개", "차우차우", 40);
		
		for(Animal a : arr) {
			a.speak();
		}
		*/
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Dog("뽀삐", "말티즈", 5));
		list.add(new Cat("잘생김", "페르시안", "서울", "흰색"));
		list.add(new Cat("이쁨", "러시안블루", "집", "회색"));
		list.add(new Dog("개", "시베리안", 30));
		list.add(new Dog("큰개", "차우차우", 40));
		/*
		for(int i=0; i<list.size(); i++) {
			list.get(i).speak();
		}
		*/
		for(Animal a : list) { // 변수 = list.get(0); => 변수 = list.get(1);
			a.speak();
		}
		
		
	}

}
