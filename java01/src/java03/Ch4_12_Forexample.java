package java03;
import java.util.Scanner;
public class Ch4_12_Forexample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int sum= 0;
		for(int i=n;i<=n2;i++) {
			sum = sum += i;
			if(i==n2) {
			System.out.print(i+"=");
			}else {
				System.out.print(i+"+");
			}
		}System.out.println(sum);

	}

}
