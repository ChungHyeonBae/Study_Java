package pack07.test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int inputValue = scanner.nextInt();

		System.out.println("입력된 데이터: " + inputValue);

		if (inputValue == 1) {
			System.out.println("비교 후 데이터: 남자 입니다.");
		}

		else if (inputValue == 2) {
			System.out.println("비교 후 데이터: 여자 입니다.");
		}

		else {
			System.out.println("비교 후 데이터: 입력 오류 입니다.");
		}

		scanner.close();

	}
}
