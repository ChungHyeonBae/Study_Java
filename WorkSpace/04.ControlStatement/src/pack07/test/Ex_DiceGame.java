package pack07.test;

import java.util.Random;
import java.util.Scanner;

public class Ex_DiceGame {
	public static void main(String[] args) {
		while (true) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key를 누르면 pc가 주사위를 굴립니다");
		int pcNum = random.nextInt(6)+1;
		
		System.out.println("enter key를 누르면 사용자의 주사위를 굴립니다");
		int userNum = random.nextInt(6)+1;
		if(pcNum < userNum) {
			System.out.println(pcNum + " < " + userNum + "PC승!");
		}else if(pcNum > userNum) {
			System.out.println(pcNum + " > " + userNum + "유저승!");
		}else {
			System.out.println(pcNum + " = " + userNum + "무승부!");
		}
		
	}
}
}