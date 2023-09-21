package pack05.etc;

import java.util.Scanner;

public class Ex02_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String userPw = sc.nextLine();
		System.out.println("입력 된 정보" + userId + userPw);
		
	}
}
