package pack02.threadattr;

import java.util.Scanner;

public class BchThreadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		BchThread thread = new BchThread(number);
		thread.start();
	}
}