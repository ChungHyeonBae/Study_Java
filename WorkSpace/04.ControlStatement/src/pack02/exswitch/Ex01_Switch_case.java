package pack02.exswitch;

public class Ex01_Switch_case {
	public static void main(String[] args) {
		int number = 11;
		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
	}

}
