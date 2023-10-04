package pack02.trycatch;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		String str = "10";
		try {
		Double.parseDouble(str);
		}catch (Exception e) {
			System.out.println("오류 발생");
			System.out.println(e.getMessage());
		}
		System.out.println(str);
	}
}
