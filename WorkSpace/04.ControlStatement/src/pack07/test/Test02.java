package pack07.test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수를 입력하세요");
		int num1 = scanner.nextInt();

		System.out.print("두 번째 수를 입력하세요");
		int num2 = scanner.nextInt();

		String result = (num1 > num2) ? "첫 번째 수가 더 큽니다." : (num1 < num2) ? "두 번째 수가 더 큽니다." : "두 수는 같습니다.";
		System.out.println(result);

		scanner.close();
	}

}
