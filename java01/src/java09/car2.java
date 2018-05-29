package java09;

public class car2 {
	String color;
	int speed;
	
	void speedup(int speed) {
		this.speed=speed+speed;
	}
	void speeddown(int speed) {
		this.speed=speed-speed;	
	}
	
	void colorset(String color) {
		this.color=color;
	}
}
