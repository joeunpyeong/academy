package pack03.file;

import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		//D:\Study_java\WorkSpace\12.IO
		//������ ������ �ٿ�ε� �ްų� �Ǵ� ���ε带 �� �� ���� ����ϰ� ���Ǵ� Ŭ������ FileŬ������.
		//�⺻������ InputStrem�� OutputStream�� ���ؼ� ����������� ���� �������ٴ� ������ �˾ƾ���
		
		File file=new File("D:\\Study_java\\WorkSpace\\12.IO");
		if(file.exists()) {
			System.out.println("��ΰ� �����մϴ�.");
		}else {
			System.out.println("��ΰ� �������� �ʽ��ϴ�.");			
		}
		//���� 12.IO_FileTest��� ������ �ڹ��ڵ带 ���ؼ� ��������.
		//->12.IO_FileTest���ο� for���� �̿��Ͽ� ������ 10�� �߰��غ���
		
		
		
		file=new File("D:\\Study_java\\WorkSpace\\12_IO_FileTest");
		if(file.exists()) {
			System.out.println("��ΰ� �����մϴ�.");
		}else {
			System.out.println("��ΰ� �������� �ʽ��ϴ�.");
			file.mkdir();//make directory������ ��θ� �����Ѵ�.
		}
		for(int i=0;i<10;i++) {
			file=new File("D:\\Study_java\\WorkSpace\\12_IO_FileTest\\"+i);
			if(file.exists()) {
				System.out.println("��ΰ� �����մϴ�.");
			}else {
				System.out.println("��ΰ� �������� �ʽ��ϴ�.");
				file.mkdir();//make directory������ ��θ� �����Ѵ�.
			}
		}
	}
}