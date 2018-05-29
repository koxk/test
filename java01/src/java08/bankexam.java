package java08;
import java.util.Scanner;
public class bankexam {
		private static acc[] acc = new acc[100];
		private static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			boolean run = true;
			for(;;) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.print("선택>> ");
				int num = sc.nextInt();
				if(num==1) {
					creacc();
				}else if(num==2){
					acclist();
				}else if(num==3){
					dpt();				
				}else if(num==4) {
					widrw();
				}else {
					System.out.println("프로그램 종료");
					break;
				}
					
			}
			
	}
	private static void creacc() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌생성");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String own = sc.next();
		System.out.print("초기 입금액 : ");
		int bal = sc.nextInt();
		acc bank = new acc(ano,own,bal);
		for(int i=0;i<acc.length;i++) {
			if(acc[i]==null) { acc[i]=bank;break;
		}}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	private static void acclist() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌목록");
		System.out.println("ㅡㅡㅡㅡㅡ");
		for(int i=0;i<100;i++) {
			System.out.println(acc[i].getAno()+" "+acc[i].getOwn()+" "+acc[i].getBal());
			if(acc[i+1]==null)break;
		}
	}
	private static void dpt() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌목록");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.print("계좌번호 : ");
		
		String ano = sc.next();
		int i;
		for(i=0;i<acc.length;i++) {
			if(acc[i].getAno().equals(ano)) break;}
		System.out.print("예금액 : ");
		int bal=sc.nextInt();
		int bal1 = acc[i].getBal()+bal;
		acc[i].setBal(bal1);
		System.out.println("결과 : 예금이 성공되었습니다.");
		
	}

	private static void widrw() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌목록");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.print("계좌번호 : ");
		int i;
		for(i=0;i<acc.length;i++) {
		String ano = sc.next();
		if(acc[i].getAno().equals(ano))break;}
		System.out.print("출금액 : ");
		int bal=sc.nextInt();
		int bal1 = acc[i].getBal()-bal;
		acc[i].setBal(bal1);
		System.out.println("결과 : 출금이 성공되었습니다.");
		}
	private static acc findacc(String ano) {
		acc account = null;
		for(int i=0;i<acc.length;i++) {
			if(acc[i]!=null) {
				String dbAno = acc[i].getAno();
				if(dbAno.equals(ano)) {
					account = acc[i];
					break;
					}
				}
			}
		return account;
	}
}
