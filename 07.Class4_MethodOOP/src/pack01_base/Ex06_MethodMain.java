package pack01_base;

public class Ex06_MethodMain {
	public static void main(String[] args) {
		Ex06_Method em = new Ex06_Method();
		em.method1();
		em.method2("22");
		em.isMethod3();
		em.isMethod4(10);
		System.out.println();
		
		//메소드에 리턴타입이 주어지면 해당하는 타입의 변수라고 봐도 됨
		//메소드에 리턴타입이 없으면 아무타입도 아님. (실행후 없어지는 코드블럭)
		boolean isMethod=em.isMethod3();
		System.out.println(isMethod);
		System.out.println(em.isMethod3());
		
		//조건식 핵심: true of false 일것
		boolean isBoolean=1<2;
		if(em.isMethod3()) {
			
		}else {
			
		}
		System.out.println(em.aMethod()[0]);
		System.out.println(em.dMethod());
		System.out.println(em.sMethod());
		
		em.method2("");
	}
}
