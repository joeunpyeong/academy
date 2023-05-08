package pack02_static;

public class Ex01_Static {
	//static의 여부에 따라서 멤버를 구분한다.
	//static의 여부에 따라서 메모리에 올라가는 순서가 다르다.
	//멤버 : 클래스의 멤버 => 클래스의 중괄호 사이에 있는 모든 것들
	
	static void sMethod() {
		System.out.println("스태틱멤버입니다.");
//		Ex01_Static es= new Ex01_Static();
//		iMethod(); //접근불가
	}
	//인스턴스 멤버(메소드)
	void iMethod2() {
		iMethod();//인스턴스 (접근가능)
		sMethod();//스태틱 (접근가능)
	}
	
	
	//인스턴스(instance) 멤버
	void iMethod() {
		System.out.println("인스턴스 멤버입니다.");
	}
	//static : 프로그램 시작전에 먼저 메모리에 할당, 프로그램 종료 시 소멸
	//instance : 인스턴스화 과정후에 메모리에 할당, 프로그램 종료 시 소멸
	
	//static멤버
	public static void main(String[] args) {
		//멤버메소드에서 iMethod 호출해보기
		//Ex01_Static es = new Ex01_Static();
		//es.iMethod();
		Ex01_Static.sMethod();
		if(true) {
			Ex01_Static es= new Ex01_Static();
			es.iMethod();
		}
	}
}
