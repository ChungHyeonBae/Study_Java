package pack01.login;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		MemberDTO dto = new MemberDTO();
		dto.id = scan.nextLine();
		dto.pw = scan.nextLine();
		MemberDAO dao = new MemberDAO();
		if(dao.login(dto) == 1 ) {
			System.out.println("화면 이동");
		} else {
			System.out.println("다시 입력");
		}
		scan.close();
	}
}
