package com.javateam.ayh;

public class JavaStudyEx9 {
    public static void main(String[] args) {
    	
    	
    	// 1. 참조타입 변수의 ==, != 연산방법
    	int[] arr1;
    	int[] arr2;
    	int[] arr3;
    	
    	arr1 = new int[] {1, 2, 3};
    	arr2 = new int[] {1, 2, 3};
    	arr3 = arr2;
    	
    	System.out.println(arr1 == arr2);		// false, arr1과 arr2는 동일한 배열이나 객체의 참조값이 다르므로, fasle로 출력됨에 유의
    	System.out.println(arr2 == arr3);		// ture
    	
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 2. 참조타입의 변수의 내용이 같은지를 확인하고 싶은 경우
    	String str1 = new String("Hello");		// 객체1 생성
    	String str2 = new String("Hello");		// 객체2 생성

    	if (str1 == str2) { 					// str1과 str2는 별도의 객체이므로, 객체의 참조값이 다름. -> 참조가 다릅니다.
    	    System.out.println("참조가 같습니다."); 
    	} else { 
    	    System.out.println("참조가 다릅니다."); 
    	}

    	if (str1.equals(str2)) { 				// str1과 str2는 객체에 저장된 내용이 동일함. -> 내용이 같습니다.
    	    System.out.println("내용이 같습니다."); 
    	} else { 
    	    System.out.println("내용이 다릅니다."); 
    	}
    	    	
    }
}