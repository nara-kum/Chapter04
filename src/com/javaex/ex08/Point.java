package com.javaex.ex08;

import java.util.Objects;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드-gs
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	//진짜 주소가 같은 경우
			return true;
		if (obj == null)	//비교할 대상이 없는 경우
			return false;
		if (getClass() != obj.getClass())	//클래스가 다른 경우
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

//	@Override
//	public int hashCode() {	
//		int Code = this.x + this.y;
//		
//		return Code;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Point p = (Point)obj;
//		
//		if(this.x==p.x &&this.y==p.y) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
}
