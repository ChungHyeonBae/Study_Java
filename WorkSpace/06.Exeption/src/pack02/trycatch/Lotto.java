package pack02.trycatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int[] userNums = new int[6];
		int[] comNums = new int[6];
		for (int i = 0; i < userNums.length; i++) {
			userNums[i] = Integer.parseInt(sc.nextLine());
			if (userNums[i] < 1 || userNums[i] > 45) {
				System.out.println("숫자 다시 입력");
				i--;
				continue;
				// System.out.println("여기는 절대 실행불가");
			}
			for (int j = 0; j < i; j++) {
				if (userNums[j] == userNums[i]) {
					System.out.println("중복");
					i--;
					break;
				}
			
			}

		}
		for (int i = 0; i < userNums.length; i++) {
			comNums[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (comNums[j] == comNums[i]) {
					i--;
					break;
				}
			}
		}

		System.out.print(Arrays.toString(userNums));
		System.out.print(Arrays.toString(comNums));
		System.out.print("끝");

	}// Main
}
