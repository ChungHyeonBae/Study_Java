package pack02.product;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO dto1 = new ProductDTO(1 , 10000 , "티셔츠");
		ProductDTO dto2 = new ProductDTO(2 , 20000 , "청바지");
		ProductDTO dto3 = new ProductDTO(3 , 30000 , "양말");
		ProductDAO dao = new ProductDAO();
		dao.display(dto1);
		dao.display(dto2);
		dao.display(dto3);
		System.out.println(dto1.getNum());
//		ProductDTO dto = new ProductDTO();
//		dto.setNum(1);
//		dto.name = "스카프";
//		dto.setPrice(6900);
//		System.out.println(dto.name + dto.getPrice());
//		dto.price = -6900;
//		System.out.println(dto.num + dto.name + dto.price);
	}
}
