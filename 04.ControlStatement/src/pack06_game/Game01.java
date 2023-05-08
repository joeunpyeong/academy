package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//게임 만들기
		int userNum=0 , count=0;
		int random = new Random().nextInt(100)+1;
		
		while(true) {
			System.out.println("1부터 100사이의 정수를 입력하세요 ▶");
			userNum = Integer.parseInt(sc.nextLine());
			count++;
			if(userNum<random) {
				System.out.println("더 큰 수를 입력하세요!");
			}else if(userNum>random) {
				System.out.println("더 작은 수를 입력하세요!");
			}else {
				System.out.println("맞췄습니다.!");
				System.out.println("시도 횟수는 :"+ count +"번 입니다.");
				break;
			}
		}
		
		//성적 입력 프로그램 만들기
		while(true) {
			int kor,eng,mat,sum;

			System.out.println("\n국어점수를 입력하세요 : ");
			kor = Integer.parseInt(sc.nextLine());
			if(kor>100||kor<0) {
				System.out.println("오류");
				continue;
			}
			
			System.out.println("영어점수를 입력하세요 : ");
			eng = Integer.parseInt(sc.nextLine());
			if(eng>100||eng<0) {
				System.out.println("오류");
				continue;
			}
			System.out.println("수학점수를 입력하세요 : ");
			mat = Integer.parseInt(sc.nextLine());
			if(mat>100||mat<0) {
				System.out.println("오류");
				continue;
			}
			sum=kor+eng+mat;
			System.out.println("총점 : " + sum);
			double avg= (double)sum/3;
			System.out.println("평균 : " + avg);
		}
		
	}
}
