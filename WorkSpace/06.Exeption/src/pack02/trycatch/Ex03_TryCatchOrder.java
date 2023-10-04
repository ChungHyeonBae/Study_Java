package pack02.trycatch;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		
		
		try {
			Double.parseDouble("a");
			String str = null;
			System.out.println(str.length());
			System.out.println(0/0);
			
		}catch(NumberFormatException e ){
			System.out.println("숫자아님");
		}catch(ArithmeticException e ){
			System.out.println("오류 3");
		}catch(NullPointerException e ){
			System.out.println("오류");
		} catch (Exception e) {
			System.out.println("오류1");
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}
