package java03;
import java.util.Scanner;
public class Ch4_18_ForExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
			for(int i=1;i<=num;i++) {
				if(i%2!=0 && i%3!=0) {
					sum += i;
				}
			}System.out.println(sum);
		
	}
	}


