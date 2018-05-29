package java05;
import java.util.Scanner;
public class Ch5_10_array{

	public static void main(String[] args) {
		/*
		 * 문제
		 * 양수 5개를 입력 받아서 배열에 저장하고,
		 * 내림차순으로 정렬
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		int[] num = new int[5];
		int temp;
		for(int i=0;i<num.length;i++){
			num[i] = sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			for (int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					temp=num[j];
					num[j]=num[i];
					num[i]=temp;		
				}
			}
			}for(int i=0;i<num.length;i++) {
				System.out.print(num[i]+" ");
		
		}
	}

}
