
package pack01.nasted;

import pack01.nasted.A.AA;
import pack01.nasted.A.AA.BB;
import pack01.nasted.A.AA.BB.CC;
import pack01.nasted.A.AA.BB.CC.DD;
import pack01.nasted.A.B;
import pack01.nasted.A.C;

public class Main {
	// Ŭ������ �߰�ȣ ���̿� �ִ� ���� ==> �ظ���� : �ν��Ͻ� ��� / ����ƽ ��� ( static ���� )
	// ���� ���� : Ŭ���� ���ο��� ��𼭵� ��밡����.
	
	// �ܺ� Ŭ�������� �ٸ� Ŭ���� ����� ���� �ϴ� ��� ��
	// �ν��Ͻ� ���(static x) : �ν��Ͻ�ȭ ������ ���ľ߸� ������ ����(���)
	// ����ƽ ��� (static o ) : �ش��ϴ� Ŭ������ .�� ������ ���� (���)
	public static void main(String[] args) {
		//�ν��Ͻ�ȭ ���� : ������ �޼ҵ带 �̿��ϰų� ���Ҵ� ���� �Ͽ� null�� �ƴ� ������ �Ǵ� ���·� ����
		A a = new A();//AŬ������ �߰�ȣ ������ ����(���������� ���� ����)�� ����Ҽ�����
		System.out.println(a.aField);// <= aField��°��� ����ϱ����ؼ� ��?? ��
		//B��� Ŭ������ Ŭ������ ������ , A�� �ν��Ͻ� �����.
		B b = a.new B();
		System.out.println(b.bField);
		b.methodB();
		
		System.out.println(A.C.fieldc);
		
		
		C c = new A.C();
		C c2 = new C();
		//a.new C();
		AA aa = a.new AA();
		BB bb = aa.new BB();
		CC cc = bb.new CC();
		DD dd = cc.new DD();

	}
}