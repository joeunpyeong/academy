package pack01_new;

public class Item {
	String name,info;
	int price;
	int stock;
	Status stat;
	
	public Item(String name, int price, int stock, Status stat, String info) {
		super();
		this.name = name;
		this.info = info;
		this.price = price;
		this.stock = stock;
		this.stat = stat;
	}
}