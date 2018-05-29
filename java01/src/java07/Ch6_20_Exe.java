package java07;

public class Ch6_20_Exe {
	private String name;
	private int num;
	private int bal = 0;
	int det;
	int drw;
	
	Ch6_20_Exe(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public void det(int det) {
		this.det = det;
		bal += det;
	}
	public void drw(int drw) {
		this.drw = drw;
		bal -= drw;
	}
	public void result() {
		System.out.println("예금주 이름 : "+this.name);
		System.out.println("계좌 번호 : "+this.num);
		System.out.println("잔고 : "+this.bal);
	}
}
