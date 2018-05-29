package java02;

import java.util.Scanner;

public class scannerExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("초를 입력하세요");
		int second = scan.nextInt();
		int hour;
		int mi;
		int sec;
		hour = second/3600;
		mi =(second%3600)/60;
		sec =(second%3600)%60;
		System.out.println(second+"초는 " + hour + "시간 " + mi + "분 " + sec + "초입니다.");
	}

}
