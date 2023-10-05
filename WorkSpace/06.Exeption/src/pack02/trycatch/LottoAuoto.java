package pack02.trycatch;

import java.util.Arrays;
import java.util.Random;

public class LottoAuoto {
	public static void main(String[] args) {
		int[] lottoNumbers = generateLottoNumbers();
		System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
	}

	private static int[] generateLottoNumbers() {

		Random random = new Random();
		int[] lottoNumbers = new int[6];

		for (int i = 0; i < 6; i++) {
			lottoNumbers[i] = random.nextInt(45) + 1;
		}

		return lottoNumbers;
	}

}
