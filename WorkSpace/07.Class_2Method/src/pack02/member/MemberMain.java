package pack02.member;

public class MemberMain {
	public static void main(String[] args) {
		Member.sField = 10;
		System.out.println(Member.sField);
		Member member = new Member();
		System.out.println(member.iField);
		member.iMethod();
		member.iMethod(0);
		member.iMethod("A" , 1);
	}
}
