package pack03.game;
import java.util.Scanner;

public class HorseRaceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경마 게임에 참가할 인원을 입력하세요 (2~5명): ");
        int numPlayers = scanner.nextInt();
        if (numPlayers < 2 || numPlayers > 5) {
            System.out.println("유효하지 않은 참가자 수입니다. 2에서 5명 사이의 참가자를 입력하세요.");
            return;
        }

        Thread[] horses = new Thread[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            horses[i] = new Thread(new Horse());
            horses[i].start();
        }

        for (Thread horse : horses) {
            try {
                horse.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("경마 게임이 종료되었습니다.");
        scanner.close();
    }
}