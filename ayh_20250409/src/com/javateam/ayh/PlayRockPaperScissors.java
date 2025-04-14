package com.javateam.ayh;

import java.util.Scanner;

public class PlayRockPaperScissors {

	public static void main(String[] args) {

		// 초기 문구 출력
		System.out.println("가위바위보 시뮬레이터 입니다.");
		System.out.println("당신이 무엇을 낼지 결정하세요. (가위:1, 바위:2, 보:3)");
		System.out.print("당신의 선택은? : ");
	
		// 플레이어 숫자입력  ----------- 수정대상 1,2,3 외의 숫자를 선택했을 때 반복시키기
		Scanner sc = new Scanner(System.in);
		int playerSelect = sc.nextInt();
		
		sc.close();

		// 컴퓨터 숫자 랜덤선택
		int computerSelect = 0;
		computerSelect = (int)(Math.random() * 3) + 1;  // (가위:1, 바위:2, 보:3)
		
		// 플레이어 입력 숫자 -> 문자 변경 
		String playerSelectIt = "기본값";
		
		if(playerSelect==1) {
			playerSelectIt = "가위";
		} else if(playerSelect==2) {
			playerSelectIt = "바위";
		} else {
			playerSelectIt = "보";
		}
		
		// 컴퓨터 랜덤 숫자 -> 문자 변경 
		String computerSelectIt = "기본값";
		
		if(computerSelect==1) {
			computerSelectIt = "가위";
		} else if(computerSelect==2) {
			computerSelectIt = "바위";
		} else {
			computerSelectIt = "보";
		}
		
		// 승부 판정(숫자) 및 승부 판정(문자)
		int comparison = playerSelect - computerSelect;
		String winnerChoice = "기본값";
		
		if(comparison==0) {
			winnerChoice = "비겼습니다.";
		} else if(comparison== 1 || comparison==-2) {
			winnerChoice = "이겼습니다.";
		} else {
			winnerChoice = "졌습니다.";
		}
		
		// 결과 출력
		System.out.println(" ");
		System.out.println("당신은 " + playerSelectIt + "를 내었습니다.");
		System.out.println("컴퓨터가 " + computerSelectIt + "를 내었습니다.");
		System.out.println(winnerChoice);
		
	} // main

} // class
