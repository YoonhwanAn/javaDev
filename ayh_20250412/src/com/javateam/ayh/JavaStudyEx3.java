package com.javateam.ayh;

public class JavaStudyEx3 {

	public static void main(String[] args) {  
		
	// 1. 변수설정 TEST 오버프롤우 언더플로우
								
		int a = 2147483647;				// int 최대값 2,147,483,647
		int b = -2147483648;			// int 최소값 -2,147,483,648
		int c = a + 1;
		int d = b - 1;
		
		System.out.printf("%d + 1 = %d%n", 		// int 최대값에서 +1
						  a, c);
		System.out.printf("%d - 1 = %d%n", 		// int 최소값에서 -1
				  		  b, d);
		System.out.println();
		
	///////////////////////////////////////////////////////////////////////////////////////////////	
		
	// 2. 이스케이프 문자열
		
		// String case1 = "그는 "안녕하세요"라고 말했다.";
		String case1 = "그는 \"안녕하세요\"라고 말했다.";		// 문자열 내 ""를 출력하려면 반드시 \를 이용하여 \"로 표기해야함.
		String case2 = "이것이 '그것'입니까?";
		// String case3 = "역슬래시 기호는 \이다.";
		String case3 = "역슬래시 기호는 \\이다.";				// 문자열 내 \기호를 표기하고 싶다면 \\로 표기	
		String case4 = "\u0041";						// 4자리의 16진수와 대응되는 유니코드를 입력
		String case5 = "\u263A";
		String case6 = "지나간\t날들이\t너무나도\t아쉬워서";
		String case7 = "따스한\n봄날을\n만끽하며";
		String case8 = "딸기당근수박\r참외메론";
		
		System.out.println(case1);
		System.out.println(case2);
		System.out.println(case3);
		System.out.println(case4);
		System.out.println(case5);
		System.out.println(case6);
		System.out.println(case7);
		System.out.println(case8);
		
	/////////////////////////////////////////////////////////////////////////////////////////////

	// 3. """ 문자열 (java 13 이상)
		String str1 = "" + 								// \n 라인피드, \t 탭, \" 문자에 "작성
					"{\n" + 
					"\t\"id\":\"winter\",\n" +
					"\t\"name\":\"눈송이\",\n" +
					"}";
		
		String str2 = """
				{
					"id":"winter",
					"name"="눈송이"
				}
				""";									// """ 내 문자열 통으로 인식
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("----- 출력 끝 -----");
		
		
	}
	
}