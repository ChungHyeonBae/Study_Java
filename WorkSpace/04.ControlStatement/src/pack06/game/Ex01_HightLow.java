package pack06.game;

public class Ex01_HightLow {
	public static void main(String[] args) {
		int randomNumber = 10 ;
		int userNum = 15 ;
		if(randomNumber == userNum) {
			System.out.println("정답");
		}else if(randomNumber > userNum) {
			System.out.println("Hight");
		}else {
			System.out.println("Low");
		}
	}
}
