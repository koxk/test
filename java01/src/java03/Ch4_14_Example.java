package java03;
import java.util.Scanner;
public class Ch4_14_Example {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String me;
	
	do {System.out.println(">");
		String me1 = sc.next();
		me = me1;
		System.out.println(me1);}
	while (!me.equals("q"));
		System.out.println("");
		System.out.println("프로그램종료");
}
}
