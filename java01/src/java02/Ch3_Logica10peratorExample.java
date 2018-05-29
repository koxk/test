package java02;
//논리연산자
/*논리연산은 true,false를 가지고 연산을 수행함
AND연산(&&)
A%%B: A,B 모두 true인 결과는 true 하나라도 false 인 결과는 false
OR연산: (!!)
A||B:  A,B 둘중 하나라도  true면 결과는 ture 둘다 false면 결과는 false
NOT연산(!)
true -> false , false -> true*/

public class Ch3_Logica10peratorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) && (charCode<=90) ) {
			System.out.println("대문자 이군요");
		}
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		}
	
		if( (charCode<48) && (charCode>57) ) {
			System.out.println("0~9숫자 이군요");
		}
		int value = 6;
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2또는 3의 배수");
		}
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2또는 3의 배수");
		}
	}
}

