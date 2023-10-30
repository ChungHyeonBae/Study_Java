package pack04.Example;

import java.util.Scanner;

public class MemberServiceExample {
public static void main(String[] args) {                         

Scanner scan = new Scanner(System.in);                        
             
MemberService memberService = new MemberService();            
String userId = scan.nextLine();

String userPw = scan.nextLine();

if( memberService.login(userId, userPw)) {
		System.out.println("로그인 되었습니다.");
		memberService.logout(userId);
	} else {
		System.out.println("id 또는 password가 올바르지 않습니다.");
	}

}


//콘솔 예시
//결과 (hong ,12345입력)    |       결과(1.2 입력)
//로그인 되었습니다.        | id 또는 password가 올바르지 않습니다.
//로그아웃 되었습니다.      |

}
