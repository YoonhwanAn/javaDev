package com.javateam.ayh;

import java.util.Arrays;

public class JavaAcadEx12 {

	public static void main(String[] args) {
				
		// 1. 배열이란????
		// 배열(array) : 참조 자료형 구조
		
		// 동일한 자료형이 다수 -> 배열
		// 자료형 발전단계
		// 단순 기본(원시) 자료형 1:1 (낱개의 자료를 수용)
		// 기본 자료형은 최대 8바이트까지만 자료를 수용함. (현재 기준)
		// 그 이상 크기의 자료 => 참조 자료형 사용.
		// ex) 문자열형 => (메모리 주소) 참조 자료형
		// ex) 쇼핑몰 사무실 ---> 물류 창고 : 별도로 구성
		// 1. 소규모 쇼핑몰(사무실, 창고 일체) -> 기본 자료형
		// 2. 중대규모 쇼핑몰(사무실, 창고 별도) -> 참조 자료형
		
		// 배열 변수 선언
		
		// int []arr;		// (O)
		// int arr[];		// (O) 둘다 사용 가능.
		
		// int arr[3];				// (X) 타 언어에서는 작동할 수 있으나, java에서는 불가.
		// int arr[] = new int[];	// (X) 배열의 공간갯수를 명시하지 않음. (몇 칸의 자료형인지 선언하지 않으면 틀린표현)
		// int arr[] = new int[3];	// (O) 일반적인 표현, 하기와 같이 선언과 할당을 분리해서 사용해도 무방함. 
		int arr[];			// 배열 변수의 선언
		arr = new int[3];	// 배열 변수의 (메모리 공간의) 할당(allocation) / c언어 malloc함수 (memory allocation)
		arr = new int[2];	// 공간 축소 가능 (new 때문에 기존 데이터는 삭제됨)
		arr = new int[5];	// 신규공간 할당 가능 (new 때문에 기존 데이터는 삭제됨)
		// 배열의 요소가 : 3개
		// index : 0, 1, 2 (O), 3(x)
		
		// new : (배열) 객체 생성 연산자 !!!!!!!
		// ===> 100% 참조형 연산자임!!!!!
		
		
		// 배열은 지역변수(값 선언X) 일지라도 기본값을 가짐
		// ex) int 배열 => 0, char 배열 => " ", double => 0.0
		arr[0] = 1;		// 개별 요소에 값을 대입 (선언된 5개의 칸 중 첫번째 요소에 해당 숫자를 대입)
		arr[3] = 2;		// 개별 요소에 값을 대입 (선언된 5개의 칸 중 네번째 요소에 해당 숫자를 대입)
		// arr[-1] = 1;	// (x) java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
						// 예외처리 메세지 : 에러 메세지
		
		System.out.println("배열 첫번째 요소 : " + arr[0]);
		System.out.println("배열 두번째 요소 : " + arr[1]);
		System.out.println("배열 세번째 요소 : " + arr[2]);
		System.out.println("배열 네번째 요소 : " + arr[3]);
		System.out.println("배열 다섯번째 요소 : " + arr[4]);
		
		// 배열의 길이 (요소의 크기)
		System.out.println("배열의 길이(요소의 갯수) : " + arr.length);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 질문 1) 한 가지의 배열에 여러가지 자료형이 들어갈 수 있는가??????????
		
		// object의 경우 다양한 형태의 자료형을 혼합해서 저장 가능함.(정수, 실수, 문자열, 기존배열, int[], String[], double[])
		Object obj [] = new Object[7];
		obj[0] = 1;		// 정수형 저장
		obj[1] = 0.01;	// 실수형 저장
		obj[2] = "test"; // 문자열 저장
		obj[3] = arr;	// 배열 저장
		obj[4] = new int[]{1, 2, 3};
        obj[5] = new String[]{"A", "B", "C"};  
        obj[6] = new double[]{1.1, 2.2, 3.3};

        // 배열 요소 불러오기 (형 변환 필수)
        int[] arrArray = (int[]) obj[3];  // Object → int[]
        int[] intArray = (int[]) obj[4];  // Object → int[]
        String[] strArray = (String[]) obj[5];  // Object → String[]
        double[] dblArray = (double[]) obj[6];  // Object → double[]

        // 출력 확인		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println("배열 일반 출력시 : " + obj[3]);
		System.out.println("arr 배열: " + Arrays.toString(arrArray));
        System.out.println("정수 배열: " + Arrays.toString(intArray));
        System.out.println("문자 배열: " + Arrays.toString(strArray));
        System.out.println("실수 배열: " + Arrays.toString(dblArray));
        System.out.println(((int[]) obj[4])[1]); // obj[4]의 배열에서 2번째 항을 출력하는 방법
        // System.out.println((obj[4])[1]); // 불가능
        // error : The type of the expression must be an array type but it resolved to Object
	}

}
