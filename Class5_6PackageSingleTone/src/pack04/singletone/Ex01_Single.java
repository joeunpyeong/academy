package pack04.singletone;

public class Ex01_Single {
	//static vs instance
	//static{}����ŷ�� ���� main�޼ҵ峪 Ŭ���� ��� ���� �� � �۾��� �ؾ��� ��
	//����ϴ� ��==> �̱���
	static {
		System.out.println("static��¹�");
	}
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� ��¹�");
	}
}