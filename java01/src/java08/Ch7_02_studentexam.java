package java08;

public class Ch7_02_studentexam {

	public static void main(String[] args) {
		//객체생성
		Ch7_02_student stu = new Ch7_02_student("김준호","123456-1234567",10);
		
		//부모클래스의 필드
		System.out.println(stu.name);
		System.out.println(stu.ssn);
		
		//자식클래스의 필드
		System.out.println(stu.studentno);

	}

}
