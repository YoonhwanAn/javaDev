package com.javateam.ayh;

public class ChoiceLottoNumber {

	public static void main(String[] args) {

		// 초기 문구 출력
		System.out.println("로또번호 시뮬레이터 입니다.");
	
		// 숫자 초기값 설정
		int ball1 = 0;
		int ball2 = 0;
		int ball3 = 0;
		int ball4 = 0;
		int ball5 = 0;
		int ball6 = 0;
		
		// ball1 숫자 선정
		ball1 = (int)(Math.random() * 45) + 1;  // (첫번째 공 45중 랜덤한 숫자 선택)
		
		// ball2 숫자 선정
		ball2 = (int)(Math.random() * 45) + 1;  // (두번쨰 공 45중 랜덤한 숫자 선택)
		
		while(ball2 == ball1) {												// (두번쨰 공이 첫번째 공과 같으면 숫자 재선택)
			ball2 = (int)(Math.random() * 45) + 1;  
		}; 
		
		// ball3 숫자 선정
		ball3 = (int)(Math.random() * 45) + 1;  // (세번쨰 공 45중 랜덤한 숫자 선택)
		
		while(ball3 == ball1 || ball3 == ball2) {							// (세번쨰 공이 나머지 공과 같으면 숫자 재선택)
			ball3 = (int)(Math.random() * 45) + 1;  
		}; 

		// ball4 숫자 선정
		ball4 = (int)(Math.random() * 45) + 1;  // (네번쨰 공 45중 랜덤한 숫자 선택)
		
		while(ball4 == ball1 || ball4 == ball2 || ball4 == ball3) {			// (네번쨰 공이 나머지 공과 같으면 숫자 재선택)
			ball4 = (int)(Math.random() * 45) + 1;  
		}; 
		
		// ball5 숫자 선정
		ball5 = (int)(Math.random() * 45) + 1;  // (다섯번쨰 공 45중 랜덤한 숫자 선택)
		
		while(ball5 == ball1 || ball5 == ball2 || ball5 == ball3 
				|| ball5 == ball4) {										// (다섯번쨰 공이 나머지 공과 같으면 숫자 재선택)
			ball5 = (int)(Math.random() * 45) + 1;  
		}; 
		
		// ball6 숫자 선정
		ball6 = (int)(Math.random() * 45) + 1;  // (여섯번쨰 공 45중 랜덤한 숫자 선택)
		
		while(ball6 == ball1 || ball6 == ball2 || ball6 == ball3 
				|| ball6 == ball4 || ball6 == ball5) {						// (여섯번쨰 공이 첫번째 공과 같으면 숫자 재선택)
			ball6 = (int)(Math.random() * 45) + 1;  
		}; 
		
		
		// 결과 출력
		System.out.println("제가 추천드리는 이번 주의 로또번호는");
		System.out.printf("%d, %d, %d, %d, %d, %d 입니다.%n", 
				          ball1, ball2, ball3, ball4, ball5, ball6);
		
	} // main

} // class
