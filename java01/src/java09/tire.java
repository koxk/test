package java09;

public class tire {
	//필드
	public int maxRota;  //최대 회전수
	public int acclateRota;  //누적 회전수
	public String location;  //타이어의 위치
	
	//생성자
	public tire(String location, int maxRota) {
		this.location=location;
		this.maxRota=maxRota;
	}
	
	//메소드
	public boolean roll() {
		++acclateRota; // 누적 회전수 1증가
		if(acclateRota<maxRota) { // 정상회전 일 경우 실행
			System.out.println(location + " Tire 수명: "+ (maxRota-acclateRota)+"회");
			return true;
		} else { // 펑크 일 경우 실행
			System.out.println("*** "+location + " Tire 펑크 ***");
			return false;
		}
	}
}
