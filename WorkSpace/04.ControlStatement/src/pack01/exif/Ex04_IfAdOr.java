package pack01.exif;

public class Ex04_IfAdOr {
	public static void main(String[] args) {
		int score = 91;
		boolean isCheckUp90 = score >= 90;
		boolean isCheckUp80 = score >= 80;
		if(isCheckUp90) {
			System.out.println("A");
		}else if(isCheckUp90 || isCheckUp80){
			System.out.println("B");
		}else{
			System.out.println("A b X");
		}
	}
}
