package com.javateam.ayh;

public class JavaStudyEx6 {

	public static void main(String[] args) {  
		
	// 1. 삼항 연산자 테스트
		
		int test1 = 2;
		int resultTest = (test1 == 3) ? test1 - 1 : test1 + 1;
		System.out.println(resultTest);

		System.out.println("----- 출력 끝 -----");
		
	
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);
		
		int value = 356;
		System.out.println(value/100*100);
		
		int a = 5;
		int b = 10;
		int c = 7;

		double area1 = 15 * 7 / 2;
		double area2 = 15 * 7 / 2.0;
		double area3 = 15 * 7 * 1.0 / 2;
		double area4 = 15 / 2.0 * 7;
		double area5 = (a + b) / 2 * (double)c;
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
		System.out.println(area5);

		int e = 10;
		int f = 5;
		
		System.out.println( (e > 7) && (f <= 5) );
		
		
		
	}
	
}