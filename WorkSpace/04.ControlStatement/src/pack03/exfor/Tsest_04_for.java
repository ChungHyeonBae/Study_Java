package pack03.exfor;

public class Tsest_04_for {
	public static void main(String[] args) {
//		int i = 0;
//		i = i + 1;
//		i = i + 2;
//		i = i + 3;
//		i = i + 4;
//		i = i + 5;
//		i = i + 6;
//		i = i + 7;
//		i = i + 8;
//		i = i + 9;
//		int sum = 0;
//		for(int i = 0 ; i <= 9 ; i++) {
//			sum = sum + i;
//		System.out.println(sum);
//		int i = 0;
//		i = i + 1;
//		i = i + 3;
//		i = i + 5;
//		i = i + 7;
//		i = i + 9;
//		System.out.println(i);
		{
		int sum = 0 , oddSum=0 , evenSum=0;
			for(int i = 0 ; i <=9; i++) {
			if(i%2==1) {
				oddSum += i;
			}else{
				evenSum += i;
			}
			sum = sum + i;
			}
			System.out.println("홀수의합(1~9) : " + oddSum);
			System.out.println("짝수의합(1~9) : " + evenSum);
			System.out.println(sum);
		}
		
	}

}
