package com.javateam.ayh;

public class JavaStudyEx4 {

	public static void main(String[] args) {
		
		// 1. promotion (자동 타입변환) 허용범위가 작은 변수에서 큰 변수로
		// 허용범위가 작은 변수에서 큰 변수로 선언시 자동으로 타입 변경됨.
		// byte < short < int < long < float < double
		// char < int < long < float < double (byte에서 char는 불가. byte에 음수가 포함되기 때문)
		
		byte byteValue = 10;
		short shortValue = byteValue;
		// char charValue = byteValue;		// byte는 음수가 있고 char는 0~65535 의 숫자를 나타내므로 변환 불가능
		int intValue = byteValue;
		long longValue = byteValue;
		float floatValue = byteValue;
		double doubleValue = byteValue;
		
		System.out.println(byteValue);
		System.out.println(shortValue);
		// System.out.println(charValue);
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);

		// 2. casting (강제 타입변환) 허용범위가 큰 변수에서 작은 변수로
		// case1) 하위 변수의 범위 내의 숫자. -> 정상변환됨.
		int var1 = 100;
		byte var2 = (byte) var1;
		
		System.out.printf("var1(int)=%d, var2(byte)=%d%n",
						  var1, var2);
		
		// case2) 하위 변수의 범위 밖의 숫자. -> 잘못된 값이 저장됨. 
		int var3 = 200;
		byte var4 = (byte) var3;
		
		System.out.printf("var3(int)=%d, var4(byte)=%d%n",
						  var3, var4);
		
		
		// case3) 실수형을 정수형으로 -> 정수부분만 반환됨. 
		double var5 = 3.141592;
		int var6 = (int) var5;
		
		System.out.printf("var5(double)=%8.6f, var6(int)=%d%n",
						  var5, var6);

		// 3. 연산식에서의 자동변환
		// (byte, char, short, int)와 (byte, char, short, int)가 연산되면 자동으로 int로 변경된다.
		
		// case1) byte-byte 연산
		byte a = 1;
		byte b = 1;
		
		// byte result1 = a + b; 			// 연산시 자동으로 int로 변경되었기 때문에 byte로 입력 불가.
		byte result1 = (byte)(a + b);		// byte로 casting하면 가능.
		int result2 = a + b;				// int로 변수선언하면 가능.
		
		System.out.println(result1);
		System.out.println(result2);
		
		// case2) int-double 연산
		int c = 1;
		double d = 1;

		// int result3 = c + d; 			// 연산시 자동으로 큰 쪽인 double로 변경되었기 때문에 int불가
		double result3 = c + d;
		
		System.out.println(result3);
		
		
		System.out.println("----- 출력 끝 -----");
		
	}
	
}