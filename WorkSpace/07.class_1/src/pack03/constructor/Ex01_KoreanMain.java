package pack03.constructor;

public class Ex01_KoreanMain {
	public static void main(String[] args) {
		Ex01_Korean korean1 = new Ex01_Korean("123456-789123","");
		korean1.name = "배충현";
		System.out.println(korean1.nation);
		System.out.println(korean1.name + korean1.ssn);
		Ex01_Korean korean2 = new Ex01_Korean("123456-12123","");
		System.out.println(korean2.ssn);
		
		
		
	}
}
