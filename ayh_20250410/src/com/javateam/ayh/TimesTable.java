package com.javateam.ayh;

public class TimesTable {

	public static void main(String[] args) {
		
		// 구구단 계산
		// 2~9단을 for문으로 활용
		// 2 * 2 = 4
		// ...(중략)...
		// 9 * 9 = 81
		
		// 요구사항)
		// 1) 2~9 단의 변수
		// 2) 단 계산(연산:곱셈) 반복문 : for
		// 3) 반복문 내에서 횟수(time) 중간결과 출력
		//    ex) 2 * 1 = 2
		// 4) 단 계산 간의 간격 (줄 띄워쓰기)
		// ex) 카운터 변수 i,j,k ...
		
		
		// 수업의 흐름 
		
		// int num = 2; // 2단부터 시작 (for문 밖이라 좋은 답안은 아님)
	
		// (step-1) "단"만 열거해서 작동하는지 출력해보자 (예시 2 3 4 5 6 7 8 9)
		// (step-2) 2 * 1 = 2 ... 9 * 1 = 9 까지 열거
		// (step-3) 2 * 1 = 2, 2 * 2 = 4 ... 9 * 9 = 81 까지 열거
		
		for(int num = 2 ; num <= 9 ; num++) {
			
			// (step-1) 숫자출력 검증
			// System.out.print(num + " ");
			
			// (step-2) 곱셈출력 검증
			// System.out.println(num + " * 1 = " + num * 1);   // step-2 method1
			// System.out.printf("%d * 1 = %d%n", num, num *1);	// step-2 method2
			
			// (step 3) 곱셈출력 확장
			for (int time = 1 ; time <= 9 ; time++) {
				
				System.out.printf("%d * %d = %2d%n",		// %2d 로 두자리 정렬
								  num, time, num * time);	// step-2 method2
				
			} // for time (n단의 계산이 완료)
			
			System.out.println("-----------------------------"); // 단 간의 구분
			
		} // for num
		
		System.out.println();
		
		// 나의 답 (ANS)
		
		for(int i=2 ; i <= 9 ; i++) {
			for(int j=1 ; j <= 9 ; j++) {
				
				int multiply = i * j;
				// System.out.print(i + " * " + j + " = " + multiply + "  ");
				System.out.printf("%d X %d = %2d   ",
						          i, j, multiply);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 나의 답 최종 수정
		
		for(int i=2 ; i <= 9 ; i++) {
			for(int j=1 ; j <= 9 ; j++) {

				System.out.printf("%d X %d = %2d   ",
						          i, j, i*j);         // 굳이 multiply 변수를 설정할 이유가 없음.
			}
			System.out.println();
		}
		System.out.println();

		
		// 나의 답 (ANS)  // 2단이 제일 왼쪽으로 출력할 수 있겠는가?
		
		for(int i=1 ; i <= 9 ; i++) {
			for(int j=2 ; j <= 9 ; j++) {
				
				System.out.printf("%d X %d = %2d   ",
						          j, i, i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
	} // main

	
	
} // class
