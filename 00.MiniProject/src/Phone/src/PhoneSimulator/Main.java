package PhoneSimulator;

public class Main {
	public static void main(String[] args) {
		SuperPhone phoneArray[] = new SuperPhone[3];

		phoneArray[0] = new Phone();
		phoneArray[1] = new DMB();
		phoneArray[2] = new SmartPhone();
		
		for (SuperPhone e : phoneArray) {
			e.inspect();
		}
	}
}