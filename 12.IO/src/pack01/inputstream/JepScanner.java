package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JepScanner {
	private InputStream in;
	private BufferedReader br;
	
	public JepScanner(InputStream in) {
		super();
		this.in = in;
		br=new BufferedReader(new InputStreamReader(in));
	}
	
	public String nextLine(){
		try {
			String inputData = br.readLine();
			return inputData;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//���� ��ĳ�� nextInt�� ���� �ܿ� ���� �Է��ϸ� ������ �߻�����
	//���ڿܿ� ���� �ԷµǸ� -1�� return�ϴ� �޼ҵ带 ����ÿ�
	
	public int nextInt(){
		int inputInt = -1;
		try {
			inputInt=Integer.parseInt(br.readLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return inputInt;
	}
	
}