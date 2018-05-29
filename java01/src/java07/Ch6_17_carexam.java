package java07;

public class Ch6_17_carexam {

	public static void main(String[] args) {
		Ch6_17_car car = new Ch6_17_car();
		
		//car.speed=100;
		//setter를 호출하여 속도 값을 설정
		car.setSpeed(100);
		
		System.out.println("현재속도 : " + car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println("현재 속도 : "+ car.getSpeed());
	}

}
