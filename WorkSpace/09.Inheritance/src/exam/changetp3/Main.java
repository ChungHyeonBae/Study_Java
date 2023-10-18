package exam.changetp3;

public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent = child;
		parent.method1();
		parent.method2();
		System.out.println("부모 클래스 = 자식클래스 가능(O)");
		
	}
}
