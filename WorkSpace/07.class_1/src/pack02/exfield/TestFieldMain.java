package pack02.exfield;

public class TestFieldMain {
	public static void main(String[] args) {
		TestField skta = new TestField();
		
		TestField sktb = new TestField();
		skta.skt = "회사";
		sktb.money = 200;
		System.out.println(skta.skt);
		System.out.println(sktb.money);
	}
}
