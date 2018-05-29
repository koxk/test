package java09;

public class car {
	//필드
	tire flefttire = new tire("앞왼쪽",6);
	tire frighttire = new tire("앞오른쪽",2);
	tire blefttire = new tire("뒤왼쪽",3);
	tire brighttire = new tire("뒤오른쪽",4);       // 4개의 타이어를 가짐
	//Tire 클래스 타입의 배열 변수를 선언해서 우변에 있는 내용을 각각 배열 변수에 대입
	tire[] tire = {
			new tire("앞왼쪽",6),
			new tire("앞오른쪽",2),
			new tire("뒤왼쪽",3),
			new tire("뒤오른쪽",4)
	}
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.}");
		if(flefttire.roll()==false) { stop(); return 1; }
		if(frighttire.roll()==false) { stop(); return 2; }
		if(blefttire.roll()==false) { stop(); return 3; }
		if(brighttire.roll()==false) { stop(); return 4; } //모든타이어를 1회 회전시키기 위해 
		return 0;								//tire개체의 roll()메소드 호출
	}											//false리턴 roll()이 있을경우 stop()메소드 호출하고 번호매김
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]"); // 펑크시 실행
	}
}
