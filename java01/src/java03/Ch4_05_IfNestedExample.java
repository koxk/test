package java03;
import java.util.Scanner;
public class Ch4_05_IfNestedExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade;
		if(score>=0 & score<=100) {
		if(score>=90) {
			if(score>=95){
				grade="A+";
			}else {
				grade="A";
			}
		}
		else if(score>=80) {
			if(score>=85){
				grade="B+";
			}else {
				grade="B";
			}
		}
		else if(score>=70) {
			if(score>=75){
				grade="C+";
			}else {
				grade="C";
			}
		}
		else if(score>=60) {
			if(score>=65){
				grade="C+";
			}else {
				grade="C";
			}
		}
		else {
			grade="F";
		}
		System.out.println("당신의 학점은 "+grade+" 입니다.");
		}

	}

}
