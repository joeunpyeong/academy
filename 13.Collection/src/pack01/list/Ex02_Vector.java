package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
	public static void main(String[] args) {
		//사용빈도가 없거나 매우 낮기 떄문에 이론만 살펴보고 넘어감
		//List라는 Interface를 상속받았기 때문에 기본 구조는 ArrayList, LinkedList, Vector전부 비슷함.
		//?TestDTO라는 클래스를 묶어서 저장하고 싶다. ? 에는 뭘 넣을까
		//1.List생성해보기
		//2.List에 요소 추가해보기.※(TestDTO)※
		//3.List에 있는 요소 내용 출력해보기(예시:FirstName:성, LastName:이름)
		
		List<TestDTO> list=new Vector<TestDTO>();//크기 ?
		list.add(new TestDTO("조","은평"));
		list.add(new TestDTO("조","랑말"));
		
		System.out.println(list.get(0).getFirstName()+list.get(0).getLastName());
		
		TestDTO[] arrDTOs=new TestDTO[1];
		arrDTOs[0]= new TestDTO("FirstName","LastName");
		arrDTOs[1]= new TestDTO("FirstName1","LastName1"); //에러남
		
		
	}
}
