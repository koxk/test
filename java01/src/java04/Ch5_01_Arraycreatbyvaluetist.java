package java04;

public class Ch5_01_Arraycreatbyvaluetist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score={83,90,87};
		
		//배열 값 접근(출력)
		System.out.println("score[0]의 값 :" + score[0]);
		System.out.println("score[1]의 값 :" + score[1]);
		System.out.println("score[2]의 값 :" + score[2]);
		//배열길이
		int length=score.length;
		System.out.println("배열 길이 length 의 변수 값:"+length);
		int sum=0;
		for(int i =0; i<=score.length;i++) {
			//sum=score[0]+score[1]+score[2]
			/*sum=sum+score[0];	
			sum=sum+score[1];
			sum=sum+score[2];*/
			
			System.out.println("총합 : "+ sum);
			double avg= sum/score.length;
		
			System.out.println("평균 : "+avg);
		}
	
	}	
	}

