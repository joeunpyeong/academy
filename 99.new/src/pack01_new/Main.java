package pack01_new;

public class Main {
	public static void main(String[] args) {
		Store store = new Store();
		UserStats uStats= new UserStats();
		
		
		System.out.println("1");
		uStats.auto();//status auto����(�������ͽ� �ڵ� ���)
		//uStats.select();//status select����(�������ͽ� ���� ���)
		store.shop();//���� ����

		
	}
}