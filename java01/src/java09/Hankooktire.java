package java09;
//Hankooktire를 tire에 상속시킴
public class Hankooktire extends tire {
	//필드
	
	//생성자
	public Hankooktire(String location, int maxRota) {
		super(location, maxRota); //tire의 생성자를 가져옴
	}
	
	//메소드
	@Override
	public boolean roll() {
		++acclateRota; // 누적 회전수 1증가
		if(acclateRota<maxRota) { // 정상회전 일 경우 실행
			System.out.println(location + " HankookTire 수명: "+ (maxRota-acclateRota)+"회");
			return true;
		} else { // 펑크 일 경우 실행
			System.out.println("*** "+location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
