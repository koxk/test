package java08;

public class Ch6_24_acc {
	int bal;
	static final int min_bal=0;
	static final int max_bal=1000000;

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		if(min_bal<=bal && max_bal>=bal) {
		this.bal = bal;
		}else {
			return;
		}
	}
}
