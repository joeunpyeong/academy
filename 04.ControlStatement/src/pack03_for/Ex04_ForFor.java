package pack03_for;

public class Ex04_ForFor {
	public static void main(String[] args) {
		//제어문은 무한하게 중첩이 가능하다.(순서x)
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*"+ j +"="+ (i*j));
			}
			System.out.println("------");
		}
		
	}
		
}
