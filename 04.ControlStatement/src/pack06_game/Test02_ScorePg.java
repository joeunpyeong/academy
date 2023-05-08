package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor =-1 , eng =-1, mat = -1;
		System.out.println("국어점수를 입력해주세요.");
		while(kor==1) {
			kor = Integer.parseInt(sc.nextLine());
			if(kor>0 ||kor<=100) {
				System.out.println("국어성적입력완료");
			}else {
				System.out.println("잘못입력 1~100까지만 가능!!");
				kor=-1;
			}
		}
		System.out.println("영어점수를 입력해주세요.");
		while(eng==1) {
			eng = Integer.parseInt(sc.nextLine());
			if(kor>0 ||eng<=100) {
				System.out.println("영어성적입력완료");
			}else {
				System.out.println("잘못입력 1~100까지만 가능!!");
				eng=-1;
			}
		}
		System.out.println("수학점수를 입력해주세요.");
		while(mat==1) {
			mat = Integer.parseInt(sc.nextLine());
			if(kor>0 ||mat<=100) {
				System.out.println("수학성적입력완료");
			}else {
				System.out.println("잘못입력 1~100까지만 가능!!");
				mat=-1;
			}
		}
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mat);
	}
}
