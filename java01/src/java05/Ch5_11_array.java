package java05;
import java.util.Scanner;
public class Ch5_11_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		/*int num = sc.nextInt();
		int num1,num2,num3;
		num1=num%500;
		num2=num1%100;
		num3=num2%50;
		System.out.println("500원 : "+(num/500)+"개");
		System.out.println("100원 : "+(num1/100)+"개");
		System.out.println("50원 : "+(num2/50)+"개");
		System.out.println("10원 : "+(num3/10)+"개");*/
		/*int num = sc.nextInt();
		int[] ca = new int[3];
		ca[0]=num%500;
		ca[1]=ca[0]%100;
		ca[2]=ca[1]%50;
		System.out.println("500원 : "+(num/500)+"개");
		System.out.println("100원 : "+(ca[0]/100)+"개");
		System.out.println("50원 : "+(ca[1]/50)+"개");
		System.out.println("10원 : "+(ca[2]/10)+"개");*/
		int[] coin = {500,100,50,10};
		int ch=sc.nextInt();
		for(int i=0;i<coin.length;i++) {
			int coin1=ch/coin[i];
			System.out.println(coin[i]+"원 동전: "+coin1+"개");
			ch=ch%coin[i];
		}	
	}
}
