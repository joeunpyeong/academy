package pack01.inputstream;

import java.io.IOException;

public class ScannerMain {
	public static void main(String[] args) throws IOException {
		//JepScanner를 인스턴스화 하여 문자열을 입력받아 출력하기
		JepScanner js = new JepScanner(System.in);
		String inputData=js.nextLine();
		System.out.println(inputData);
		int inputInt=js.nextInt();
		System.out.println(inputInt);
		
		
	}
}
