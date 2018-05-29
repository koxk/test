package java09;

public class carexam {

	public static void main(String[] args) {
		car car = new car(); //car 객체 생성
		//부모클래스 타입의 변수 선언
		tire tire = new tire("aaa",10);
		//자식클래스 타입의 변수 선언
		Hankooktire hktire = new Hankooktire("한국",10);
		
		tire=hktire;//자식을 부모에 대입
		hktire=(Hankooktire)tire;//부모를 자식에 대입
		
		for(int i=1; i<=5; i++) {  //car객체의 run()메소드 5번 반복실행
			int prolocation = car.run();
			
			switch(prolocation) {
			case 1:
				System.out.println("앞왼쪽 Hankooktire로 교체");
				car.flefttire = new Hankooktire("앞왼쪽",15);
				break; //앞왼쪽 교체
			case 2:
				System.out.println("앞오른쪽 kumhotire로 교체");
				car.frighttire = new kumhotire("앞오른쪽",13);
				break;	//앞오른쪽 교체
			case 3:
				System.out.println("뒤왼쪽 Hankooktire로 교체");
				car.blefttire = new Hankooktire("뒤왼쪽",14);
				break; //뒤왼쪽 펑크시 교체
			case 4:
				System.out.println("뒤오른쪽 kumhotire로 교체");
				car.brighttire = new kumhotire("뒤오른쪽",17);
				break; //뒤오른쪽펑크시 교체
			}
			System.out.println("-----------------------"); //1회전시 출력되는 내용구분
		}

	}

}
