package java08;
import java.util.Scanner;
public class Ch6_21_stuExam {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Ch6_21_stu stud1 = new Ch6_21_stu();
	stud1.name = sc.next();
	stud1.score[0] = sc.nextInt();
	stud1.score[1] = sc.nextInt();
	stud1.score[2] = sc.nextInt();
	stud1.result();
	
	Ch6_21_stu stud2 = new Ch6_21_stu();
	stud2.name = sc.next();
	stud2.score[0] = sc.nextInt();
	stud2.score[1] = sc.nextInt();
	stud2.score[2] = sc.nextInt();
	stud2.result();
	
	Ch6_21_stu stud3 = new Ch6_21_stu();
	stud3.name = sc.next();
	stud3.score[0] = sc.nextInt();
	stud3.score[1] = sc.nextInt();
	stud3.score[2] = sc.nextInt();
	stud3.result();

}
}
