package pack03.exarray2;

public class Test01_Array {
	public static void main(String[] args) {

		int[][] arr = new int[8][9];
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 2) + "단");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
			}
		}

	}
}
