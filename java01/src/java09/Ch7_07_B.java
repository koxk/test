package java09;

public class Ch7_07_B {
	String homework;
		
	public void project(){
		Ch7_07_A a = new Ch7_07_A("조준인",40);
		a.name = "조준형";
		
		a.student();
		
		System.out.println(a.name+"이 발표할 과제는 "+homework+"입니다.");
	}
}
