package pack02.trycatch;

public class Ex02_TryCatchFinal {
	public static void main(String[] args) {
		try {
			System.out.println("물 조절");
			System.out.println("가스불 ON");
			System.out.println(0/0);
			System.out.println("가스불 OFF");
			System.out.println("종료");
		} catch (Exception e) {
			System.out.println("예외발생");
			System.out.println("가스불 OFF");
			System.out.println("종료");
		} finally {
			System.out.println("코드4");
		}

	}
}
