package pack.b;

import pack.a.*;
//import 다른 패키지에 있는 클래스를 사용하겠다의 선언
//pack.a<내부에 있는 접근 가능한 클래스를 모두 쓰겠다.(사용하겠다)

public class C {
	//pack.a에 있는 클래스중에 어떤것들에
	//접근이 가능할까? 필드로 사용해보기
	B b;
	//필드부에서 C를 객체로 각각의 생성자 메소드를 이용해서 생성해보기
	C c1=new C(1);
	C c2=new C(false);
	C c3=new C();
	//생성자 메소드를 사용할 때 접근제한자의 차이를 만들어보기
	//같은 이름의 메소드를 오류 없이 선언하여 사용하고 싶을 때 어떻게 해야할까
	//메소드 오버로딩
	public C(int a) {	}//new C(1): public:java프로젝트 내에서 모두 접근이 가능하다.
	
	C(boolean c){	}//new C(true);default:같은 패키지 내에서 접근이 가능하다.
	
	private C() {	}//private:클래스 내부에서만 접근이 가능
	
}
