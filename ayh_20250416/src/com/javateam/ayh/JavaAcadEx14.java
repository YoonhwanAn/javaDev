package com.javateam.ayh;

import java.util.Arrays;

public class JavaAcadEx14 {

	public static void main(String[] args) {
		
		// 배열의 초기화
		// int arr1[] = new int[3];				// 초기값이 0인 3칸짜리 배열을 생성
		// int arr1[] = { 0, 0, 0 };				// 초기값이 0, 0, 0인 배열을 생성
		// int arr1[] = { 1, 2, 3 }; 			// 초기값이 1, 2, 3인 배열을 생성
		int arr1[] = new int[] { 1, 2, 3 };		// 초기값이 1, 2, 3인 배열을 생성
		// int arr1[] = new int[3] { 1, 2, 3 };	// (X) 불가능한 표현
		System.out.println("arr1 배열의 첫번째 값 : " + arr1[0]);

		int arr2[];
		arr2 = new int[] { 1, 2, 3 }; // (O)
		// arr2 = { 1, 2, 3 }; // (X) 불가능한 표현
		arr2 = new int[] { 4, 5, 6 };	//	기존 배열 갈아엎고 새 배열로 교체 가능
		System.out.println("arr2 배열의 두번째 값 : " + arr2[1]);
		
		/////////////////////////////////////////////////////////////////////////////////////////
		///
		// 질문관련 심화) int 배열의 타입을 변경하기는 어려움.
		
		// c(ase 1) for문으로 int배열에서 double 배열으로 값 이동
	    int arr3[] = new int[]{1, 2, 3};  // 기존 int 배열

	    // 크기가 동일한 double 배열 생성
		double[] doubleArr1 = new double[arr3.length];

        // 변환 및 복사
        for (int i = 0; i < arr3.length; i++) {
            doubleArr1[i] = arr3[i];  // int 값을 double로 변환
        }

        // 출력 확인
        System.out.println("double 배열: " + java.util.Arrays.toString(doubleArr1));
		
        
        // 2안) Java 8 이후라면 Arrays.stream을 이용하는 방법
        int[] arr4 = {1, 2, 3};

        // Stream을 활용해 double 배열로 변환
        double[] doubleArr2 = Arrays.stream(arr4)
                                   .mapToDouble(i -> i)  // int → double 변환
                                   .toArray();

        System.out.println("double 배열: " + Arrays.toString(doubleArr2));
        
        // 코파일럿 Arrays.stream 관련 함수 설명.
        /*
        1) Arrays.stream(arr4)
        arr4는 int[] 배열입니다.

        Arrays.stream(arr4)를 사용하면 arr4의 요소를 스트림(IntStream)으로 변환합니다.
        즉, arr4 내부의 요소들이 순차적으로 처리될 수 있는 흐름(Stream)으로 변환됩니다.

        2) .mapToDouble(i -> i)
        스트림 내 각 요소(int)를 double로 변환하는 과정입니다.
        mapToDouble(i -> i)는 각 숫자 i를 그대로 double 타입으로 변환합니다.
        여기서 i -> i는 람다 표현식(lambda expression)이며, i 값을 그대로 유지하면서 double 타입으로 변환하는 역할을 합니다.

        3️) .toArray()
        변환된 double 값들을 새로운 double[] 배열로 변환하여 반환합니다.
        즉, mapToDouble()으로 변환된 요소들을 double[] 형태로 받아서 doubleArr2에 저장합니다.
        */
        
        
	}

}
