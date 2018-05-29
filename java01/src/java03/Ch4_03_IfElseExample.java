package java03;
import java.util.Scanner;
public class Ch4_03_IfElseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90 & score<=100) {
			System.out.print("점수가 90~100입니다.");
			System.out.print("등급은 A입니다.");
		}
		else if(score>=80) {
			System.out.print("점수가 80~89입니다.");
			System.out.print("등급은 B입니다.");
		}
		else if(score>=70) {
			System.out.print("점수가 70~79입니다.");
			System.out.print("등급은 C입니다.");
		}
		else if(score>=60) {
			System.out.print("점수가 60~69입니다.");
			System.out.print("등급은 A입니다.");
		}
		else {
			System.out.print("점수가 60미만 입니다.");
			System.out.print("재수강각FFFFFF");
		}
		
				
	}

}
