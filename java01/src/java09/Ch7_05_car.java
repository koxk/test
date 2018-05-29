package java09;

public class Ch7_05_car {
	//필드, 메소드, final 메소드
	String model;
	int speed;
	double zero;
	
	public void run() {
		System.out.println(model+"가 "+speed +"km/h 로 달립니다.");
	}
	public final void start() {
		System.out.println(model+"이 100km/h까지 도달하는데 걸리는 시간은 "+zero+"입니다.");
	}
	public void speedUp() {
		speed += 10;
	}
	//sptcar 클래스 선언 메소드, final 메소드 재정의
	
	
}
