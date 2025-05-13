package com.javaex.ex03;

public class MyApp {

	public static void main(String[] args) {
		/*포인트별, 원별 각각 관리 할 예정*/
		
		//포인트 관리
		//포인트 리스트
		//Object로 올라오는데 -->Point 전용으로 하고싶어
		MyList<Point> pList = new MyList<Point>();	 
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,5);
		
		//포인트리스트에 포인트 주소 넣는다
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//출력
		for(int i=0; i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		
		//원 관리
		MyList<Circle> cList = new MyList<Circle>();
		
		//원
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(20);
		Circle c03 = new Circle(30);
		
		//포인트리스트에 포인트 주소 넣기
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		//출력
		for(int i=0; i<cList.size();i++) {
			//오버라이딩 된게 아니고 Point의 메소드를 직접 사용한 것임
			System.out.println(cList.get(i).toString());
		}
		//다운캐스팅 하지 않아도 됨
		System.out.println(cList.get(0).getRadius());
		
		
	}

}
