package pack01.method;

public class CarMain {
	public static void main(String[] args) {
//		car의 인스턴스 멤버 -> car가 인스턴스화 -> 객체 -> 객체 사용이 가능하다.
		Car car = new Car();
//		for(int i =0; i<10; i++) {
//		car.bchMethod();
//		}
//		메소드의 파라메터
//		정의 = 호출 : 변수 초기화 식
		car.bchMethod1("배충현");
		car.bchMethod2("배충현","휴식");
		car.bchMethod3("k5" , 150);
		car.bchMethod4(10);
		System.out.println(car.rtnMethod1()+1);
		System.out.println(car.rtnMethod2(50)/2);
	}
}
