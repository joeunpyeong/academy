package pack03_array2;

import java.util.Arrays;

public class TestLast {
	public static void main(String[] args) {
	//2차원 배열을 만듬.
	//2차원 배열의 크기와 타입은 자유롭게 하면됨	
	//2차원 배열에 구구단 2~ 9단의 답을 저장하고 2차원 배열을 통해 출력까지 해보기
	//for문을 이용해서 풀 것
	int[][]array=new int[8][8];
	for(int i=0; i<8;i++) {
		for(int j=0;j<8;j++) {
			array[i][j]=(i+2)*(j+2);
			System.out.print((i+2)+"*"+(j+2)+"="+array[i][j]+"   ");
		}
		System.out.println("");
	}
	System.out.println("");

			
		
	//1차원 배열이 2개가 있음
	//arrA = {1,2,3,4}
	//arrB = {4,5,6,7}
	//arrA에 들어있는 내용과 arrB에 들어있는 내용을 바꾸세요
	//변경후.
	//arrB = {1,2,3,4}
	//arrA = {4,5,6,7}
	{
		int[]arrA = {1,2,3,4};
		int[]arrB = {4,5,6,7};
		int[]arr=new int[4];
		for(int i=0 ; i<4 ; i++) {
			arr[i]=arrA[i];
			arrA[i]=arrB[i];
			arrB[i]=arr[i];
		}
		for(int i=0;i<4;i++) {
			System.out.println("arrA["+i+"]="+arrA[i]);
		}
		System.out.println("");
		for(int i=0;i<4;i++) {
		System.out.println("arrB["+i+"]="+arrB[i]);
		}
		System.out.println("");
	}
	
			
	//심화 ) int[] arr = { 3 , 4 , 6 , 7 , 8 , 9 , 1 , 2 , 5 }
	//해당 내용을 오름차순 또는 내림차순으로 정렬해서 보여주기.
	//작업후 => arr => { 1 ,~~~9 } { 9~~1 }
	
	int[]arr=  { 3 , 4 , 6 , 7 , 8 , 9 , 1 , 2 , 5 };
	int box;
	{
		//1~9
	System.out.println("1~ 9");
	for(int i=0;i<(arr.length*2);i++) {
		for(int j=0;j<(arr.length-1);j++) {
			if(arr[j+1]<arr[j]) {
				box=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=box;
			}
		}
	}
	for(int i=0;i<9;i++) {
		System.out.println("arr["+i+"]="+arr[i]);
	}
	System.out.println("");
	
	//9~1
	System.out.println("9~ 1");
	for(int i=0;i<(arr.length*2);i++) {
		for(int j=(arr.length-1);j>0;j--) {
			if(arr[j-1]<arr[j]) {
				box=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=box;
			}
		}
	}
	for(int i=0;i<9;i++) {
		System.out.println("arr["+i+"]="+arr[i]);
	}
	}	
	System.out.println("\n\n");
	
	//내 답안은 버블 정렬
	//선생님 답안(선택정렬)
	int[]arrT=  { 3 , 4 , 6 , 7 , 8 , 9 , 1 , 2 , 5 };
	Arrays.sort(arrT);
	System.out.println(Arrays.toString(arrT));
	
	//	for(int i=0; i<arrT.length;i++) {
//		for(int j=i+1; j<arrT.length;j++) {
//			if(arrT[i]>arrT[j]) {
//				int temp = arrT[i];
//				arrT[i]=arrT[j];
//				arrT[j]=temp;
//			}
//		}
//		System.out.println("arr["+i+"]="+arr[i]);
//	}
	
	} 
}
