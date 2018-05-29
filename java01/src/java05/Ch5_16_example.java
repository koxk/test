package java05;
import java.util.Scanner;
public class Ch5_16_example {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int stu = 0;
	int max = 0;
	int sum = 0;
	int[] score = null ;
	for(;;) {
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택>");
		int num = sc.nextInt();
		if(num==1) {
			System.out.print("학생수>");
			stu = sc.nextInt();
			score = new int[stu];

		}
		else if(num==2) {
			for(int i=0;i<stu;i++) {
				System.out.print((i+1)+"번째 학생 점수 : ");
				score[i] = sc.nextInt();
				sum += score[i];
				if(max<score[i]) max=score[i];
		}
		}
		else if(num==3) {
			for(int i=0;i<stu;i++) {
			System.out.println((i+1)+"번째 학생 점수 : "+ score[i]);
		}
		}
		else if(num==4) {
			double avg = sum/stu;
			System.out.println("최고점수: "+max);
			System.out.println("평균점수: "+avg);
		}
		else {
			System.out.print("종료..");
			break;
		}
		}
		}
	}

