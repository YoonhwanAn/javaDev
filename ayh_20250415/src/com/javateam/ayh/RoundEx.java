package com.javateam.ayh;

public class RoundEx {

	public static void main(String[] args) {
		
		// 1. 실수를 반올림? Math.round()함수 TEST
		float num = 82.555555f;
		System.out.println(Math.round(num));				// 소숫점 첫째자리에서 반올림한 정수
		
		System.out.println((float)Math.round(num));			// (틀린표현) 소숫점 첫째자리에서 반올림한 정수를 float화
		System.out.printf("%.1f%n", (float)Math.round(num));	//
		
		// 1) 소숫점 2째자리에서 반올림
		// System.out.println(Math.round(num * 10) / 10f);
		// System.out.println(Math.round(num * 1e1) / 1e1f);
		System.out.println(Math.round(num * Math.pow(10,  1)) / Math.pow(10, 1));
		
		// 2) 소숫점 3째자리에서 반올림
		// System.out.println(Math.round(num * 100) / 100f);
		// System.out.println(Math.round(num * 1e2) / 1e2f);
		System.out.println(Math.round(num * Math.pow(10,  2)) / Math.pow(10, 2));
		
		// 3) 소숫점 4째자리에서 반올림
		// System.out.println(Math.round(num * 1000) / 1000f);
		// System.out.println(Math.round(num * 1e3) / 1e3f);
		System.out.println(Math.round(num * Math.pow(10,  3)) / Math.pow(10, 3));
		
		// 4) 소숫점 5째자리에서 반올림		// float 소숫점 마지막 자리에서 반올림할 경우.
		// System.out.println(Math.round(num * 10000) / 10000.0); 						// 82.5556
		// System.out.println(Math.round(num * 1e4) / 1e4f);							// 82.5555
		System.out.println(Math.round(num * Math.pow(10,  4)) / Math.pow(10, 4));	// 82.5555
		
		// [추가고찰] 4항에서 값이 다른이유.
		// (a) 82.55555가 float로 저장되어서 유효숫자를 제대로 표현 불가능.
		// (b) (num * 1000)의 값은 float * int로 연산 -> 연산결과 float
		// (c) (num * 1e4)와 (num * Math.pow(10,  4))의 값은 float * double으로 연산 -> 연산결과 double
		// (d) 연산결과 b와 c는 다른 값으로 인식됨(유효숫자 차이로 인한 값 차이) 
		// (e) d의 차이가 Math.round() 연산에서 값의 차이를 만들어 냄. 
		
		// 소숫점 5째자리 연산 검산 Logic
		int a = 10000;
		double b = 1e4;
		double c = Math.pow(10,  4);
		
		System.out.println(num);
		
		System.out.println(num * a == num * b);	// float * int != float * double
		System.out.println(num * a == num * c);	// float * int != float * double
		System.out.println(num * b == num * c);	// float * double != float * double
		// => b와 c는 완전히 동일함. 

		System.out.println(num * a - num * b);
		System.out.println(num * a - num * c);
		System.out.println(num * c - num * b);
		
	} // main

} // class
