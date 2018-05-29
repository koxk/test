package java06;
//method overloading p.232
public class Ch6_09_Cal {
	//정사각형의 넓이를 구하는 메소드
	//메소드 이름: areaRectangle
	 int areaRectangle(int x) {
		 int result = x*x;
		 return result;
	 }
	//직사각형의 넓이를 구하는 메소드
	 int rectangle(int x, int y) {
		 int result = x*y;
		 return result;
	 }
}	


//main 클래스의 실행 내용
/*
	객체 생성에서
	정사각형 넓이 구하는 메소드 호출하고 결과 출력
	직사각형 넓이 구하는 메소드 호출하고 결과 출력
*/