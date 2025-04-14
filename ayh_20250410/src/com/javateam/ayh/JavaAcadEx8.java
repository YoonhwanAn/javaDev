package com.javateam.ayh;

import java.util.Scanner;

public class JavaAcadEx8 {

	public static void main(String[] args) {

		// 1. 반복구문 만들기 프로세스-----------------------------------------------------------------------------

//		// 1) 필요조건 확인 (요구사항을 확인하는 것이 중요)
//		//   (a)목표 : 1 ~ 10까지 합계
//		//    *** 필요조건 : 요구사항을 확인하는 것이 중요
//		
//		// 2)Process 선정 
//		//   (a) 1 ~ 10 계수 변수 설정 (counter) : cnt(count), i   (변수이름 선정할 떄 의미를 내포해서 선정할 수 있도록 함)
//		//   (b) 합계 변수 설정 : sum, total
//		//   (c) 계수 변수 활용 -> 반복문 -> 합계
//		
//		// 순서도를 먼저 작성해 보는 것도 중요함. 
//
//		// 3)변수를 정의 
//		// int cnt; // 계수 변수 : 1 ~ 10 (for 구문 안으로 넣기로 결정)
//		int sum = 0; // 합계 변수 (초기 값 0)
//		
//		// 4) 1~10 계수를 나열하도록 for 구문을 작성
//		for (int cnt = 1; cnt <= 10; cnt++) {
//
//			// System.out.print(cnt + " "); 							// 계수변수 점검
//			
//			// sum = sum + cnt;
//			sum += cnt;
//			
//			// System.out.println(sum);									// 합계 점검 1
//			// System.out.printf("1부터 %d까지의 합계 : %d%n", cnt, sum);	// 합계 점검 2 (문자열 포함)
//		}
//		
//		System.out.println("1부터 10까지의 합계 : "+ sum);			// 합계 표시 (최종 프로그램)
		
		
		// 2. 변형 예시-----------------------------------------------------------------------------
		
		// case1) 입력받는 n까지의 합계를 구하는 프로그램을 작성해라.
		
		// 초기출력
		System.out.println("1부터 n까지 숫자를 더하는 프로그램입니다.");
		System.out.print("n 값을 입력해주세요 : ");
		
		// 1 ~ n 까지의 합계 (n은 사용자 입력)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.close();
		
		// 초기변수 설정
		int sum = 0; 
		
		// for 구문을 이용한 합계
		for (int cnt = 1; cnt <= n; cnt++) {

			sum += cnt;

		}
		
		// 결과 출력
		System.out.println("1부터 " + n + "까지의 합계 : "+ sum);			// 합계 표시 (최종 프로그램)

		
	} // main

} // class
