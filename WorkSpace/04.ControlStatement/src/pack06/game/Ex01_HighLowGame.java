package pack06.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while (true) {
//			System.out.print("실행중...");
//			int a = scanner.nextInt();
//			if (a == -1) {
//				System.out.println("종료");
//
//				break;
	}

	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	int randomNumber = random.nextInt(100) + 1;
	System.out.println("하이로우게임 입니다. 랜덤한 숫자를 맞춰주세요.(1~100)");
	while(true)
	{
			System.out.println("숫자를 입력해주세요.");
			String str = sc.nextLine();
			int userNum = Integer.parseInt(str);
			if (randomNumber == userNum) {
				System.out.println("정답! 축하");
				break;
			} else if (randomNumber > userNum) {
				System.out.println("Hight!");
			} else if (randomNumber < userNum) {
				System.out.println("Low!");
				
				
										}						
}