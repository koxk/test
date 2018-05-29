package java07;

public class Ch6_10_car {
	String model;	
	Ch6_10_car(String model){
		this.model = model;
	}
	
	void run(){
		for(int i=10;i<=50;i+=10) {
			System.out.println(this.model+"가 달립니다.(시속:"+(i)+"km/h)");
		}
		}
	}
