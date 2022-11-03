package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		// 위의 사용데이터를 참고하여 각각 초기화
		Circle[] c = new Circle[2];
		
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		
		Rectangle[] r = new Rectangle[2];
		
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(Circle cc : c) {
			cc.draw();
		}	
		
		/*
		for(int i=0; i<cir.length; i++) {
			cir[i].draw();
		}
		*/
		System.out.println("===== rectangle =====");
		for(Rectangle rr : r) {
			rr.draw();
		}
		
		/*
		for(int i=0; i<rec.length; i++) {
			rec[i].draw();
		}
		*/
		
	}

}
