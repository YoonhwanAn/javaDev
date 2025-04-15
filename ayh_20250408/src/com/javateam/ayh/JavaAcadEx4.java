package com.javateam.ayh;

import java.util.Scanner;

public class JavaAcadEx4 {

	public static void main(String[] args) {
		
		// 조건문
		// int score = 60;
		
		// Case5) 점수(score)에 따른 학점(credit) #2
		/*
		if (score >= 90) {
			System.out.println("A학점입니다");
		} else if (score >= 80) {
			System.out.println("B학점입니다");
		} else if (score >= 70) {
			System.out.println("C학점입니다"); 
		} else if (score >= 60) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		*/
		
		// Case6) 점수(score)에 따른 학점(credit) #3
		/*
		char credit = 'F';
		
		if (score >= 90) {
			credit ='A';
		} else if (score >= 80) {
			credit ='B';
		} else if (score >= 70) {
			credit ='C';
		} else if (score >= 60) {
			credit ='D';
		} else {
			credit ='F';
		}
		System.out.println(credit+"학점입니다");
		*/
		
		// Case7) 점수(score)에 따른 학점(credit) #4
		
		/*
		//학점 입력부
		System.out.print("학점 입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		sc.close();
		
		char credit = 'F';
		
		if (score >= 90) {
			credit ='A';
		} else if (score >= 80) {
			credit ='B';
		} else if (score >= 70) {
			credit ='C';
		} else if (score >= 60) {
			credit ='D';
		} else {
			credit ='F';
		}
		System.out.println(credit+"학점입니다");
		*/
		
		// Case7) 점수(score)에 따른 학점(credit) #4
		//학점 입력부
		/*
		System.out.print("성적입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		sc.close();
		
		char credit = 'F';
		
		// score = score / 10;
		score /= 10;
		
		if (score == 9 || score == 10)
			credit ='A';
		else if (score == 8)
			credit ='B';
		else if (score == 7)
			credit ='C';
		else if (score == 6)
			credit ='D';
		else
			credit ='F';
	
		System.out.println(credit+"학점입니다");
		*/
		
		// Case8) 점수(score)에 따른 학점(credit) #5
		//학점 입력부
		System.out.print("성적입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		sc.close();
		
		char credit = 'F';
		
		// score = score / 10;
		score /= 10;
		
		// credit = score == 10 ? 'A' : 
		
		if (score > 10 || score < 0) {
			System.out.println("잘못된 학점을 입력하셨습니다.(0~100)");
		} else {
			credit = score == 9 || score == 10 ? 'A' :
				     score == 8 ? 'B' :
				     score == 7 ? 'C' :
				     score == 6 ? 'D' : 'F' ;
			System.out.println(credit+"학점입니다");
		}
	}
}
