package pack03_constructor;

import java.util.Scanner;

public class Ex03_CarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제조사 :");
		String company = sc.nextLine();
		System.out.print("모  델 :");
		String model = sc.nextLine();
		System.out.print("색  상 :");
		String color = sc.nextLine();
	
		Ex03_Car myCar=new Ex03_Car(company,model,color);
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
	}
}
