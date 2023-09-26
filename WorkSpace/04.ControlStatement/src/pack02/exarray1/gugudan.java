package pack02.exarray1;

public class gugudan {
	public static void main(String[] args) {
//		int[]jArr = new int[9];
//		jArr[0] =2;
//		jArr[0] =4;
//		jArr[0] =6;
//		jArr[0] =8;
//		jArr[0] =10;
//		for(int i = 0; i<jArr.length; i++) {
//			jArr[i] = (i+1)*2;
		String[] starArr = new String[5];
		for(int i = 0; i<starArr.length; i++) {
			if(i==0) {
				starArr[i] = "★";
			}else{
			starArr[i] = starArr[i-1] + "★";
			
			}
		}
		System.out.println("");
		for(int i=1; i<starArr.length; i++) {
			String star = "";
			for(int j = 0; j<i; j++) {
				star += "★";
			}
		}
	}
}
