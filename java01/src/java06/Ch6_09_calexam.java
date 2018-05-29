package java06;
import java.util.Scanner;
public class Ch6_09_calexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch6_09_Cal cal = new Ch6_09_Cal();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(cal.areaRectangle(x));
		System.out.println(cal.rectangle(x, y));
		
		
	}
	
	

}
