package com.javateam.ayh;

import java.util.Scanner;

public class JavaAcadEx5 {

	public static void main(String[] args) {

		
		// 1. 기본 case (특정 점수만 적용가능)--------------------------------------------------------------------------------
		/*
			int score = 90;
			char credit = 'F';
			
			switch(score) {
			
			// 스위치는 case by case 이므로 
			// case score >= 80 (X)
			// case 80 .. 90 : (X)
			// case 80 ~ 90 : (X)
			// if (score == 80) 에 해당
			
			case 90 : credit = 'A'; break;
			case 80 : credit = 'B'; break;
			case 70 : credit = 'C'; break;
			case 60 : credit = 'D'; break;
			
			// default란 case에 걸리지 않았을 때 실행되는 값, 반드시 존재할 필요는 없음.
			// default 60 : (X, if문의 else와 유사하므로 값 지정은 틀린표현)
			
			// default : credit = 'F';
			default : credit = 'F';
			
			// 작성 위치 : 문법적으로는 위치가 무관하지만 대개 '첫번째, 마지막'위치에 작성 권장.
			// default는 반드시 써야한다? -> 틀림
			
			} // switch
			
			System.out.println(credit);
		*/

		
		
		
		// 2. 기본 case 변형 하드코딩 (모든 점수에 대해서 대응가능 / Hell)----------------------------------------
		/*
			int score = 85;
			char credit = 'F';
			
			switch(score) {
			case 100 : case 99 : case 98 : case 97 : case 96 : case 95 : case 94 : case 93 : case 92 : case 91 : 
			case 90 : credit = 'A'; break;
			case 89 : case 88 : case 87 : case 86 : case 85 : case 84 : case 83 : case 82 : case 81 : 
			case 80 : credit = 'B'; break;
			case 79 : case 78 : case 77 : case 76 : case 75 : case 74 : case 73 : case 72 : case 71 :
			case 70 : credit = 'C'; break;
			case 69 : case 68 : case 67 : case 66 : case 65 : case 64 : case 63 : case 62 : case 61 : 
			case 60 : credit = 'D'; break;
			default : credit = 'F';
			} // switch				
			
			System.out.println(credit);	
		*/
		
		
		
		// (번외 1) break 없을 때 TEST  -> 결과 90,80 일때 o, oo, ooo 모두 출력, 70,60 일 때 oo, ooo 출력----------------------------------------
		/*
			int score = 90;
			
			switch(score) {
			case 90 : 
			case 80 :
				System.out.println("o");
			case 70 :
			case 60 :
				System.out.println("oo");
			case 50 :
			case 40 :
				System.out.println("ooo");
			} // switch
			
			System.out.println(credit);
		*/
		
		
		
		// 3. switch 내 변수 수정--------------------------------------------------------------------------------
		/*
		int score = 90;
		char credit = 'F';
		
		switch(score /= 10) {
		case 10 :
		case  9 : credit = 'A'; break;
		case  8 : credit = 'B'; break;
		case  7 : credit = 'C'; break;
		case  6 : credit = 'D'; break;
		default : credit = 'F';

		} // switch
		
		System.out.println(credit);
		*/
		
		
		// 4. 입력부 및 출력부 TEST--------------------------------------------------------------------------------
		
		// 학점 입력
		System.out.println("학점 입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		sc.close();
		
		char credit = 'F';
		
		switch(score /= 10) {
		case 10 :
		case  9 : credit = 'A'; break;
		case  8 : credit = 'B'; break;
		case  7 : credit = 'C'; break;
		case  6 : credit = 'D'; break;
		default : credit = 'F';

		} // switch
		
		// 여러가지 출력
		System.out.println(credit);
		System.out.println("학점 : " + credit);
		System.out.printf("학점 : %c%n", credit);
						
	} // main

} // class
