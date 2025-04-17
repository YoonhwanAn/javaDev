package com.javateam.ayh;

public class JavaAcadEx19 {
	
	public static void main (String[] args) {
				
		// 외부인자 입력을 통한 성적 출력 // (순서)국어 영어 수학
		// 값을 입력하지 않고 외부에서 받아올 수 있다.(중요!!!!!!!!!!!!!!!!!!!!!!!)
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		
		int total = kor + eng + math;
		
		double aver1 = total / 3.0;
		double aver2 = Math.round(aver1 * 10.0) / 10.0;

		System.out.printf("점수 합 : %d%n", total);
		System.out.printf("점수 평균 : %.2f%n", aver1);
		System.out.println("점수 평균 : " + aver2);
		
	}
	
}
