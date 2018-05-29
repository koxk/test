package java07;

public class Ch6_12_sing {
	private static Ch6_12_sing singleton = new Ch6_12_sing();
	
	private Ch6_12_sing() {
		
	}
	static Ch6_12_sing getinstance() {
		return singleton;
	}
}
