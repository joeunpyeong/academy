package pack01.inputstream;

import java.io.IOException;

public class ScannerMain {
	public static void main(String[] args) throws IOException {
		//JepScanner�� �ν��Ͻ�ȭ �Ͽ� ���ڿ��� �Է¹޾� ����ϱ�
		JepScanner js = new JepScanner(System.in);
		String inputData=js.nextLine();
		System.out.println(inputData);
		int inputInt=js.nextInt();
		System.out.println(inputInt);
		
		
	}
}