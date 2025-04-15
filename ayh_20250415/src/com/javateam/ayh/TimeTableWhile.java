package com.javateam.ayh;

public class TimeTableWhile {

	public static void main(String[] args) {
		
		// 결과 형식) 2 X 1 = 2 ... (중략) ... 9 X 9 = 81
		int num = 2; // 단
		int time = 1; // ~번째 
		
		while (num <= 9) {
			
			while (time <=9) {
				
				System.out.printf("%d X %d = %2d   ",
						num, time, num * time);
								
				time++;
				
			} // while (time)
			
			System.out.println();
			time = 1;	// time 초기화 (*****주의*****)
			num++;
			
		} // while (num)
		

	} // main

} // class
