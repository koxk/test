package java04;
import java.util.Scanner;
public class Ch4_21_Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		int tr = 0;
		for(;;) {
			tr++;
			System.out.print("1과 100사이의 숫자를 입력하세요 :");
			int num1 = sc.nextInt();
			if(num<num1) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else if(num>num1) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else {
				System.out.println("정답!");
				System.out.println("시도 횟수는 "+tr+"번입니다.");
				break;
			}
		}
	}

}
