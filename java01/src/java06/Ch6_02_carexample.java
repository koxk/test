package java06;

public class Ch6_02_carexample {

	public static void main(String[] args) {
		//Car 클래스 객체 선언
		//Car 클래스에서 선언한 필드 값을 출력해보세요.
		Ch6_02_car cl = new Ch6_02_car();
		//필드값 출력
		System.out.println("car 클래스의 company 필드값 : "+ cl.company);
		System.out.println("car 클래스의 model 필드값 : "+ cl.model);
		System.out.println("car 클래스의 color 필드값 : "+ cl.color);
		System.out.println("car 클래스의 maxspeed 필드값 : "+ cl.maxSpeed);
		System.out.println("car 클래스의 speed 필드값 : "+ cl.speed);
		/*//필드값 변경
		int number=10;
		number=30;*/
		cl.speed=60;
		System.out.println("car 클래스의 speed 필드값 : "+ cl.speed);
	}   

}
