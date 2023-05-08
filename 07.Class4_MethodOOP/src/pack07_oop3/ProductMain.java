package pack07_oop3;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO[]dtoArr = new ProductDTO[5];
		//1.dtoArr:0~4까지는 어떤 데이터가 들어있을까?

		//2.dtoArr[0]=? 값 대입을 뭘 해줘야 할까?		
		//
		//3.dtoArr를 이용해서 상품 번호 출력해보기
		
		dtoArr[0]=new ProductDTO(1,"컴퓨터",10000,5);
		dtoArr[1]=new ProductDTO(2,"노트북",20000,4);
		dtoArr[2]=new ProductDTO(3,"라  면",1000,10);
		dtoArr[3]=new ProductDTO(4,"커피",2000,5);
		dtoArr[4]=new ProductDTO(5,"마우스",5000,6);
		ProductDAO dao = new ProductDAO();
//		dao.display(dto1);
//		dao.display(dto2);
//		dao.display(dto3);
//		dao.display(dto4);
//		dao.display(dto5);
		
		//for.을 ProductDAO로 옮겨서 기능 똑같이 만들기
		for(int i=0;i<dtoArr.length;i++) {
			dao.display(dtoArr[i]);
			System.out.println("");
		}
		
		//ProductDAO.display(dto1);
		//ProductDAO.display(dto2);

//		System.out.println("번호"+dto1.getNum()+":");
//		System.out.println("이름"+dto1.getName()+":");
//		System.out.println("가격"+dto1.getPrice()+":");
//		System.out.println("수량"+dto1.getCnt()+":");
		//System.out.println(dto.cnt);<=접근제한자(private)로 변수의 바로접근을 막아놓음
		//System.out.println(dto.getNum);
		//매번 dto의 내용을 하나씩 getter로 불러오는게 아니라 display()라는 메소드를 구현하고
		//해당하는 메소드 호출 시 dto의 내용을 보여줄 수 있게 해보기
		//번호:1 , 이름:컴퓨터,가격:10000,수량:5
		}
}
