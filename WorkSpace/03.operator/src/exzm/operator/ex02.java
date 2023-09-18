package exzm.operator;

public class ex02 {
	public static void main(String[] args) {
		int num1 = 2 , num2 = 4;
		num1 = -1 * num1;
		System.out.println(num1);
		num1 = -1 * num1;
		System.out.println(num1);
		
		num1++;
		num2--;
		System.out.println(num1);
		System.out.println(num2);
		
		boolean num3 = num1 > num2;
		boolean num4 = num1 <= num2;
		boolean num5 = num1 == num2;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		boolean num6 = (num1 > num2) || (num1 == num2);
		System.out.println(num6);
		boolean num7 = (num1 > num2) && (num1 == num2);
		System.out.println(num7);
		
		int num8 = num1 +=1; 
		int num9 = num2 +=1;
		System.out.println(num8);
		System.out.println(num9);
		
		String Num10 = (num1 > num2) ? "num1이 num2보다 크다" : "num1이 num2보다 같거나 작다";
		System.out.println(Num10);
	}

}
