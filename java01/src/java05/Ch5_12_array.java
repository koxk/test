package java05;

public class Ch5_12_array {

	public static void main(String[] args) {
		double score[][]= {{3.3, 3.4},{3.5,3.8},{4.2,4.3},{3.9,4.0}};
		double sum=0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
			}			
		}double avg=sum/(score.length*score[0].length);
		System.out.println("평균 학점은 : "+ avg + "입니다.");
	}
}
