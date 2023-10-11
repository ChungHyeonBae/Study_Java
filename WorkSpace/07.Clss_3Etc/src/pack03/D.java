package pack03;

import pack01.A;

public class D {
	A pack1_A = new A();
	pack03.A pack3_A = new pack03.A();
	
	D publicD = new D();
	D defaultD = new D(1);
	D privateD= new D("A");
	public D() {
	} {
		System.out.println("public");
		
	}
	D(int param) {
	} {
		String param = null;
		System.out.println("default" + param);
	}
	private D(String param) {
		System.out.println("private" + param);
	
	}
}
