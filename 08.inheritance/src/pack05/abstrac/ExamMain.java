package pack05.abstrac;

public class ExamMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		Dog dog = new Dog("포메라리안");
		dog.sound();
		System.out.println("==표기선==");
		
		Animal animal = new Cat();
		animal.sound();
		animal=new Dog("포메라리안");
		animal.sound();
		
	}
}
