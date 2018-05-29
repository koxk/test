package java09;

public class Ch7_05_sptcar extends Ch7_05_car {
	//speedUp재정의
	@Override
	public void speedUp() {
		speed += 10;
	}
	//stop 메소드 재정의
	@Override
	/*public void start() {
		System.out.println(model+"이 100km/h까지 도달하는데 걸리는 시간은 "+zero+"입니다.");
	}*/
}
