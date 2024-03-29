package com.br.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.br.chap04_assist.part02_object.model.vo.Phone;

public class ObjectArrayDao {
	
	public void fileSave() {
		
		/* 제네릭 이용해서 바꿔보기
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("갤럭시", 1200000);
		arr[1] = new Phone("아이폰", 1300000);
		arr[2] = new Phone("플립", 1500000);
		*/
		
		ArrayList<Phone> list = new ArrayList<>(); // 오른쪽 Phone은 생략가능
		list.add(new Phone("갤럭시", 1200000));
		list.add(new Phone("아이폰", 1300000));
		list.add(new Phone("플립", 1500000));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_phones.txt"))) {
			
			/*
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			*/
			
			/* 제네릭방법1
			for(int i=0; i<list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			*/
			// 제네릭방법2
			for(Phone p : list) {
				oos.writeObject(p);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_phones.txt"))) {
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject());
			*/
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
				System.out.println("파일을 다 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
}
