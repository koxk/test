package java08;

	//cellphone의 자식클래스인 Ch7_01_DmbcellPhone
	//상속방법 : "자식클래스명 extends 부모클래스명"
	public class Ch7_01_DmbcellPhone extends Ch7_01_CellPhone{
		//필드선언
		int channel;
		
		//생성자
		Ch7_01_DmbcellPhone(String model, String color, int channel){
			this.model=model;
			this.color=color;
			this.channel=channel;
		}
		//메소드선언
		void turnOnDmb() {
			System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");		
		}
		void changechanneldmb(int channel) {
			this.channel=channel;
			System.out.println("채널 "+channel+"번으로 바꿉니다.");
		}
		void turnOffDmb() {
			System.out.println("DMB 방송 수신을 멈춥니다.");
		}
	}

