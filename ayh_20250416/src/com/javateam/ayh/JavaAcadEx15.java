package com.javateam.ayh;

public class JavaAcadEx15 {

	public static void main(String[] args) {
		
		// 다차원 배열(multi - demension) 배열
		// 2차원 배열
		
		// 선언방법
		int arr2[][]; // (O) 기본적인 배열 선언(가장 많이 사용됨)
		// int [][]arr2; // (O) 배열임을 먼저 명확히 표현 (가독성 높음)
		// int []arr2[]; // (O) 잘 안씀.
		// int [3]arr2[2]; //(x)
		
		// 비고) 3차원 선언 
			// int arr[][][];	// 기본적인 3차원 배열 선언
			// int []arr[][];	// [] 위치만 변경된 표현
			// int [][]arr[];	// 배열 형태를 강조하는 방식
			// int [][][]arr;	// 가장 직관적인 3차원 배열 표현
		
		
		// 할당방법
		// arr2 = new int[][]; 								// (x)
		// arr2 = new int[3][2]; 							// 2차원 배열 : 행렬(matrix) (O) [행][열]
			// 행열 생성 예시
			// arr2[0][0]  arr2[0][1]   → 첫 번째 행
			// arr2[1][0]  arr2[1][1]   → 두 번째 행
			// arr2[2][0]  arr2[2][1]   → 세 번째 행
		
		arr2 = new int [][] { { 1, 2}, 
							  { 3, 4}, 
							  { 5, 6} };	// (O)
		// arr2 = { { 1, 2}, { 3, 4}, { 5, 6} }; 			// 틀린 선언방법;
		
		// 배열 선언 + 할당
		int arr3[][] = { { 1, 2}, 
						 { 3, 4}, 
						 { 5, 6} } ; 
		
		// 개별 요소 접근
		System.out.println(arr2[0][1]);	// 2
		
		System.out.println(arr3[0][0] + "  " + arr3[0][1]);	// 1  2
		System.out.println(arr3[1][0] + "  " + arr3[1][1]);	// 3  4
		System.out.println(arr3[2][0] + "  " + arr3[2][1]);	// 5  6
		
 	}

}
