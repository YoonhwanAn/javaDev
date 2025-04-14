package com.javateam.ayh;

public class JavaStudyEx2 {

	public static void main(String[] args) {  
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 1. 실수타입 변수 (float, double) test
		
		// float var1 = 0.1;(X)					// 기본 double 이기에 F(f)를 꼭 붙여줘야 float로 인식.
		float var1 = 0.1f;						
		// float var2 = 0.125;(X)				// 2진수로 나눠떨어지는 수에도 예외없이 f를 붙여주어야 인식.
		float var2 = 0.125f;
		
		float var3 = 0.1234567890123456789f;	// 유효숫자보다 길어도 float 선언 가능
		double var4 = 0.1234567890123456789;	// double도 표시되는 숫자보다 길어도 표시가능
		
		System.out.println(var1);				// 0.1
		System.out.println(var2);				// 0.125
		System.out.println(var3);				// 0.12345679 (입력값 0.1234567890123456789f)
												// 오차는 2진법으로 변환하는 과정에서 data 소실
		
		System.out.println(var4);				// 0.12345678901234568 (입력값 0.1234567890123456789)
											// 오차는 2진법으로 변환하는 과정에서 data 소실, float에 비하여 약 2배의 유효숫자.

		/////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		// 2. 10의 거듭제곱 형식의 숫자 표기
		float var5 = 3.14f;
		float var6 = 314e-2f;					// E(e)로 10의 거듭제곱 수를 숫자로 표현 가능
		double var7 = 123.45;
		double var8 = 0.12345e3;				// E(e)로 10의 거듭제곱 수를 숫자로 표현 가능
		
		System.out.println(var5 + ",  " + var6);	// e를 이용해도 값은 동일함 
		System.out.println(var7 + ",  " + var8);	// e를 이용해도 값은 동일함
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 3. 논리타입 변수 boolean
		// boolean test1 = 1; (X)				// boolean은 true or false로 저장되는 논리변수. 0 or 1로 저장불가.
		boolean test1 = true;
		boolean test2 = false;
		
		System.out.printf("%s, %s%n",			// 문자열 출력(%s로 출력가능)
				          test1, test2);
		
		int x= 10;
		boolean result1 = (x == 20);			// 기댓값 : false
		boolean result2 = (x != 20);			// 기댓값 : true
		boolean result3 = (x > 20);				// 기댓값 : false
		boolean result4 = (x > 0 && x < 20);	// 기댓값 : true
		boolean result5 = (0 < x && x < 20);	// 기댓값 : ture (논리회로 테스트)
		boolean result6 = (x < 0 || x > 20);	// 기댓값 : false
		
		System.out.printf("%s, %s, %s, %s, %s, %s%n",
				          result1, result2, result3, result4, result5, result6);
		
		boolean stopSignal = true;
		if(stopSignal) {						// 조건구문 내에서 참, 거짓 판단을 boolean 변수가 대체 가능함
			System.out.println("장비를 정지합니다");
		} else {
			System.out.println("작업을 계속합니다");
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 4. 실수타입 변수 사용 주의사항
		double a = 0.1;							// 2진법으로 변환시 무환소수가 되므로 컴퓨터에서 0.1이 아니고 0.1에 가까운 수로 저장됨.
		double b = 0.2;							// 2진법으로 변환시 무환소수가 되므로 컴퓨터에서 0.2가 아니고 0.2에 가까운 수로 저장됨.
		double c = 0.3;
		
		System.out.println(a + " + " + b + " = " + (a + b));		// 0.1 + 0.2 = 0.30000000000000004 (오차발생)
		System.out.println(c);										// 0.3
		
		boolean result = ((a + b) == c);							// 0.3과 0.30000000000000004는 차이가 있으므로 false
		
		System.out.println("논리: double " + a + " + double " + b + " = double " + c + " (" + result+ ")");
		
		System.out.println("----- 출력 끝 -----");
		
	}
	
}