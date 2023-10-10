package pack01.method;

import java.security.PublicKey;

public class Car {
//	1. 멤버
//	2. 속성
//	3. 메소드 main메소드
//메소드의 선언 (정의)
//접근 제한자 : 퍼블릭 프로텍트 디폴트 프라이빗
//리턴 타입 : 보이드냐 보이드가 아니냐
//	1 접근 제한자 2 리턴타입 3 메소드명 4 매개변수 파라메터 {
//	코드
//	calss 타입 외 소문자 시작 , 카멜
	public void bchMethod() {
		System.out.println("void형태는 return타입 없음.");
		System.out.println("현재 메소드는 클래스의 블럭킹 내부에 있음");
		System.out.println("↑ bchMethod는 클래스의 멤버 인스턴스의 멤버");
		
	}
//	변수 선언 (받아오기위한 그릇)
//	파라메터 매개 변수 ( 메소드 동작 시 필요한 값이 있다면 뭐든 받아올수 있음)
//	파라메터가 2개 이상은 , <- 로 구분
	public void bchMethod1(String name) {
		System.out.println(name + "(이)가 공부 중");
	}
	public void bchMethod2(String name , String state) {
		System.out.println(name + "가" + state + "중");
	}
	public void bchMethod3(String carname , int speed) {
		System.out.println(carname + "의 속도는 " + speed + " 입니다");
		
	}
	public void bchMethod4(int count) {
		for(int i =0; i<count; i++) {
			System.out.print("출력 ");
		}
	}
//		뭐든지 내가 필요한것(리턴)
		public int rtnMethod1() { 
//			int result = 1;
//			return result;
			System.out.println("rtnMethod");
			return 10;
	}
		public int rtnMethod2(int number) {
			System.out.println("rtnMethod2");
			return number;
			
		}
}
