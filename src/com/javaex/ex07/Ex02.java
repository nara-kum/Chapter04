package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		//번호를 계속 생성
		//번호가 6개 되면 끝 --> Set의 갯수가 6개면 종료
		Set<Integer> lottos = new HashSet<Integer>();
		
		while(true) {
			if(lottos.size()==6) {
				break;
			}
			
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);		//중복이면 들어가지 않음
			System.out.println(num);
		}

		System.out.println("---------------------------");
		
		for(int num : lottos) {
			System.out.println(num);
		}
		
	}

}
