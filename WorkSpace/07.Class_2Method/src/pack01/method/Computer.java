package pack01.method;

public class Computer {
	boolean isPower;

	public void plus(int x, int y) {
		if (isPower) {
			System.out.println(x + y);
		} else {
			System.out.println("전원 켜");
		}
	}
}
