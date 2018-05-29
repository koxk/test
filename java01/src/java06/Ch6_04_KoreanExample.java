package java06;

public class Ch6_04_KoreanExample {

	public static void main(String[] args) {
		//본인의 이름과 주민번호 앞자리로 k1, k2 객체를 각각 생성해서 필드값을 출력해보세요.
		Ch6_04_Korean k1 = new Ch6_04_Korean("김준호","960828");
		System.out.print(k1.name+" ");
		System.out.println(k1.ssn);
		
		Ch6_04_Korean k2 = new Ch6_04_Korean("김준호","960828");
		System.out.print(k2.name+" ");
		System.out.println(k2.ssn);
		
	}

}
