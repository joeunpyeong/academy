package PhoneSimulator;

public class Animal {
	void move() {
		System.out.println("동물 기어감");
	}

	public static void main(String[] args) {
		Animal animalList[] = new Animal[2];
		
		animalList[0] = new Cat();
		animalList[1] = new Raccoon();
		
		for (Animal a : animalList) {
			
			a.move();
			
			if (a instanceof Cat) {
				((Cat) a).meow();
			}
		}
		
		
		Cat b = new Cat();
		Raccoon c = new Raccoon();
		
		b.move();
		b.meow();
		c.move();
		
		Object list[] = new Object[10];
		
		list[0] = new Cat();		
		list[1] = new IronMan();
	}
}

class IronMan{
	
}

class Cat extends Animal {
	void meow() {
		System.out.println("애옹");
	}
}

class Raccoon extends Animal {
	void move() {
		System.out.println("너구리 기어감");
	}
}
