package java06;

public class Ch6_05_carexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 기본 생성자를 이용한 객체 생성하여 필드값 출력
		Ch6_05_car car = new Ch6_05_car();
		System.out.println(car.company+car.model+car.color+car.maxSpeed);
		//2.model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		Ch6_05_car car1 = new Ch6_05_car("BMW");
		System.out.println(car1.company+car1.model+car1.color+car1.maxSpeed);
		//3.model,color매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		Ch6_05_car car2 = new Ch6_05_car("BMW","흰색");
		System.out.println(car2.company+car2.model+car2.color+car2.maxSpeed);		
		//4.model,color,maxSpeed 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		Ch6_05_car car3 = new Ch6_05_car("BMW","흰색",380);
		System.out.println(car3.company+car3.model+car3.color+car3.maxSpeed);
	}

}
