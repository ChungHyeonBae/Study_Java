package pack01.exif;

public class Test_05 {
	public static void main(String[] args) {
		int number = 1;
		String result = number % 3 == 0 ? "3배수" : "3배수x";
		if (number % 2 == 0) {
			System.out.println("짝수" + result);
		} else {
			System.out.println("홀수" + result);
			if (number % 2 == 0 && number % 3 == 0) {
				System.out.println("짝수 3배수");
			} else if (number % 2 == 0 && number % 3 == 0) {
				System.out.println("짝수 3배수X");
			} else if (number % 2 == 1 && number % 3 == 0) {
				System.out.println("홀수 3배수");
			} else {
				System.out.println("홀수 3배수X");
			}
			if (number % 2 == 0) {
				if (number % 3 == 0) {
					System.out.println("짝수 3o");
				} else {
					System.out.println("짝수 3x");
				}
			} else {
				if (number % 3 == 0) {
					System.out.println("홀수 3o");
				} else {
					System.out.println("홀수 3x");
				}
			}
		} // main

	}
}// class
