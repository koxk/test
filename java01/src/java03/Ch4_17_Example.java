package java03;
import java.util.Scanner;
public class Ch4_17_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			sum += num;
			if(num==0)break;
			n++;
		}double avg = sum/n;
		System.out.println("수의 개수는 "+n+"개이며 평균은"+avg+"입니다.");
	}

}
