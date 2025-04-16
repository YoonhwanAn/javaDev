package com.javateam.ayh;

public class JavaAcadEx17 {

	public static void main(String[] args) {
		
		// 가변 배열
		int arr2[][] = new int[3][]; 		// (O) 행:고정, 열:가변
		// int arr2[][] = new int[][2]; 	// (X) 행 가변, 열:고정. 불가능

		// arr2[0] = new int[5];
		arr2[0] = new int[] { 1, 2, 3, 4, 5 };
		arr2[1] = new int[] { 6, 7, 8 };
		arr2[2] = new int[] { 9, 10 };
		
		// (case 1) for를 이용하여 다차원 배열을 출력
		System.out.println("a) for문 출력----------");
		
		for (int i = 0; i < arr2.length; i++) {				// 행
			
			for (int j = 0; j < arr2[i].length; j++) {		// 열
				
				System.out.print(arr2[i][j] + " ");
				
			}
			
			System.out.println();
		}

		
		// (case 2) foreach를 이용하여 다차원 배열을 출력
		System.out.println("b) foreach문 출력----------");
		
		for (int arr1[] : arr2) {		// 2차원배열(arr2)의 낱개는 arr1[] (배열임을 나타내는 임의의 변수이므로, arr1 일 필요는 없음)
				
			for (int n : arr1) {		// 1차원배열(arr1)의 낱개는 n
				
				System.out.print(n + " ");
					
			}
				
			System.out.println();
		}
		
 	}

}
