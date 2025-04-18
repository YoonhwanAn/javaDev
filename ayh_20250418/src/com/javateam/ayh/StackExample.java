package com.javateam.ayh;

public class StackExample {
    public static void main(String[] args) {		// 1. main() 호출 -> 첫 번째 스택 프레임 생성
        methodA();									// 2. mathodA를 실행
    }												// 8. mathodA가 종료되어 빠져나왔으므로 main()을 종료 -> 첫 번째 스택 프레임 제거

    public static void methodA() {					// 3. 2항에 따라 mathodA가 호출됨. -> 두 번째 스택 프레임 추가
        methodB();									// 4. mathodB를 실행
    }												// 7. mathodB가 종료되어 빠져나왔으므로 mathodA를 종료 -> 두 번째 스택 프레임 제거

    public static void methodB() {					// 5. 4항에 따라 mathodB가 호출됨. -> 세 번째 스택 프레임 추가
        System.out.println("메서드 B 실행");
    }												// 6. mathodB를 종료 -> 세 번째 스택 프레임 제거
}
