package com.javateam.ayh;

public class JavaAcadEx6 {

	public static void main(String[] args) {

		
		// 1. 반복문(repeatation, loop) 기초--------------------------------------------------------------------------------

//		// System.out.println(1);
//		// System.out.println(2);
//		// ...
//		// System.out.println(10); 를 노가다하지 않고 빠르게 할 수 있는가? -> 있음.
//		
//		// 규칙성 : 초기값(1), 마지막값(10), 증가값(1)
//		for (int i = 1; i <= 10; i = i + 1) {
//			System.out.println(i);
//		}

		
		
		// 2. 추가적인 표현방법--------------------------------------------------------------------------------

//		for (int i = 1; i < 11; i = i + 1) {		// 11 미만. 인간의 착시로 인해서 오해할 수 있으므로 비추천. 
//			System.out.println(i);
//		}
//		for (int i = 1; i <= 10; i += 1) {			// 대입연산자 사용
//			System.out.println(i);
//		}
//		for (int i = 1; i <= 10; i++) {				// 증감연산자 후위플플  // 가장 선호되는 타입!!!!!
//			System.out.println(i);
//		}
//		for (int i = 1; i <= 10; ++i) {				// 증감연산자 전위플플
//			System.out.println(i);
//		}
//		for (int i = 10; i >= 1; i = i - 1) {		// 역순으로 표현한 것을 정방향으로 표현되도록
//			System.out.println(11 - i);
//		}		
//		for (int i = 10; i > 0; i = i - 1) {		// 0 이상. 인간의 착시로 인해서 오해할 수 있으므로 비추천. 
//		System.out.println(11 - i);
//		}	
//		for (int i = 10; i >= 1; i -= 1) {		// 역순으로 표현한 것을 정방향으로 표현되도록 대입연산자 사용
//			System.out.println(11 - i);
//		}
//		for (int i = 10; i >= 1; i--) {		// 역순으로 표현한 것을 정방향으로 표현되도록 증감연산자 후위마이나마이나  // 가장 선호되는 타입!!!!!
//			System.out.println(11 - i);
//		}	
//		for (int i = 10; i >= 1; --i) {		// 역순으로 표현한 것을 정방향으로 표현되도록 증감연산자 전위마이나마이나
//			System.out.println(11 - i);
//		}	
	
		
		// (기타1) 전위플플, 후위플플 차이 --------------------------------------------------------------------------------

//		// case 1) 증감연산자가 원하는 로직 밖에 존재하는 경우 -> 문제 없음.
//		int num1 = 1;
//		int num2 = 1;
//
//		num1++;
//		++num2;
//		
//		System.out.println("num1 : " + num1);   // 2
//		System.out.println("num2 : " + num2);   // 2
//
//		// case 2) 증감연산자가 원하는 로직 안에 존재하는 경우 -> 주의 필요!!!!!!!
//		int num3 = 1;
//		int num4 = 1;
//
//		System.out.println("num1 : " + num3++); // 1 (숫자를 표현하고 더해짐, 값에 주의)
//		System.out.println("num2 : " + ++num4); // 2 (더하고 숫자를 표현함, 값에 주의)
//		
//		System.out.println("num1 : " + num3);   // 2
//		System.out.println("num2 : " + num4);   // 2

		
		
		// 3. 변형예시--------------------------------------------------------------------------------

//		// case 1) 홀수만 나타내고 싶다면? -> 2씩 증가. (odd num)
//		// for (int i = 1; i <= 10; i = i + 2) {    // i에 2씩을 더하도록
//		// for (int i = 1; i <= 10; i += 2) {		// 대입연산자 이용.
//		for (int i = 9; i >= 1; i -= 2) {			// 역순 나열
//				System.out.print(i + " ");    // 가로로 출력되게 변경함.
//		}
//		System.out.println(" ");
//		
//		// case 2) 짝수만 나타내고 싶다면? (even num)
//		// for (int i = 2; i <= 10; i += 2) {		// 대입연산자 이용.
//		for (int i = 10; i >= 2; i -= 2) {			// 역순 나열
//			System.out.print(i + " "); 
//		}
//		System.out.println();
//		
//		
//		// case 번외) 1~100 중에서 소수를 나타낼 수 있는가????  숙제.
	
		
		// 4. 기타도 적용 가능한가?--------------------------------------------------------------------------------

		// case 1) 1.5씩 증가
//		for (float i = 1; i <= 10; i += 1.5f) {	
//	    // for (double i = 1; i <= 10; i += 1.5) {		// not bad이나 메모리 많이 잡아먹음.
//			System.out.print(i + " "); 
//		}
//		System.out.println(" ");
//
//		// case 2) 단위가 int가 아니여도 작동하는가?
//		for (byte i = 1; i <= 10; i++) {				// byte가 -128~127이므로 조건문의 범위가 범위를 벗어나면 무한 뺑뺑이. 
//			System.out.print(i + " "); 
//		}
//		System.out.println();
		
		
		
		// 5. 조건문을 빼도 적용 가능한가?-----------------------------------------------------------------------------
		
		// case 1) 일반 케이스 (계속 출력하되 10까지 가면 그만 출력해라)
		for (int i = 1; ; i++) {	
			System.out.print(i + " ");
			if (i == 10) {								
				break; 
			}
		}
		System.out.println(" ");
		
		// case 2) else를 구성해서 출력 (11이 됐을 때 정지)
		for (int i = 1; ; i++) {						 
			if (i == 11) {								
				break;
			} else {
				System.out.print(i + " "); 
			}
		}
		System.out.println(" ");
		
		// case 3) else를 구성해서 출력 (10이하일 때 반복, 초과하면 정지)
		for (int i = 1; ; i++) {						 
			if (i <= 10) {								
				System.out.print(i + " "); 
			} else {
				break; 
			}
		}
		System.out.println();
		
	} // main

} // class
