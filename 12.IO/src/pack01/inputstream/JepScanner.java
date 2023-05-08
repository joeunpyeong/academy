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
	
	//기존 스캐너 nextInt는 숫자 외에 값을 입력하면 오류가 발생했음
	//숫자외에 값이 입력되면 -1을 return하는 메소드를 만드시오
	
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
