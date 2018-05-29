package java04;
import java.util.Scanner;
public class Ch4_22_Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bal = 1000;
		for(;;) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			int cl = sc.nextInt();
			if(cl==1) {
				System.out.print("예금액>");
				int ca1 = sc.nextInt();
				bal += ca1;
				System.out.println("현재 잔액은 "+bal+"입니다.");
			}
			else if (cl==2) {
				System.out.print("출금액>");
				int ca1 = sc.nextInt();
				bal -= ca1;
				if(bal>=0) {
					System.out.println("현재 잔액은 "+bal+"입니다.");
				}
				else {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재 잔액은 "+bal+"입니다.");
				}
			}
			else if (cl==3) {
				System.out.print("잔고>");
				System.out.println("현재 잔액은 "+bal+"입니다.");
			}
			else {
				System.out.print("종료..");
				break;
			}
		}

	}

}
