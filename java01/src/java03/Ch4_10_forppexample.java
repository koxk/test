package java03;

public class Ch4_10_forppexample {

	public static void main(String[] args) {
		int sum=0;//합계를 담을 변수 sum
		
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합: ");
	}

}
