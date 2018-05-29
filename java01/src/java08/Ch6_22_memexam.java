package java08;
import java.util.Scanner;
public class Ch6_22_memexam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ch6_22_mem mem = new Ch6_22_mem();
		while(true) {
			System.out.println("====================");
			System.out.println("수행할 서비스를 선택해주세요.");
			System.out.println("1.로그인   ||  2.로그아웃");
			System.out.println("====================");
			System.out.print(">>");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("아이디를 입력하세요 :");
				mem.id = sc.next();
				System.out.print("비밀번호를 입력하세요 :");
				mem.pw = sc.next();
				boolean result = mem.login(mem.id,mem.pw);
				if(result) {
					System.out.println(mem.id+"님 로그인 되었습니다.");
					}else {
						System.out.println("id 또는 password가 올바르지 않습니다.");
					}
				break;
			case 2:
				mem.logout(mem.id);

	}}
	}

}
