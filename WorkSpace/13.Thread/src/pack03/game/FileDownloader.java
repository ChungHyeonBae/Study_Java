package pack03.game;
import java.util.Scanner;

public class FileDownloader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("파일 이름 입력 (끝내려면 -1 입력): ");
            String input = scanner.nextLine();
            
            if (input.equals("-1")) {
                System.out.println("프로그램 종료");
                break;
            }
            
            
            Thread downloadThread = new Thread(new DownloadTask(input));
            downloadThread.start();
        }
    }
}