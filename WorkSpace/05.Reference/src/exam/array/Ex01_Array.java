package exam.array;

public class Ex01_Array {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int[] tempArray = new int[10];
		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray.length; j++) {
				if (i == numbers[j]) {
					tempArray[i] = 1;
				}
			}
		}
		System.out.println(tempArray);
		int sum = 0;
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] == 0) {
				sum += i;
				System.out.println("비어있는 숫자 :" + i + " " + sum);
			}
		}
	}
}
