package pack05.abstrac;

public class Dog extends Animal{
	//String kind;
	public Dog(String kind) {
		this.kind=kind;
	}
	
	
	@Override
	public void sound() {
		System.out.println(kind+"°­¾ÆÁö°¡ Â¢´Â´Ù ¿Ð¿Ð");
	}
}
