package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Cosmetic;
import com.br.chap05_constructor.model.vo.User;

public class ConstructorRun {
	
	public static void main(String[] args) {
		
		User u = new User();
		
		u.setUserId("cha97");
		u.setUserPwd("chacha");
		u.setUserName("char");
		u.setAge(25);
		u.setGender('M');
		
		System.out.println(u.getUserId());
		System.out.println(u.getUserPwd());
		System.out.println(u.getUserName());
		System.out.println(u.getAge());
		System.out.println(u.getGender());
		
		System.out.println(u.information());
		
		Cosmetic c = new Cosmetic();
		
		c.setcName("lipstick");
		c.setPrice(50000);
		c.setBrand("chanel");
		c.setCategory("makeup");
		c.setIngredient("oil");
		
		System.out.println(c.getcName());
		System.out.println(c.getPrice());
		System.out.println(c.getBrand());
		System.out.println(c.getCategory());
		System.out.println(c.getIngredient());
		
		System.out.println(c.information());
		
		
		
	}
	
	

}
