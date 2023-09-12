package package01.variable;

public class Ex01_Variable {
	public static void main(String[] args) {
		//변수라는 것을 값을 저장하기 위한 것.
		//변수의타입 변수이름 ; <= 변수의 선언 : 이타입의 변수를 해당 이름으로 사용할 것을 미리 알려줌.
		//변수에 값 할당 : 변수명 = '변수타입에 맞는 값' ; 
		int x;
		x = 5;
		int y;
		y = 10;
		int z;
		z = 15;
		//println 반드시 변수 하나이거나 합을 통해서 하나로 합쳐진것만가능함.
		//syso( x ) 가능 : 변수가 하나이기때문에 가능
		//syoo( x , y ) 불가능 : 변수가 두개임.
		//syso(x + "" + y + "" + z ) ; 숫자형 변수의 합을 막는다.
		//블럭킹 내부에서는 같은 이름의 변수는 선언이 불가능하다.
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// 변수 x , y ,z를 각각 선언 . 
		// 변수 x에는 5 , y에는 10 , z에는 15를 각각 값 할당을 하고 , 출력해보기.
		
	}
}
