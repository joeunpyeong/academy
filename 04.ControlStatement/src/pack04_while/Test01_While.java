package pack04_while;

public class Test01_While {
	public static void main(String[] args) {
		int i=2; 
		int j=1;
		while(i<=9) {
			while(j<=9) {
				
				System.out.print(i + "*" +j+"=" + (i*j) + "   ");
				j++;
			}
			System.out.print("\n");
			i++;
			j=1;
		}
	}
}
