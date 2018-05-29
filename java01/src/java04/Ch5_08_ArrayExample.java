package java04;
import java.util.Scanner;
public class Ch5_08_ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] be = new int[3];
		int sum = 0;
		for(int i=0;i<3;i++) {
			be[i] = sc.nextInt();
			sum+=be[i];
		}
		double avg = sum/be.length;
		System.out.println("총 합 : "+sum+" 평균 값 : "+avg);

	}

}
