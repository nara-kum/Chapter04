package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		//HashMap 준비 --> 키(String), 벨류 2가지를 정해줘야 한다
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		//포인트
		Point p01 = new Point(2,1);
		Point p02 = new Point(2,1);
		Point p03 = new Point(22,64);
		
		//Map에 포인트(주소) 넣기 --> 키를 중복되지 않게 정해준다
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		
		//toString()
		System.out.println("----------------------------");
		System.out.println(pMap.toString());

		System.out.println("----------------------------");
		System.out.println(pMap.get("박명수").toString());

		System.out.println("----------------------------");
		System.out.println(pMap.get("박명수").getX());

		System.out.println("----------------------------");
		//박명수 삭제
		pMap.remove("박명수");
		System.out.println(pMap.toString());
		
		
		System.out.println("----------------------------");
		Point p04 = new Point(100,150);
		pMap.put("서장훈", p04);
		System.out.println(pMap.toString());
		
		System.out.println("----------------------------");
		//같은 키값을 사용할경우
		Point p05 = new Point(90,80);
		pMap.put("이효리", p05);				//나중의 키값에 넣은 밸류로 대체됨
		System.out.println(pMap.toString());
		
		System.out.println("----------------------------");
		//전체출력
		//키(key)세트를 달라고 한다
		Set<String> keys = pMap.keySet();
		
		for(String name : keys) {
			System.out.println(pMap.get(name).toString());
		}
//		System.out.println(pMap.keySet());

		System.out.println("----------------------------");
		
		Map<String,String> boardMap =new HashMap<String,String>();
		
		boardMap.put("Title", "게시판 제목 입니다.");		
		boardMap.put("date", "2025-05-14");
		boardMap.put("id", "jws");
		boardMap.put("content", "게시판 내용 입니다.");
		
		System.out.println(boardMap.get("Title"));
		
	}

}
