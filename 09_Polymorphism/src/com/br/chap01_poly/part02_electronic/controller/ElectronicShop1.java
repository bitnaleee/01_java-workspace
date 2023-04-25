package com.br.chap01_poly.part02_electronic.controller;

import com.br.chap01_poly.part02_electronic.model.vo.Desktop;
import com.br.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.br.chap01_poly.part02_electronic.model.vo.Tablet;

// 전자상가에 있는 가게라고 생각
// 다형성 적용 안했을 때
public class ElectronicShop1 {	// 오버로딩 적용
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;

	// 오버로딩 적용된건 매개변수가 다르기 때문
	public void insert(Desktop d) {	// Desktop d = new Desktop(~~~~) 
		desk = d;
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}

}
