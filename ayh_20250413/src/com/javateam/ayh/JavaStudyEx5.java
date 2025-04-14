package com.javateam.ayh;

public class JavaStudyEx5 {

	public static void main(String[] args) {  
		
	// 1. + 연산자의 두가지 기능
	// 1) 덧셈연산 - 피연산자가 모두 숫자인 경우
	// 2) 문자열 결합연산 - 피연산자 중 하나가 문자열인 경우
	// but, 프로그램은 순차적으로 진행되므로 문자열이 나온 위치에서 연산을 판단하게 됨.
		
		int result1 = 10 + 2 + 8;
		// String result1 = 10 + 2 + 8; 		// int 값이므로 String에 저장 불가(Type mismatch)
		
		String result2 = 10 + 2 + "8";			// 10과 2를 덧셈 진행 후(12), "8"이 인식되어 12와 8을 문자열로 인식. 128 출력
		String result3 = 10 + "2" + 8;			// 숫자 10에서 "2"가 인식되어 10과 2와 8을 문자열로 인식. 1028 출력
		String result4 = "10" + 2 + 8;			// 처음부터 "10"이 인식되어 10과 2와 8을 문자열로 인식. 1028 출력
		String result5 = "10" + (2 + 8);		// 괄호 안의 내용을 가장 우선하여 처리하므로, (2 + 8)의 계산을 진행 후 "10"을 인식. 1010 출력
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		System.out.println("result5 = " + result5);
		
		System.out.println();
	
	// 2. 문자열(String)과 변수 기본타입의 변환
	// 문자로 입력받은 것을 숫자로 변경하여 계산하거나, 숫자를 문자로 변경하게되는 경우 유용함. 엑셀에 문자, 숫자 생각하면 쉬움.
	// parse (파싱)은 입력된 데이터(텍스트, 코드, 파일 등)를 특정 규칙이나 문법에 따라 분석하여 그 구조를 이해하고, 이를 통해 필요한 정보를 추출하는 과정
		
		
	// case1) 문자열 -> 변수 기본타입
		String a = "10";
		byte aValue = Byte.parseByte(a);				// 반드시 대문자로 시작하여야 함. 
		String b = "200";
		short bValue = Short.parseShort(b);				// 반드시 대문자로 시작하여야 함. 
		String c = "30000";
		int cValue = Integer.parseInt(c);				// Int.parseInt 가 아님에 주의! 반드시 대문자로 시작하여야 함. 
		String d = "40000000000";
		long dValue = Long.parseLong(d);				// 반드시 대문자로 시작하여야 함.
		String e = "12.345";
		float eValue = Float.parseFloat(e);				// 반드시 대문자로 시작하여야 함.
		String f = "12.34567";
		double fValue = Double.parseDouble(f);			// 반드시 대문자로 시작하여야 함.
		String g = "true";
		boolean gValue = Boolean.parseBoolean(g);		// 반드시 대문자로 시작하여야 함.
		
		System.out.println("aValue = " + aValue);
		System.out.println("bValue = " + bValue);
		System.out.println("cValue = " + cValue);
		// System.out.println("bValue + cValue = " + bValue + cValue);		// 20030000 으로 출력됨. 1항의 +연산자 문제로 보임.
		System.out.println("bValue + cValue = " + (bValue + cValue));		// 숫자로 변환되었으므로, 30200으로 정상출력.
		System.out.println("dValue = " + dValue);
		System.out.println("eValue = " + eValue);
		System.out.println("fValue = " + fValue);
		System.out.println("gValue = " + gValue);
		
		System.out.println();
		
	// case2) 변수 기본타입 -> 문자열
		double h = 3.14;
		String hString = String.valueOf(h);
		double i = 1.414;
		String iString = String.valueOf(i);
		
		System.out.println(hString);
		System.out.println(iString);		
		System.out.println("hString + iString = " + (hString + iString));	// 문자열이므로 3.141.414 로 출력됨.
		System.out.println();
		
	// 비고) 문자열과 숫자가 섞인 상태라면 1항의 조건에 따라 원하지 않는 결과 값이 나올 수 있으므로 주의!!!!!!!!!!!
		
		System.out.println(b + c + h);						// 200300003.14	(문자열 + 문자열 + 숫자)
		System.out.println(bValue + cValue + hString);		// 302003.14	(숫자 + 숫자 + 문자열)	
		System.out.println(bValue + cValue + h);			// 30203.14		(숫자 + 숫자 + 숫자)
		System.out.println();
		
	// 3. 변수의 위치
	// 잘못된 예시
		/*
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 +5;					// if문 내부에서 변수 v2가 선언되었으므로, if문 밖에서는 if문 내의 변수 v2를 읽을 수 없음.
		*/
		
		System.out.println("----- 출력 끝 -----");
		
	}
	
}