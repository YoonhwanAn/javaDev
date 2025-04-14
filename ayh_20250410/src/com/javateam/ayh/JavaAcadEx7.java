package com.javateam.ayh;

public class JavaAcadEx7 {

	public static void main(String[] args) {

		// 1. for 구문 내 증감을 빼도 되는가?-----------------------------------------------------------------------------
		
//		// case 1) 일반적인 경우
//		// i를 for문 밖에서 해도 작동되나 그렇게 하면 for문이 끝나도 i가 살아남이있음.
//		// i : integer, index
//		// i(기능상) : counter(계수 변수) 반복문에 주로 등장
//		
//		// for (;;) { 			// 사용가능
//		// for () {				// (X) 사용불가능, 에러, 컴퓨터가 변수를 인식불가.
//		for (int i = 1; ; ) {
//			if (i <= 10) {	
//				
//				// i++; // (X)				// 위치상 1이 더해지고 작동되므로 원하는 방향이 아님.
//				System.out.print(i + " ");
//				i++; // (O)
//				
//			} else {
//				break;
//			}
//			// i++; // (O)					// 작동은 하나 구문상에서 멀어지므로 비추천
//		}
//		System.out.println();
//		
//		// case 2) sysout 내에 i++ 적용 시
//		for (int i = 1; ; ) {	
//			if (i <= 10) {	
//				
//				System.out.print(i++ + " ");		// 최적화는 뛰어나나 직관적이지 못함.
//				//System.out.print(++i + " "); 		// 먼저 더하고 실행하므로 2~11로 표기됨.
//				
//			} else {
//				break;
//			}
//		}
//		System.out.println();
			
		
		// 2. for 구문 내 증감을 빼도 되는가?-----------------------------------------------------------------------------
		
		// case 1) 반복 조건식(한계식)은 여러개의 항 불가능. for(초기화식, 조건식, 증감식)으로 구성되므로 초기화식, 증감식은 복수항 구성가능.

		for (int i=1, j=1; i<=10; i++, j++) {  // (O)
		// for (int i=1, j=1; i<=1, j<=10; i++, j++) { // (X)
				System.out.print(i + "," + j + "  ");
		}
	
		System.out.println();
		
	
	} // main

} // class
