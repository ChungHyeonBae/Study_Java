package pack07.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("dataA에 입력할 정수를 입력하세요: ");
		int dataA = scanner.nextInt();

		System.out.print("dataB에 입력할 정수를 입력하세요: ");
		int dataB = scanner.nextInt();

		System.out.println("입력된 데이터 : dataA: " + dataA + " , dataB: " + dataB);

		int smaller = Math.min(dataA, dataB);
		int larger = Math.max(dataA, dataB);

		int sum = 0;
		for (int i = smaller; i <= larger; i++) {
			sum += i;
		}

		System.out.println("출력 데이터 : " + smaller + " + " + (smaller + 1) + " + ... + " + larger + " = " + sum + " 입니다.");

		scanner.close();
	}
}
