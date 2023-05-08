package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		//제어문은 무한하게 중첩이 가능하다.
		int num=0;
		for(int i=1 ; i<=10 ; i++) {
//			if(i%2==0) {
//				System.out.println(i+"짝수");
//			}else if(i%2==1){
//				System.out.println(i+"홀수");
//			}else {
//				System.out.println(i +"= 0");
//			}
			System.out.println(i);
			num+=i;
		}
		System.out.println("=" + num);
		
		
	}
}
