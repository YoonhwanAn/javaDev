package com.javateam.ayh;

public class TriangleSample {

	public static void main(String[] args) {
		
		// 정삼각형의 5층짜리 트리를 만들어라 (*이용)
		//      *
		//     ***
		//     ...
		//  *********
		
		int maxStage = 5;  // 최대 단수 설정

		for(int stage = 1 ; stage <= maxStage ; stage++) {			// 트리의 단수 설정
			
			for (int space = 1 ; space <= maxStage - stage; space++) {       // 공란을 반복해서 찍는 for문				
				System.out.print(" ");	// 공란을 출력.
			}

			for (int num = 1 ; num <= (stage * 2) - 1 ; num++) {       // 별을 반복해서 찍는 for문		
				System.out.print("*");	// 별을 출력.
			}
			
			System.out.println(); // 단 구분
			
		} // for stage
		
	} // main

} // class
