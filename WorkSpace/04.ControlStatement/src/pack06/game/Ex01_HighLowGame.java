package pack06.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("주사위 게임을 시작합니다!");

		while (true) {
			System.out.println("게임을 시작하려면 1을 입력. 종료하려면 -1을 입력: ");
			int choice = scanner.nextInt();
			if (choice == -1) {
				System.out.println("게임 종료!");
				break;
			} else if (choice == 1) {

				int user = random.nextInt(6) + 1;
				int computer = random.nextInt(6) + 1;

				System.out.println("사용자가 굴린 주사위: " + user);
				System.out.println("컴퓨터가 굴린 주사위: " + computer);

				if (user > computer) {
					System.out.println("사용자 승리!");
				} else if (user < computer) {
					System.out.println("컴퓨터 승리!");
				} else{
					
					System.out.println("무승부!");
				}
			
			}

		}
	}
}