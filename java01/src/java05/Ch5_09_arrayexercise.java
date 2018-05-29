package java05;
import java.util.Scanner;
public class Ch5_09_arrayexercise {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 양수 5개를 입력 받아서 배열에 저장하고,
		 * 입력 받은 수 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		int[] num = new int[5];
		int max = 0;
		for(int i=0;i<num.length;i++){
			num[i] = sc.nextInt();
			if(max<num[i]) {max=num[i];}
		}System.out.println("가장 큰수는 "+max+"입니다.");
		
		
	}

}
