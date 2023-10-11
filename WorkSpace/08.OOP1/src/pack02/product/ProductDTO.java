package pack02.product;

public class ProductDTO {
	private int num;
	private int price;
	String name;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public ProductDTO(int num, int price, String name) {
		
		this.num = num;
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
