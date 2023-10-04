package pack02.trycatch;

import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.println("정수를 입력하고, -1을 입력하면 종료됩니다.");

		while (true) {
			System.out.print("정수 입력: ");
			String input = scanner.nextLine();

			if (input.equals("-1")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

		try {
			String input = null;
			int number = Integer.parseInt(input);
			sum += number;
			System.out.println("누적합: " + sum);
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
		}
	}
}
