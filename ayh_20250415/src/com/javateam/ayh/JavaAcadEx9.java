package com.javateam.ayh;

public class JavaAcadEx9 {

	public static void main(String[] args) {
				
		// 1. while 반복문 
		
//		// (case 1) 일반적인 경우
//		int count = 1;
//		int sum = 0;	// 합계
//
//		// for (; count <= 10;) {
//		while (count <= 10) {
//			
//			System.out.print(count + " ");
//			
//			// sum = sum +count
//			sum += count;
//			
//			System.out.printf("1 ~ %d까지의 중간합계 = %d%n",
//					count, sum);
//			
//			count++;
//
//		}
		
		// (case 2) 단축 - 짧을 수는 있으나 중간합계가 들어가는 경우 복잡해 질 수 있음
		int count = 1;
		int sum = 0;	// 합계
		
		while (count <= 10) {
			
			System.out.print(count + " ");

			sum += count++;		// (O), 합계 55
			// sum += ++count;	// (X), 합계 65
			
			System.out.printf("1 ~ %d까지의 중간합계 = %d%n",
					count-1, sum);	// 앞에서 count++로 인하여 값이 더해지므로, 출력시점에서 count=11이기 때문에 -1을 해야함.
		}

		System.out.println("\n1 ~ 10까지의 합계 = " + sum);	// println 내부에도 줄바꾸기 '\n' (line feed) 사용 가능.
	}

}
