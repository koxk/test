package java08;

public class Ch6_21_stu {
	String name;
	int[] score;
	int sum = 0;
	int rank = 0;
	Ch6_21_stu() {}

	public void name(String name) {
		this.name = name;
	}

	public void score(int[] score) {
		this.score = score;
			sum+=(score[0]+score[1]+score[2]);
	}
	public void result() {
		double avg = sum/3;
		System.out.print(this.name+"의 평균은 : "+avg+"점 입니다.");
	}
}
