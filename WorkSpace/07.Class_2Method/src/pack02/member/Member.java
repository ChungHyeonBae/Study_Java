package pack02.member;

public class Member {
//	클래스 중괄호 사이에 있는 모든것 -> 멤버
//	멤버는 크게 static과 instence로 나누어짐
//	static이라는 키워드 여부
// 인스턴스 멤버 : static 키워드가 없음. 인스턴스화 과정을 거쳐야지만 접근이 가능
//	인스턴스화 -> Class class = new Class();
// 클래스 내부에 있는 모든 멤버가 메모리에 올라가고 사용 준비 O
// 접근방식 - > class.
//	 스태틱 멤버 : static 키워드가 있음 인스턴스화 과정 없이 사용 가능
// 자바 프로그램 시작 시 메모리에 먼저 올라가서 사용 준비 O
// static은 메모리를 미리 점유하기 때문에 사용 x
// 과도한 static멤버를 사용하는것은 프로그램 속도 저하의 원인
// 인스턴스화 x
//	접근방식 -> Class.
//	메소드 오버로딩 : 같은 이름의 메소드를 파라메터 타입 또는 개수를 달리해서 중복시켜서 사용하는 방식
	
	int iField;
	static int sField;
	public void iMethod() {
		System.out.println("인스턴스 메소드");
		
	}
	public static void sMethod() {
		System.out.println("스태틱 메소드");
	}
	public void iMethod(int param) {
		System.out.println("파라메터 1개");
	}
	public void iMethod(String param , int param2) {
		System.out.println("파라메터 2개");
	}
	
	
}
