package pack03_for;

import java.util.Iterator;

public class Ex01_For {
	public static void main(String[] args) {
		//반복문 : for문(loop문, looping, 순환)
		//사용이유:기계는 사람보다 반복적인 작업을 잘함.(정확, 일정)
		//for(반복에 사용할 변수초기화; 조건식 ; 증감식){
			//반복구간
		//}
		//		  
		//for(①int i=0 ; ②i<10 ; ③i++){
			//i가 0에서 시작해서 9까지 총 10번 동작하는 반복문
		//}
		
		for (int i = 0; i<10 ;) {//무한 루프: 잘못된 반복문의 예시
			System.out.println("for문 변수 i의 값 : "+i);
			break;
		}
		
		int num = 0;
		for (int i=0 ; i<18951 ; i+=2) {
			System.out.println("for문 변수 i의 값 : "+i);
			num=i;
		}
		System.out.println("i의 값 = " + num);
	}
}
