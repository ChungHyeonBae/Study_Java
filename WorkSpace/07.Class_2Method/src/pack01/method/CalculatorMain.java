package pack01.method;

public class CalculatorMain {
	public static void main(String[] args) {
	Calculator ca = new Calculator();
	ca.plus(7 ,5);
	ca.minus(15, 7);
	System.out.println(ca.mul(2,3));
	System.out.println(ca.div(4,2));
	}
}
