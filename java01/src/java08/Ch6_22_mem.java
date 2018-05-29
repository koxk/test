package java08;

public class Ch6_22_mem {
	String id;
	String pw;
	
	
	Ch6_22_mem(){}
	boolean login(String id,String pw){
		if(id.equals("wnsghkim") & pw.equals("1234")) {
			return true;}
		else {
			return false;
		}
	}
	void logout(String id) {
		this.id = id;
		System.out.println(this.id+"님 로그아웃 되었습니다.");
	}
}
