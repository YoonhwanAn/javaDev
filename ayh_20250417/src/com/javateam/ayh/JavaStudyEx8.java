package com.javateam.ayh;

// Animal 인터페이스 정의
interface Animal {
    void sound();  // 추상 메서드 (몸체가 없음)
}

class Dog implements Animal {  // 인터페이스 구현
    public void sound() {
        System.out.println("멍멍!");
    }
}

public class JavaStudyEx8 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // 출력: 멍멍!
    }
}