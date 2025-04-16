package com.javateam.ayh;

public class JavaAcadEx16 {

	public static void main(String[] args) {
		
		// 다차원 배열(multi - demension) 배열
		// 2차원 배열
		
		// 배열 선언 + 할당
		int arr2[][] = { { 1, 2}, 
						 { 3, 4}, 
						 { 5, 6} } ; 
		
		// 전체 요소 접근
		System.out.println("배열의 길이 : " + arr2.length);
		
		// 다차원 배열의 길이 : 하위 차원의 갯수
		// 낱개의 전체 요소 수 (X)
		// ex) 2차원 배열의 길이 => 1차원 배열의 갯수
		
		// 2차원 배열의 전체 요소 갯수를 구하려면?
		// 행(row) * 열(column)
		// arr2.length * arr2[0].length
		System.out.println("2차원 배열의 전체 요소 갯수 : " + arr2.length * arr2[0].length);
		
		// (case 1) for를 이용하여 다차원 배열을 출력
		System.out.println("a) for문 출력----------");
		for (int i = 0; i < arr2.length; i++) {				// 행
			
			for (int j = 0; j < arr2[i].length; j++) {		// 열 - 모든 행의 열이 동일하므로 arr2[i] 대신 (arr2[0] or arr2[1] or arr2[2])써도 무방
				
				System.out.print(arr2[i][j] + " ");
				
			}
			
			System.out.println();
		}
			
		// (case 2) foreach를 이용하여 다차원 배열을 출력
		
		System.out.println("b) foreach문 출력----------");
		for (int arr1[] : arr2) {		// 2차원배열(arr2)의 낱개는 arr1[]
				
			for (int n : arr1) {		// 1차원배열(arr1)의 낱개는 n
				
				System.out.print(n + " ");
					
			}
				
			System.out.println();
		}

		
 	}

}
