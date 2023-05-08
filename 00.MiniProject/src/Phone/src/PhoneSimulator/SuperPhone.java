package PhoneSimulator;

public class SuperPhone {
	void inspect() {}
}

class Phone extends SuperPhone {
	void inspect() {
		System.out.println("1");
	}
	
	void power() {
		
	}
	
	void call() {
		
	}
	
	void session() {
		
	}
}
class DMB extends Phone {
	void inspect() {
		super.inspect();
		
		System.out.println("2");
	}
	
	void toggleDMB() {
		
	}
	
	void changeChannel() {
		
	}
}

class SmartPhone extends DMB {
	void inspect() {
		super.inspect();
		
		System.out.print("3");
	}
	
	void toggleInternet() {
		
	}
	
	void toggleWebtoon() {
		
	}
}
