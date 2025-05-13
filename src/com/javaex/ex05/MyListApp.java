package com.javaex.ex05;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		
		
		
		//포인트 리스트
//		ArrayList<Point> pList = new ArrayList<Point>();
		List<Point> pList = new ArrayList<Point>();
		//-->부모를 인터페이스로 둔 경우 호환을 염두했을 가능성이 높음
		//섞어쓰기를 하게되므로 인터페이스에 있는 메소드로만 구현
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//포인트 리스트에 포인트(주소)를 넣는다
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		
	}

}
