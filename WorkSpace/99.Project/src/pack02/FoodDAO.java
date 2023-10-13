package pack02;

import java.util.ArrayList;
import java.util.List;

public class FoodDAO {
	private List<FoodDTO> foodList;

	public FoodDAO() {
		foodList = new ArrayList<>();
		foodList.add(new FoodDTO(1, "피자", 10.0));
		foodList.add(new FoodDTO(2, "파스타", 8.0));
		foodList.add(new FoodDTO(3, "스테이크", 15.0));
		foodList.add(new FoodDTO(4, "샐러드", 6.0));
		foodList.add(new FoodDTO(5, "스시", 12.0));
	}

	public List<FoodDTO> getAllFoods() {
		return foodList;
	}
}
