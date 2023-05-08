package pack02_switch;

import java.util.Scanner;

public class Test01_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력 : ");
		int score = Integer.parseInt(sc.nextLine());
		
		switch(score/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");			
			break;
		case 6:
			System.out.println("D");			
			break;
		default:
			System.out.println("E");
		}
	}
}

