package pack04_oop2;

//Student Class:학생의 성적정보를 관리할 수 있게 만든 설계도
public class Student {
	//필드부를 직접 구현하고 StudentMain에서 Student객체를 생성하고 내용을 할당하고 출력해보기
	//멤버(필드) : 학생의 번호,이름,국어,수학,영어 성적,총점 평균
	
	int num,kor,math,eng,sum;
	String name;
	double avg;
	public Student(int num, int kor, int math, int eng,String name) {
		super();
		this.num = num;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sum = this.kor+this.math+this.eng;
		this.name = name;
		this.avg = this.sum/3;
	}
	
	void display() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(sum);
		System.out.println(avg);
	}
	
}
