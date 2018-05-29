package java04;

public class Ch4_20_Example {

	public static void main(String[] args) {
		int x,y;
		for (x=0;x<=10;x++) {
			for (y=0;y<=10;y++) {
				if((2*x)+(4*y)==10) {
					System.out.print("x = "+x+" y = "+y);
					System.out.println("");
				}
			}
		}
	}

}
