package sec03.Exam01;

public class Hello {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int z = 7;
		System.out.println("x : " + x + " y : " + y + " z : " + z);
		
		int temp = z;
		z = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x + " y : " + y + " z : " + z);
	}
}
