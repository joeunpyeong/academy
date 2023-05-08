package pack03.file;

import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		//D:\Study_java\WorkSpace\12.IO
		//웹에서 파일을 다운로드 받거나 또는 업로드를 할 때 가장 빈번하게 사용되는 클래스는 File클래스임.
		//기본적으로 InputStrem과 OutputStream을 통해서 만들어졌지만 내부 구조보다는 사용법을 알아야함
		
		File file=new File("D:\\Study_java\\WorkSpace\\12.IO");
		if(file.exists()) {
			System.out.println("경로가 존재합니다.");
		}else {
			System.out.println("경로가 존재하지 않습니다.");			
		}
		//혀재 12.IO_FileTest라는 폴더를 자바코드를 통해서 생성해음.
		//->12.IO_FileTest내부에 for문을 이용하여 폴더를 10개 추가해보기
		
		
		
		file=new File("D:\\Study_java\\WorkSpace\\12_IO_FileTest");
		if(file.exists()) {
			System.out.println("경로가 존재합니다.");
		}else {
			System.out.println("경로가 존재하지 않습니다.");
			file.mkdir();//make directory파일의 경로를 생성한다.
		}
		for(int i=0;i<10;i++) {
			file=new File("D:\\Study_java\\WorkSpace\\12_IO_FileTest\\"+i);
			if(file.exists()) {
				System.out.println("경로가 존재합니다.");
			}else {
				System.out.println("경로가 존재하지 않습니다.");
				file.mkdir();//make directory파일의 경로를 생성한다.
			}
		}
	}
}
