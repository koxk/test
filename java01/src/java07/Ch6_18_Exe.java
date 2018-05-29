package java07;

public class Ch6_18_Exe {
	
	private String name;
	private int assScore;
	private int examScore;
	private int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("이름 : " +this.name);
	}
	public int getAssScore() {
		return assScore;
	}
	public void setAssScore(int assScore) {
		this.assScore = assScore;
		System.out.println("과제 점수 : " +this.assScore);
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
		System.out.println("시험 점수 : " +this.examScore);
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int Grade) {
		this.grade = grade;
		grade = (assScore+examScore)/2;
		if(grade>=90) {
			System.out.println("학점 : A");
		}else {
			System.out.println("학점 : B");
		}System.out.println("");
	}
	
	/*void result() {
		System.out.println("이름 : "+name);
		System.out.println("과제점수 : "+assScore);
		System.out.println("시험점수 : "+examScore);
		double avg = (assScore+examScore)/2;
		if(avg>=90) {
			System.out.println("학점 : A");
		}else {
			System.out.println("학점 : B");
		}System.out.println("");
		
			
	}*/
}
	
	
	
	
