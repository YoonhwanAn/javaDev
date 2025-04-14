package com.javateam.ayh;

public class JavaAcadEx3 {

	public static void main(String[] args) {
		
		// 문장(statement)  statement는 '진술', '서술'의 의미로 프로그래밍에서는 실행가능한(executable) 최소의 독립적인 코드조각
		// 순차문, 조건문, 반복문, (조건/반복)분기문
	
		// 순차문 : 위에서 아래로 순리대로 실행
		/*
		System.out.println(1+2);
		System.out.println(3+4);
		*/
		
		// 조건문
		int score = 80;
		
		// Case1) 조건문 반복사용
		/*
		if (score >= 60) {
			System.out.println("합격");
		}
		
		if (score < 60) {
			System.out.println("불합격");
		} 
		*/
		
		// Case2) else 사용
		/*
		if (score >= 60) {
			System.out.println("합격");
		} else {							// 그외의 모든 경우(기타 등등)
			System.out.println("불합격");
		}
		*/
		
		// Case3) 한 문장인 경우 중괄호 없이 입력 가능
		/*
		if (score >= 60)
			System.out.println("합격");
		else							// 그외의 모든 경우(기타 등등)
			System.out.println("불합격");
		*/
		
		// Case4) 점수(score)에 따른 학점(credit)
		// A : 90 ~ 100, B : 80 ~ 89
		// C : 70 ~ 79, D : 60 ~ 69
		// F : 0 ~ 59
		if (score >= 90 && score <= 100) {
			System.out.println("시험 결과 " + score + "점을 받으셔서 ");
			System.out.println("A학점입니다");
		} else if (score >= 80 && score < 90) {
			System.out.println("시험 결과 " + score + "점을 받으셔서 ");
			System.out.println("B학점입니다");
		} else if (score >= 70 && score < 80) {
			System.out.println("시험 결과 " + score + "점을 받으셔서 ");
			System.out.println("C학점입니다"); 
		} else if (score >= 60 && score < 70) {
			System.out.println("시험 결과 " + score + "점을 받으셔서 ");
			System.out.println("D학점입니다");
		} else {
			System.out.println("시험 결과 " + score + "점을 받으셔서 ");
			System.out.println("F학점입니다");
		}

		// case5) 마찬가지로 한 문장이므로 중괄호 없이 입력 가능
		/*
		if (score >= 90 && score <= 100)
			System.out.println("A학점");
		else if (score >= 80 && score < 90)
			System.out.println("B학점");
		else if (score >= 70 && score < 80)
			System.out.println("C학점");
		else if (score >= 60 && score < 70)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		*/	
	}
}
