package com.javateam.ayh;

public class JavaAcadEx10 {

	public static void main(String[] args) {
				
		// 1. continue 사용 (반복문의 예외처리) 
		
		// 예제 - 짝수 순열
		// 짝수 홀수 구분 : 2로 나눈 나머지 1/0 => 홀수/짝수
		// for문 내 i+=2인 경우와, i++인 경우, 전자는 프로그램 5회 실행, 후자는 프로그램 10회 실행.  
		
		
		// (case 1) 기본 케이스
		for (int i = 1; i <= 10; i++) {
			
			int num = i % 2;					// 나머지 판정
			
			if (num == 1) {						// 나머지가 1일 때 일시분기 => 홀수일 때 분기 => 결과물 2 4 6 8 10
			// if (num == 0) {					// 나머지가 0일 때 일시분기 => 짝수일 때 분기 => 결과물 1 3 5 7 9
				continue; // 일시적인 분기, 예외처리 (skip)
			}
			
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		// (case 2) 나머지 판정을 별도의 변수없이 단축
		for (int j = 1; j <= 10; j++) {
			
			if (j % 2 != 0) {					// 나머지가 0이 아닐때
			// if (j%2 == 1) {					// 나머지가 1일때
				continue; // 일시적인 분기, 예외처리 (skip)
			}
			
			System.out.print(j + " ");
		
		}
		System.out.println();
		
		// 2. 반목문 중첩에서 break test
		// (case 1) j==5일 때 브레이크  -> 내부 for 반복문에서만 break 됨.
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				
				if (j == 5) {
					break;							// 해당 조건일 때, 해당 반복문을 break 시키겠다.
				}
				
				System.out.printf("%d x %d = %2d   ",
						i, j , i*j);
				
			}
			
			System.out.println();
		}
		System.out.println();
		
		// (case 2) 라벨을 붙였을 때 j==5일 때 브레이크 -> 선언된 라벨의 반복문을 break
		Label : for (int i = 2; i <= 9; i++) {		// 라벨선언. 라벨은 다른 문자열이여도 상관없음.
			
			for (int j = 1; j <= 9; j++) {
				
				if (j == 5) {
					break Label;					// 해당 조건일때, 선언된 Label에 해당하는 반복문을 break 시키겠다. 
				}
				
				System.out.printf("%d x %d = %2d   ",
						i, j , i*j);
				
			}
			
			System.out.println();
		}
		
	}

}
