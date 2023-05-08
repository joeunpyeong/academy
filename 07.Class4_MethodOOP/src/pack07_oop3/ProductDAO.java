package pack07_oop3;

public class ProductDAO {
	
	public  void display(ProductDTO dto) {

		System.out.println("번호 :"+dto.getNum());
		System.out.println("이름 :"+dto.getName());
		System.out.println("가격 :"+dto.getPrice());
		System.out.println("수량 :"+dto.getCnt());
		
//		for(int i=0;i<dtoArr.length;i++) {
//			dao.display(dtoArr[i]);
//			System.out.println("");
//		}
	}
}
