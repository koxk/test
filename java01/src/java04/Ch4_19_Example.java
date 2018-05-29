package java04;

public class Ch4_19_Example {

	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		while(true) {
			i++;
			if (i%2==0) {
				sum +=-i;
			}else {
			sum +=i;
			}
		if(sum>=100) {
			System.out.println(i); break;
		}
		}
	}

}
