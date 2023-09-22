package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		while (true) {
			System.out.println("가위 바위 보 게임");
			System.out.println("( 1.주먹 2.가위  3.보 4.나가기)");
			System.out.print("숫자을 입력하세요 :");
			int com = 0;
			Random r = new Random();

			int user = scanner.nextInt();
			com = r.nextInt(3) + 1;
			System.out.print("결과   ");

			if (user == 1) {
				if (com == 2) {
					System.out.println(" 승  리 ");
				} else if (com == 3) {
					System.out.println(" 패  배 ");
				} else {
					System.out.println("무 승 부");
				}
			} else if (user == 2) {
				if (com == 2) {
					System.out.println("무 승 부");
				} else if (com == 3) {// -1
					System.out.println(" 승  리 ");
				} else {
					System.out.println(" 패  배 ");
				}
			} else if (user == 3) {
				if (com == 2) {
					System.out.println(" 패  배 ");
				} else if (com == 3) {
					System.out.println("무 승 부");
				} else {
					System.out.println(" 승  리 ");
				}
			} else {
				System.out.println("=========================");
				System.out.println("\t게임끝");
			}
		}

	}
}