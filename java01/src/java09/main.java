package java09;

public class main {
	
	public static void main(String[] args) {
	sedan sedan = new sedan();
	truck truck = new truck();
	
	sedan.speedup(200);
	truck.speedup(100);
	sedan.seatset(5);
	truck.loadset(5);
	sedan.colorset("빨간색");
	truck.colorset("검은색");
	
	System.out.println(sedan.color+" 승용차의 속도는 "+sedan.speed+"km/h이고 좌석수는 "+sedan.seat+"개 입니다.");
	System.out.println(truck.color+" 트럭의 속도는 "+truck.speed+"km/h이고 적재량은 "+truck.load+"개 입니다.");
	}
}
