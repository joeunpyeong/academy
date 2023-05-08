package pack01.list;

import java.util.ArrayList;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		//사용빈도가 높음. 배열의 단점을 보완하고 불필요한 체이닝, 멀티쓰레딩 등의 기능이 없기 때문에 제일 많이 사용됨.
		//List<E> list= new ArrayList<E>();
		//ArrayList<E> list = new ArrayList<E>();
		
		//String타입을 묵어서 저장 가능한 Collection자료구조 ArrayList를 생성하고 데이터 2건을 추가해보기.
		ArrayList<String> strList = new ArrayList<>();
		strList.add("String 1");
		strList.add("String 2");
		//숫자형 데이터타입을 묶어서 저장 가능한... 2건 추가해보기
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		
		//부울형 데이터타입을 묶어서 저장 가능한... 2건 추가해보기
		ArrayList<Boolean> boolList = new ArrayList<>();
		boolList.add(true);
		boolList.add(false);
		
		//전체 내용 출력
		for(int i=0 ; i<strList.size();i++) {
			System.out.println("strList:" + i+"번째 :"+strList.get(i));
			System.out.println("intList:" + i+"번째 :"+intList.get(i));
			System.out.println("boolList:" + i+"번째 :"+boolList.get(i));
		}
		
		//향상된 for문
		//for문과 구조가 다름: Collection이나 배열등의 자료구조 내부에 Element를 한건씩 빼주어서, 가독성을 높인 구조.
		//for(요소:자료구조){알아서 자료구조의 크기만큼 반복을 하며 기준 왼쪽요소에 아이템을 하나씩 빼면서 반복함.}
		
		for(String str:strList) {
			System.out.println(str);
		}
	}
}
