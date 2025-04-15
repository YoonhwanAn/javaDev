package com.javateam.ayh;

public class JavaAcadEx11 {

	public static void main(String[] args) {
		
		// 국,영,수 총점과 평균을 내보자 - total, average 변수
		// (case 1) average를 int로 선언 후 계산하는 경우 (total은 항상 정수이므로 int 고정)
		int kor = 86;
		int eng = 92;
		int math = 70;
		
		int total = kor + eng + math;
		
		int average1 = total / 3; 		// 평균 int
		
		System.out.printf("총점 = %d%n", total);
		System.out.printf("평균(case1) = %d%n", average1);		// (X, 소숫점 미표현) 정수는 %d로 표현

		// (case 2) average를 float로 선언 후 계산하는 경우 (출력 formatter로)
		float average2 = total / 3;					// (X) int-int 계산으로 정수값이 float에 저장  (82가 float에 저장)
		float average3 = total / 3F;				// (O) int-float 계산으로 실수값이 float에 저장 (82.33... 이 float에 저장)
		float average4 = (float)total / 3;			// (O) float-int 계산으로 실수값이 float에 저장 (82.33... 이 float에 저장)
		float average5 = (float)(total / 3);		// (X) int-int 계산으로 구해진 정수값이 float로 변환된 값이 float에 저장됨 (82를 float로 치환한 82.0..이 float에 저장)
		
		System.out.printf("평균(case2) = %.2f%n", average2);	// %.2f - 소숫점 둘째자리의 실수
		System.out.printf("평균(case3) = %.2f%n", average3);
		System.out.printf("평균(case4) = %.2f%n", average4);
		System.out.printf("평균(case5) = %.2f%n", average5);
		
		// (case 3) 반올림
		// 소숫점 2째자리에서 반올림 -> 소숫점 1자리의 실수로 표현
		
		float average6 = (float)(Math.round(average3 * Math.pow(10,  1)) / Math.pow(10, 1));
		// System.out.printf("평균(case6) = %.2f%n", average6);
		// System.out.printf("평균(case6) = %.1f%n", average6);
		System.out.printf("평균(case6) = %s%n", average6);
		
	} // main

} // class
