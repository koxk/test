package java08;

public class acc {
	private String ano;
	private String own;
	private int bal;
	
	acc(){}
	public acc(String ano, String own, int bal) {
		this.ano = ano;
		this.own = own;
		this.bal = bal;
		
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwn() {
		return own;
	}

	public void setOwn(String own) {
		this.own = own;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
	
	
}
