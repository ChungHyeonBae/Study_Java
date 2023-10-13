package pack03;

public class FoodDAO {
	public FoodDAO() {
	}
	

	private static final Food[] FOODS = { 
			new Food("피자", 10000), 
			new Food("햄버거", 8000), 
			new Food("파스타", 12000),
			new Food("샐러드", 5000), 
			new Food("스테이크", 15000) };

	public static Food[] getFoods() {
		return FOODS.clone();
	}

	public static boolean addFood(String name, int price) {
		
		return false;
	}

	public static boolean modifyFood(int index, String name, int price) {
		if (index >= 0 && index < FOODS.length) {
			FOODS[index] = new Food(name, price);
			return true;
		}
			return false;
	}

	public static boolean deleteFood(int index) {
		if (index >= 0 && index < FOODS.length) {
			
			return false;
		}
			return false;
	}
	
}
