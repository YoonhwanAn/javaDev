package com.javateam.ayh;

public class test {
	
	public static void main (String[] args) {
		
		// 예제1) 구구단
		for (int i=2; i<=9; i++) {
			
			for (int j=2; j<=9; j++) {
				System.out.printf("%d X %d = %d%n", i, j, i*j );
				
			}
			
			System.out.println();
		}
		
		// 예제2) 합계
		int num = 10;
		int sum = 0;
		for (int i = 1; i <= num ; i++ ) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		int kor = 10, eng = 21, math = 30;
		
		int total = kor + eng + math;
		
		double aver1 = total / 3.0;
		
		double aver2 = Math.round(aver1 * 10.0) / 10.0;

		System.out.printf("점수 합 : %d%n", total);
		System.out.printf("점수 평균 : %.2f%n", aver1);
		System.out.println("점수 평균 : " + aver2);
		
	}
	
}
