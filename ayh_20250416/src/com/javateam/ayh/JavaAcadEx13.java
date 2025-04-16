package com.javateam.ayh;

public class JavaAcadEx13 {

	public static void main(String[] args) {
		
		// 배열
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		// (case 1)전체 요소 나열
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
			
		} 
		
		// (case 2) foreach 문(foreach loop) : enhanced for loop  (** each가 나오면 반복문인 경우가 많음 **)
		// ** 형식) for (배열의 요소 : 배열 변수) { ... }
		// 개별요소 접근 : 다음요소(next element) 접근 방식
		// index 방식보다는 "다량" 요소 접근시 "속도" 향상됨 (읽어야할 배열이 많은 경우 속도 향상)
		// ex) 이마트의 식당 번호표 방식(일반) <-> 구내식당(foreach)
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
		
			// 비고) Copilot 추가설명
		
			// a) for-each문은 배열이나 컬렉션(List, Set, Map 등)을 순회할 때 사용됩니다.

			// b) 일반 for문과 달리 인덱스를 직접 관리할 필요 없이 요소를 하나씩 자동으로 가져옵니다.

			// c) 코드가 간결해지고 가독성이 높아지는 장점이 있어요!
		
		
	}

}
