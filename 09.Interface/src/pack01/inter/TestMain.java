package pack01.inter;

//extends <-클래스의 상속 : 내부에 있는 모든 멤버를 물려받아 사용 가능하게 한다.(단일 상속)
//implements <-인터페이ㅡ의 상속:인터페이스 내부에 있는 모든 메소드들을 재정의해서 구현할 수 있게 해줌
//인터페이스:어떤 방법 (메소드)를 구현 할 것을 강제한다.(abstract)
public class TestMain implements TestInterface{
	@Override
	public void test1() {
		
	}

	@Override
	public boolean join(String id, String pw) {
		//재정의(기능 구현을 진행함)
		return false;
	}

	@Override
	public void test2() {
		//메소드 구현 자체를 안할 수가 없음
		
	}
}
