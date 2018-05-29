package java03;

public class Ch4_11for {

	public static void main(String[] args) {
		//구구단 출력하기
		for(int i=2;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j +" * "+i+" = "+i*j);
				System.out.print("   ");
			}System.out.println(""); 
		}
	}

}
