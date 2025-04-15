package com.javateam.ayh;

public class TimeTableDoWhile {

	public static void main(String[] args) {
		
		// 결과 형식) 2 X 1 = 2 ... (중략) ... 9 X 9 = 81
		int num = 2; // 단
		int time = 1; // ~번째 
		
		// while문과 do-while의 차이
		// 1. while은 실행 전 조건을 확인하고 조건이 맞지 않으면 실행하지 않음.
		// 2. do-while은 일단 실행 후 조건을 확인함.
		// 초기 출력값에 차이가 있을 수 있음 (예제에서 num = 10이라면, while문-실행X, do-while문- 10단 실행)
		
		do {
			
			do {
				
				System.out.printf("%d X %d = %2d   ",
						num, time, num * time);
								
				time++;
				
			} while (time <=9);		// while문과 비교시 조건이 do의 마지막으로 감. while 뒤에 세미콜론 ;을 반드시 붙여야함에 주의!!
			
			System.out.println();
			time = 1;	// time 초기화 (*****주의*****)
			num++;
			
		} while (num <= 9);
		

	} // main

} // class
