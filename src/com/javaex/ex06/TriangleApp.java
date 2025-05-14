package com.javaex.ex06;

import java.util.LinkedList;
import java.util.List;

public class TriangleApp {

	public static void main(String[] args) {
		
//		List<Triangle> tList = new ArrayList<Triangle>();
		List<Triangle> tList = new LinkedList<Triangle>();
		
		Triangle t01 = new Triangle(3,3);
		Triangle t02 = new Triangle(4,4);
		Triangle t03 = new Triangle(5,5);

		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		
		for(int i=0; i<tList.size(); i++) {
			System.out.println(tList.get(i));
		}
		
		System.out.println("----------------------------");
		System.out.println(tList.get(1).getWidth());
		System.out.println(tList.get(1).getHeight());
		System.out.println("----------------------------");
		
		tList.remove(1);
		
		System.out.println(tList.toString());
		
		System.out.println("============================");
		
		//제네릭을 쓰는 곳에는 기본 자료형을 쓸 수 없다 :8개
		
		List<Integer> iList = new LinkedList<Integer>();
		
		//기본 자료형은 자동으로 박싱을 해준다
		iList.add(3);
		iList.add(6);
		iList.add(9);
		
		System.out.println(iList.toString());
		System.out.println("----------------------------");
		
		for(int i=0; i<iList.size(); i++) {
			System.out.println(iList.get(i));
		}
		
		
		
		
		
	}

}
