package com.javateam.ayh;

public class JavaStudyEx11 {
    public static void main(String[] args) {
    	
    	// 문자열(String)과 다양한 매서드
    	
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 1. 선언방법
    	// (a) 선언, 대입 따로
    	String name;
    	name = "안윤환";
    	System.out.println("이름 : " + name);   	
    	
    	// (b) 선언, 대입 동시
    	String hobby = "명상";	
    	System.out.println("취미 : " + hobby);
    	
    	
    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 2. 문자열 참조의 비교 (대입 VS 객체생성)
    	// (a) 대입 시 동일한 참조 사용
    	String strVar1 = "강아지";
    	String strVar2 = "강아지";	// 동일한 문자열을 선언하면 같은 참조로 처리함.
    	
    	if(strVar1 == strVar2)
    		System.out.println("strVar1과 strVar2는 참조가 같음");
    	else
    		System.out.println("strVar1과 strVar2는 참조가 다름");
    	
    	// (b) 객체생성 시 서로 다른 참조 사용
    	String strVar3 = new String("강아지");
    	String strVar4 = new String("강아지");	// 새로운 객체를 생성하여 입력하면 다른 참조로 처리함.
    	
    	if(strVar3 == strVar4)
    		System.out.println("strVar3과 strVar4는 참조가 같음");
    	else
    		System.out.println("strVar3과 strVar4는 참조가 다름");
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 3. 문자열이 동일한지 알고 싶을 때 - equal() method
    	// 참조가 달라도 값이 같은지를 식별 가능.
    	// (a) 2-(b)의 유사 예제에서 equal test
    	String strVar5 = new String("호랑이");
    	String strVar6 = new String("호랑이");	// 새로운 객체를 생성하여 입력하면 다른 참조로 처리함.
    	
    	if(strVar5.equals(strVar6))
    		System.out.println("strVar5과 strVar6는 문자열이 같음");
    	else
    		System.out.println("strVar5과 strVar6는 문자열이 다름");
    	
    	//(b) 빈문자열의 경우
    	String strVar7 = "";
    	if(strVar7.equals(""))
    		System.out.println("strVar7의 변수가 참조하는 String의 객체는 빈문자열");
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 4. 문자열에서 특정문자(char)만 추출 - charAt() method
    	String korean = "가나다라마바사아자차카타파하";
    	char charValue = korean.charAt(3);
    	
    	System.out.println("선택한 문자 : " + charValue);
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 5. 문자열의 길이를 알고 싶을 때 - length() method
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	int length = alphabet.length();
    	
    	System.out.println("alphabet의 글자수 : " + length);
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 6. 특정문자열을 다른 문자열로 대체할 때 - replace() method
    	// String 객체의 문자열은 변경불가한 특성을 지니므로, 새로운 객체에 변경된 문자열 저장함.
    	String oldStr = "멍멍이는 우리의 삶에 매우 가까운 동물이다. 멍멍이는 귀엽다.";
    	String newStr = oldStr.replace("멍멍이", "강아지");
    	
    	System.out.println(oldStr);
    	System.out.println(newStr);
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 7. 문자열을 일부구간 잘라오고 싶을 때 - substring() method
    	String num = "0123456789";
    	
    	// (a) 선택한 칸부터 끝까지. - substring(int beginIndex)
    	String subStr1 = num.substring(5);	// index는 0부터 시작함에 주의
    	System.out.println(subStr1);
    	
    	// (b) 선택한 칸부터 다음 선택한 칸 이전까지. - substring(int beginIndex, int EndIndex)
    	String subStr2 = num.substring(5, 8); // 동작방식 : [5, 8) -> 5이상 8미만으로 작동함에 주의
    	System.out.println(subStr2);
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 8. 문자열 내에서 특정 문자열을 찾을 때 - indexOf() method
    	String fruitsGameIntro = "딸기 당근 수박 참외 메론 게임";
    	int index1 = fruitsGameIntro.indexOf("수박"); // 문자열 중 특정 문자열이 있다면 문자열의 시작위치를 표기 (첫번째 칸 index = 0, 띄워쓰기도 1칸으로 포함함)
    	System.out.println("문자열 중 [수박]의 index : " + index1);
    	int index2 = fruitsGameIntro.indexOf("호박"); // 특정 문자열이 없다면 -1 표기
    	System.out.println("문자열 중 [호박]의 index : " + index2);
    	String cemeteryGameIntro = "아 공동묘지에~ 아 올라갔더니~ 아 시체가 벌떡~ 아 시체가 벌떡~ 벌떡! 벌떡! 벌떡벌떡벌떡!";
    	int index3 = cemeteryGameIntro.indexOf("벌떡"); // 특정 문자열이 중복되어 존재할 경우 가장 빠른 문자열의 index만 표기됨.
    	System.out.println("문자열 중 [벌떡]의 index : " + index3);
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 9. 문자열 내에서 특정 문자열을 존재여부만 판단 - contains() method 
    	String frypanGameIntro = "팅팅팅팅 탱탱탱탱 팅팅탱탱 후라이팬 놀이";
    	boolean result = frypanGameIntro.contains("후라이팬"); // 문자열이 있으면 true, 없으면 false
    	System.out.println("문자열 중 [후라이팬]은 있는가? : " + result);
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 10. 구분자로 표기된 여러가지 내용이 담긴 문자열을 분리 - split() method
    	String students = "김철수,이영희,박민수,정상근,최덕팔";
    	String[] studentName = students.split(",");
    	System.out.println("학생1 : " + studentName[0]);
    	System.out.println("학생2 : " + studentName[1]);
    	System.out.println("학생3 : " + studentName[2]);
    	System.out.println("학생4 : " + studentName[3]);
    	System.out.println("학생5 : " + studentName[4]);
    	
    	for (int i = 0; i < studentName.length; i++)
    		System.out.println(studentName[i]);
    	
    }
}