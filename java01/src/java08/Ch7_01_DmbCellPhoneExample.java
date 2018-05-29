package java08;

public class Ch7_01_DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone에 대한 객체 생성
		Ch7_01_DmbcellPhone dmb = new Ch7_01_DmbcellPhone("갤럭시S9","오키드그레이",11);
		
		
		//생성한 객체의 model, color , channel 값을 각각 출력
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		System.out.println("채널: " + dmb.channel);
		//부모 클래스에서 선언한 메소드 각각 호출
		dmb.powerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.sendVoice("");
		dmb.receiveVoice("ㅎㅇ");
		dmb.hangup();
		//자식클래스에서 선언한 메소드 각각 호출
		dmb.turnOnDmb();
		dmb.changechanneldmb(7);
		dmb.turnOffDmb();


	}

}
