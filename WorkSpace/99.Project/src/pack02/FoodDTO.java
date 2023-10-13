package pack02;

import java.util.ArrayList;
import java.util.List;

public class FoodDTO {
	private int id;
	private String name;
	private double price;

	public FoodDTO(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
