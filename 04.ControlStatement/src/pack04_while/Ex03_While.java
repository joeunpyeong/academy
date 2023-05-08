package pack04_while;

public class Ex03_While {
	public static void main(String[] args) {
		int i=1;
		
		while(i<=100) {
			if(i%2==0) {
				System.out.println("Â¦¼ö("+i+")");
			}else {
				System.out.println("È¦¼ö("+i+")");
			}
			i++;
		}
	}
}
