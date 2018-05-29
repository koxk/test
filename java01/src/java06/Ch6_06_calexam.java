package java06;

public class Ch6_06_calexam {

	public static void main(String[] args) {
		//cal 객체 생성
		//powerOn 메소드 호출
		//plus 메소드 호출 및 호출 결과 출력
		//divide 메소드 호출 및 호출 결과 출력
		//powerOff 메소드 호출
		
		Ch6_06_cal cal = new Ch6_06_cal();
		cal.powerOn();
		System.out.println(cal.plus(12, 14));
		System.out.println(cal.divide(11, 24));
		cal.powerOff();
	}

}
