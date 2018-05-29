package java05;
import java.util.Scanner;
public class Ch5_13_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] words= {{"chair","의자"},
							{"desk","책상"},
							{"water","물"},
							{"monitor","모니터"},
							{"mouse","마우스"}};
		String O = "정답입니다.";
		int Onum = 0;
		String X = "틀렸습니다.";
		for(int i=0;i<words.length;i++) {
			System.out.println("문제"+(i+1)+". "+words[i][0]+"의 뜻을 입력하세요.");
			String re=sc.next();
			if(re.equals(words[i][1])) {
				Onum++;
				System.out.println(O);
			}else { System.out.println(X);
			}
		}double per=(100/words.length)*Onum;
		System.out.println("총 "+Onum+"개가 정답입니다.");
		System.out.println("정답률은 "+per+"%입니다.");
	}
}
