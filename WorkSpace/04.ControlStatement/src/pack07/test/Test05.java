package pack07.test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("dataA에 입력할 정수를 입력하세요: ");

		int dataA = scanner.nextInt();

		System.out.print("dataB에 입력할 정수를 입력하세요: ");
		int dataB = scanner.nextInt();

		System.out.println("입력된 데이터 : dataA: " + dataA + " , dataB: " + dataB);


		if (dataA < dataB) {
			System.out.println("비교 후 데이터 : dataA(" + dataA + ") < dataB(" + dataB + ")");
		}

		else if (dataA == dataB) {
			System.out.println("비교 후 데이터 : dataA(" + dataA + ") == dataB(" + dataB + ")");
		} else {
			System.out.println("비교 후 데이터 : dataA(" + dataA + ") > dataB(" + dataB + ")");
		}

		scanner.close();
	}

}
