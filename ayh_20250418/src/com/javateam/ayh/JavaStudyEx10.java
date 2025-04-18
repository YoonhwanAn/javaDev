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
    	
    }
}