package pack01_japangi;

public class JapangiMain {
	public static void main(String[] args) {
		
		JapangiDTO[] dtoArr = new JapangiDTO[3];
		dtoArr[0]=new JapangiDTO("콜라", 800,8);
		dtoArr[1]=new JapangiDTO("사이다",1000,5);
		dtoArr[2]=new JapangiDTO("환타",900,1);
		
		UI.init(dtoArr);
		
		while (true) {
			if (!UI.mainMenuDisplay()) break;
		}
	}
}
