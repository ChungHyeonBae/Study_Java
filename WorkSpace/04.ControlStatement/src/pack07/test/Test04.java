package pack07.test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("아이디를 입력하세요: ");

		String userId = scanner.nextLine();

		System.out.print("비밀번호를 입력하세요: ");

		String userPw = scanner.nextLine();

		System.out.println("로그인 중입니다.");

		if (userId.equals("admin") && userPw.equals("admin1234")) {
			System.out.println("관리자님 환영합니다. " + userId + "님 접속");
		} else {
			System.out.println("잘못된 접근 입니다. 아이디 또는 비밀번호를 확인하세요.!!");
		}

		scanner.close();
	}

}
