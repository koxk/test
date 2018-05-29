package java09;

public class Ch7_07_A {
	/*
	 * A클래스
	 * 접근제한자가 protected인 필드, 생성자, 메소드 선언
	 * 
	 * B클래스
	 * 메소드를 선언해서
	 * a클래스 객체만들고  a클래스의 필드, 메소드에 접근가능한지 확인
	 * 
	 * C클래스는 다른 패키지에 선언
	 * A클래스 포함시키고
	 * a클래스 객체만들고  a클래스의 필드, 메소드에 접근가능한지 학인
	 * 
	 * D클래스는 C클래스와 동일한 패키지에 선언
	 * A클래스 포함시키고  A클래스 상속받고
	 * 생성자를 선언해서 부모 클래스의 필드와 메소드에 접근가능한지 확인
	 */
	
	protected String name;
	protected int stuno;
	
	protected Ch7_07_A(String name, int stuno){
		this.name=name;
		this.stuno=stuno;
	}
	
	protected void student() {
		System.out.println(name+"의 학번은 "+stuno+"번 입니다.");
	}
}
