package com.javateam.ayh;

// Flyable 인터페이스 정의
interface Flyable {}

// Bird와 Plane 클래스가 Flyable 인터페이스를 구현
class Bird implements Flyable {}
class Plane implements Flyable {}

public class JavaStudyEx7 {
    public static void main(String[] args) {
        Flyable pigeon = new Bird(); // Bird 객체 생성

        // pigeon이 Bird 클래스의 인스턴스인지 확인
        if (pigeon instanceof Bird) {
            System.out.println("pigeon은 Bird의 인스턴스입니다.");
        }

        // pigeon이 Plane 클래스의 인스턴스인지 확인
        if (pigeon instanceof Plane) {
            System.out.println("pigeon은 Plane의 인스턴스입니다.");
        } else {
            System.out.println("pigeon은 Plane의 인스턴스가 아닙니다.");
        }

        // pigeon이 Flyable 인터페이스를 구현했는지 확인
        if (pigeon instanceof Flyable) {
            System.out.println("pigeon은 Flyable 인터페이스를 구현합니다.");
        }
    }
}