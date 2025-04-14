package com.javateam.ayh;

public class JavaStudyEx1 {

	public static void main(String[] args) {  // 입력 연습
		
		System.out.println("Hello World.");   // 입력 연습2
		
		// 1. 변수설정 TEST
		
		byte a = -128;					// -128 ~ 127 사이의 정수. 변수의 범위를 벗어나면 선언 불가(에러)
		short b = 32767;				// -32,768 ~ 32,767 사이의 정수. 변수의 범위를 벗어나면 선언 불가(에러)
		int c = -2147483648;			// -2,147,483,648 ~ 2,147,483,647 사이의 정수. 변수의 범위를 벗어나면 선언 불가(에러)
		long d = 9223372036854775807L;	// -9,223,372,036,854,775,808 ~ 9,223,372,036,775,807 사이의 정수.
		long e = 123453756;				// long 타입 뒤의 숫자는 int범위 내라면 L(l)을 입력하지 않아도 상관없으나,
										// int숫자 범위를 넘어서게 된다면 반드시 L(l)을 입력해야 인식하므로 주의.
										// 변수의 범위를 벗어나면 선언 불가.(에러)
		char f = 'a';
		String g = "OK";
		
		System.out.println(f);								// char 변수는 println 내 변수호출로 출력가능.
		System.out.println(g);								// String 문자열도 println 내 변수호출로 출력가능.
		System.out.printf("%d, %d, %d, %d, %d, %s%n", 		// 정수는 %d, char로 저장된 문자는 %s로, 줄바꾸기는 %n,\n 모두 가능.
						  a, b, c, d, e, f);
		System.out.printf("문자열 출력 Test : %s%n",			// 문자열(String)으로 저장된 것도 %s로 출력가능
						  g);
		
				
		// 2. 2진수, 8진수, 10진수, 16진수 출력 TEST
		int binary = 0b111010101;		// 2진법 : '0b'로 시작. binary. 변수의 범위를 벗어나면 선언 불가.(에러)
		int octal = 067312;				// 8진법 : '0'로 시작. octal. 변수의 범위를 벗어나면 선언 불가.(에러)
										//		  타 언어에서는 '0o'인 경우도 있으나(예-phthon) java에서는 '0'임에 주의 
		int decimal = 421;				// 10진법 : 특이사항 없음.
		int hexadecimal = 0xabcdef;		// 16진법 : '0x로 시작. hexadecimal. 0~9,a~f의 16종이 숫자로 대응됨.
										// 		  (a=10, b=11, c=12, d=13, e=14, f=15), 변수의 범위를 벗어나면 선언 불가.(에러)
		
		System.out.printf("%d, %d, %d, %d%n", 				// 2진수, 8진수, 16진수는 10진수로 자동 변환되어서 출력됨.
				  		  binary, octal, decimal, hexadecimal);
		
		// 3. char 변수 TEST
		char c1 = 'A';					// 문자 리터럴, 유니코드 0~65535 숫자에 대응하여 매핑됨.
		char c2 = 65 ;					// 유니코드 65는 'A'
		char c3 = 0b1000001;			// 65의 2진수
		char c4 = 0101;					// 65의 8진수
		char c5 = 0x41;					// 65의 16진수
				
		System.out.printf("문자:%s, 10진수:%s, 2진수:%s, 8진수:%s, 16진수:%s%n",	// 유니코드 값만 동일하면 동일하게 출력됨.
						  c1, c2, c3, c4, c5);
		
		System.out.println("----- 출력 끝 -----");
		
	}
	
}