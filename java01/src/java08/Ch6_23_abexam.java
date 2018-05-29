package java08;
import java.util.Scanner;
public class Ch6_23_abexam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ch6_23_ab ab = new Ch6_23_ab();
		for(;;){
			System.out.println("===================");
			System.out.println("수행할 내용을 입력해주세요.");
			System.out.println("1.두점 사이이 거리 구하기");
			System.out.println("2.절대값 구하기");
			System.out.println("===================");
			System.out.print("선택>>");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("첫번째 x좌표");
				ab.x1= sc.nextInt();
				System.out.print("첫번째 y좌표");
				ab.y1= sc.nextInt();
				System.out.print("두번째 x좌표");
				ab.x2= sc.nextInt();
				System.out.print("두번째 y좌표");
				ab.y2= sc.nextInt();
				System.out.println("두 점 사이의 거리는 "+ab.ran+"입니다.");
			}else {
				System.out.println("정수를 입력하세요.");
				ab.num = sc.nextInt();
				System.out.println("입력하신 정수의 절대값은 "+ab.av+"입니다.");
			}
		}

	}

}
