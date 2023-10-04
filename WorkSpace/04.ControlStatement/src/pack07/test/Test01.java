package pack07.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫 번째 문자열을 입력하세요: ");
		String input1 = scanner.nextLine();

		System.out.println("두 번째 문자열을 입력하세요: ");
		String input2 = scanner.nextLine();

		System.out.println("정수형 데이터 1~100 사이의 값을 입력하세요: ");
		int iData = scanner.nextInt();
		System.out.println(

				"입력한 정수값: " + iData);

		System.out.println("실수형 데이터를 입력하세요: ");
		double fData = scanner.nextDouble();
		System.out.println("입력한 실수값: " + fData);

		scanner.close();
	}

}
