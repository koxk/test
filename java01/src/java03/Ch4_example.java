package java03;
import java.util.Scanner;
public class Ch4_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int grade = sc.nextInt();
		if(score>=0 & score<=100) {
		if(score>=60) {
			if(grade==4 & score>=70){
				System.out.println("합격");
			}else if(grade==4 & score<70) {
				System.out.println("불합격");
			}else {
			System.out.println("합격");
			}
		}
		else {
			System.out.println("불합격");
		}
		}
	}

}
