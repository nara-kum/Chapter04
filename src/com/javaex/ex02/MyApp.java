package com.javaex.ex02;

public class MyApp {

	public static void main(String[] args) {
		/*포인트별, 원별 각각 관리 할 예정*/
		/****MyList 하나로 여러번 사용가능****/
		
		//포인트만 관리
		//포인트리스트
		MyList pList = new MyList();
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(5,4);
		
		//포인트 리스트에 포인트(주소) 추가
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//출력
		for(int i=0; i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		
//		pList.get(0).getX();
//		((Point)pList.get(0)).getX();	다운캐스팅
		
		System.out.println("------------------------");
		//원만 관리
		MyList cList = new MyList();
		
		//원
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(20);
		Circle c03 = new Circle(30);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(p03);		//<-- 섞어서 넣을 수 있다
		
		//출력
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
//			System.out.println(((Circle)cList.get(i)).getRadius());
		}
		
		
		
	}

}
