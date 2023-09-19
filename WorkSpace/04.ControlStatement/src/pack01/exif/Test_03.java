package pack01.exif;

public class Test_03 {
	public static void main(String[] args) {
		char bloodType = 'A';

		if (bloodType == 'A') {
			System.out.println("A형 : 조금 소심");
		} else if (bloodType == 'B') {
			System.out.println("B형 : 조금 활발");
		} else if (bloodType == 'O') {
			System.out.println("O형 : 조금 깐깐");
		} else {
			System.out.println("AB형 또는 잘못된 입력");
		}
	}
}
