package pack03.exarray2;

public class Ex04_Swap {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		int i = -10;
		int j = 10;
		System.out.println(num1 + j);
		System.out.println(num2 + i);
		int tempNum = num1;
		num1 = num2;
		num2 = tempNum;
		System.out.println("num1 : " + num1 + " num2: " + num2);
		
		
	}
}
