package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;

public class Ex03_InputMultiple {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		System.out.println("������ ���� ���ڸ� �Է��ϼ���:");
		//int data= is.read();
		int arr[]=new int[2];
		int count=0;
		while(true) {
			
			int data = is.read();
			arr[count]=data;
			count++;
			
			System.out.println(data);
			System.out.println("�Է��Ͻ� ���ڴ� "+(char)data+"�Դϴ�.");
			if(data==13||data==10) {
				count=0;
			}
			
			if(arr[0]==45&arr[1]==49) {
				System.out.println("�����մϴ�.");
				break;
			}
			
		}
	}
}