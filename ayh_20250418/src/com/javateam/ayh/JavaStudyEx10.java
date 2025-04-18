package com.javateam.ayh;

public class JavaStudyEx10 {
    public static void main(String[] args) {
    	
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 1. null과 NullPointerException
    	
    	int[] intArray = new int[2];		// 2칸짜리의 배열 생성. 초기값은 0이므로  { 0, 0 } 이 생성됨. 
    	System.out.println(intArray[0]);	// 0
    	System.out.println(intArray[1]);	// 0
    	// System.out.println(intArray[2]);	// 3칸째는 없으므로 에러
    	
    	intArray = null;
    	// intArray[0] = 10;				// intArray의 값을 null로 변경하면서 참조위치를 지웠으므로 값을 저장할 수 없음. (NullPointerException 에러)
    	// System.out.println(intArray[1]);	// 참조위치가 사라져 null선언 되기 전의 intArray[1]의 값을 불러올 수 없음.(NullPointerException 에러)
    	
    	String str = "사랑합니다 고갱님";	 
    	System.out.println("총 문자수 : " + str.length() );
    	
    	str = null; 
    	// System.out.println("총 문자수 : " + str.length() );	// 참조위치가 사라져 null선언 되기 전의 str의 문자열을 불러올 수 없음.(NullPointerException 에러)
    
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 번외) 코드의 안정성을 점검하는 방어적 코드??
    	// null을 입력 후 값을 참조하는 과정에서 메모리를 경고하는 경고창을 확인하였으나 내용을 명확히 확인하지 못하였으나, 해당 경고창 재현이 불가함.
    	
    	// 해당 경고창은 하기의 경우로 추정됨.
    	// 1. NullPointerException 예상: 참조 변수가 null 상태에서 이를 사용하려고 했기 때문에 경고가 나타났을 수 있음.
    	// 2. 힙 메모리 관리 우려: 메모리 누수 가능성이 있다고 판단한 경우.
    	
    	
    	// (case 1) NullPointerException 방지
    	// - 예외처리 간소화하고 프로그램의 중단을 방지하여 안정적으로 동작할 수 있도록 함
    	/*
    	if (myObject != null) {
    	    System.out.println(myObject.toString());
    	} else {
    	    System.out.println("myObject가 null입니다.");
    	}
    	*/
    	
    	
    	// (case 2) 코드의 가독성과 유지보수성 향상
    	// - 개발자가 코드의 의도를 명확히 이해할 수 있도록 도와줌 (특히 팀프로젝트에서 다른 개발자가 동작방식을 쉽게파악 -> 유지보수 용이)
    	
    	/* 예시 - 여기서는 정의가 되지 않아 실제 실행되지 않으므로, 주석처리함.
    	if (inputString != null && !inputString.isEmpty()) {
    	    processString(inputString);
    	}
    	*/
    	
    	
    	// (case 3) 데이터 무결성 보호
    	// - null 확인 없이 객체를 사용하면 예기치 않은 동작이나 데이터 손상을 초래할 수 있음.
    	/*
    	if (userInput != null) {
    	    saveToDatabase(userInput);
    	} else {
    	    System.out.println("사용자 입력이 null입니다. 데이터베이스에 저장하지 않습니다.");
    	}
    	*/
    	
    	
    	// 방어적 코드의 단점
    	// a) 코드가 길어짐 - 모든 변수에 대하여 null을 테스트 할 경우 코드가 복잡해지고 장황해짐
    	// b) 성능 하락 - 성능에 영향을 미칠수 있으나 대부분의 현대 JVM에서는 미미한 수준
    	
    	
    	// 현실적인 대안은?
    	// Optional 클래스나 Objects.requireNonNull() 같은 유틸리티를 활용하여 코드 간소화
    	
    	
    	// (case 4) Optional 클래스 활용
    	// - null을 방지하며 직관적인 코드
    	/*
    	Optional<String> optional = Optional.ofNullable(inputString);
    	optional.ifPresent(System.out::println); // 값이 있으면 출력
    	*/
    	
    	
    	// (case 5) Objects 클래스 활용
    	// - null 값을 명시적으로 처리할 수 있음 	
    	/*
    	Objects.requireNonNull(myObject, "myObject는 null일 수 없습니다.");
    	*/
    	
    	
    	
    }
}