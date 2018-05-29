package java08;

public class Ch6_24_accexam {

	public static void main(String[] args) {
		Ch6_24_acc acc = new Ch6_24_acc();
		
		acc.setBal(10000);
		System.out.println("현재 잔고: "+acc.getBal());
		
		acc.setBal(-100);
		System.out.println("현재 잔고: "+acc.getBal());
		
		acc.setBal(2000000);
		System.out.println("현재 잔고: "+acc.getBal());
		
		acc.setBal(300000);
		System.out.println("현재 잔고: "+acc.getBal());
		
		

	}

}
