package pack03_constructor;

import java.util.Scanner;

public class Test01 {
	//1.이름, 아이디, 패스워드, 나이를 필드로 사용하는 Member클래스를 생성 후
	//Member클래스 필드값에 값을 할당하고 출력해보기

	//2.이름, 아이디, 패스워드, 나이를 필드로 사용하는 MemberDTO클래스를 생성한다.
	//필수로 입력되어야 할 것 같은 필드는 생성자를 통해 입력받게만들고
	//해당내용을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member member=new Member();
		member.name="길동홍";
		member.age=10;
		member.id="id001";
		member.pw="pw001";
		System.out.println("이름:"+member.name);
		System.out.println("나이:"+member.age);
		System.out.println("아이디:"+member.id);
		System.out.println("비번:"+member.pw);
		
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("id:");
		String id = sc.nextLine();
		System.out.print("pw:");
		String pw = sc.nextLine();
		System.out.print("나이:");
		int age = Integer.parseInt(sc.nextLine());
		MemberDTO dto = new MemberDTO(name,id,pw,age);
		System.out.println("이름:"+dto.name);
		System.out.println("나이:"+dto.age);
		System.out.println("아이디:"+dto.id);
		System.out.println("비번:"+dto.pw);
	}
}
