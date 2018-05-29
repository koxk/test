package java06;

public class Ch_07_carexam {

	public static void main(String[] args) {
		Ch6_07_car car = new Ch6_07_car();
		//setGas 메소드 호출. 매개값은 5
		car.setGas(5);

		boolean gasState = car.isLeftGas();
		System.out.println(car.gas);
		
		if(gasState) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입해주세요");
		}
	}

}
