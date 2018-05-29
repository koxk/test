package java08;

public class Ch7_02_student extends Ch7_02_people {
	int studentno;
	Ch7_02_student(String name, String ssn, int studentno) {
		super(name,ssn);//부모클래스의 해당 매개변수를 이용하는 생성자를 바로 호출
		this.studentno=studentno;
	}
	

}
