package java08;

public class Ch7_03_comexam {

	public static void main(String[] args) {
		int r=10;
		
		//부모클래스의 메소드 호출
		Ch7_03_cal cal = new Ch7_03_cal();
		System.out.println("부모클래스 메소드 호출: "+cal.areaCircle(r));
	
		//자식클래스에서 재정의된 메소드 호출
		Ch7_03_com com = new Ch7_03_com();
		System.out.println("자식클래스 메소드 호출: "+com.areaCircle(r));
	}

}
