package pack01.login;

public class MemberDAO {
	public int login(MemberDTO dto) {
		if (dto.id.equals("admin") && dto.pw.equals("admin1234") ) {
			System.out.println("로그인 완료");
			return 1;
		}else {
			System.out.println("아이디 비밀번호 확인");
		}
		return 0;
}
}
