package pack03_oop1;

//Class : Ư��(�Ӽ�,��������),����(���)�� ���(����)
//Ư��:field(�����ͳ��� �˰��ִ� ��� �͵�, �޼ҵ� ����)
//����: �޼ҵ� (field�� �̿��ϰų� �ƴϸ� �ش��ϴ� class�� �������� ����� ����)
public class Product {
	//��ǰ(Product):��ǰ�� ��ȣ, ��ǰ�� �̸�(�Ӽ�)
	
	
	public Product(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	//��������:DTO ��DTO Class,VO Class
	//Data Transper Object, Balue Object
	//�����͸� ����ִ� ��ü
	int num;
	String name;

	//�޼ҵ�(���) : DAO Class
	//Data Access Object:DTO�� �̿��ؼ� �����ϴ�
	//���, �Ǵ� �ش��ϴ� Ŭ������ ���õ� ����� ��Ƶ�
	void display() {
		System.out.println("��ȣ: "+num);
		System.out.println("��ǰ��: "+name);
	}
}